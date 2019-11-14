package com.invicta.member.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invicta.member.dto.CulturalTypeDto;

import com.invicta.member.entity.CulturalType;
import com.invicta.member.mapper.CulturalTypeMapper;

@RestController
@RequestMapping("/Api/")
public class CulturalTypeController {
	
	private static Logger logger = LogManager.getLogger(CulturalTypeMapper.class);
	
	@Autowired
	private CulturalTypeMapper culturalTypeMapper;
	
	
	@PostMapping("/savecultype")
	public CulturalType culturalType(@RequestBody CulturalTypeDto culturalTypeDto) {
		try {
			return culturalTypeMapper.saveCulturalType(culturalTypeDto);
		} catch (Exception e) {
			logger.info("culturalType Controller -> Not succesfully", e.getMessage());
		}
		
		return null;
	}
	
	@GetMapping("/listcultype")
	public List<CulturalTypeDto> getAllCulturalType() {
		logger.info(" CulturalType ->  CulturalType listviewed ");
		return culturalTypeMapper.getAllCulturalType();
	}
	
	@GetMapping("/culturalType/{culturalTypeId}")
	public CulturalTypeDto getCulturalTypeById(@PathVariable(name = "culturalTypeId") long culturalTypeId) {
		return culturalTypeMapper.getCulturalTypeById(culturalTypeId);
	}

	@DeleteMapping("/culturalType/{culturalTypeId}")
	public ResponseEntity<String> deleteCulturalType(@PathVariable("culturalTypeId") Long culturalTypeId) {
		if (culturalTypeMapper.getCulturalTypeById(culturalTypeId) != null) {
			if (culturalTypeMapper.deleteCulturalType(culturalTypeId) == null) {
				return new ResponseEntity<>("successfully deleted", HttpStatus.OK);
			} else {
				return new ResponseEntity<String>("not deleted", HttpStatus.BAD_REQUEST);
			}
		}
		return new ResponseEntity<>("faild", HttpStatus.BAD_REQUEST);
	}

	@PutMapping("/culturalType")
	public ResponseEntity<String> updateCulturalType(@RequestBody CulturalTypeDto culturalTypeDto) {
		if (culturalTypeMapper.updateCulturalType(culturalTypeDto) != null) {
			return new ResponseEntity<>("sucessfully update", HttpStatus.OK);

		}
		return new ResponseEntity<String>("update faild", HttpStatus.BAD_REQUEST);

	}

}

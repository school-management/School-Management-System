package com.invicta.member.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

}

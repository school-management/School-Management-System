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

import com.invicta.member.dto.CulturalActivityDto;
import com.invicta.member.entity.CulturalActivity;
import com.invicta.member.mapper.CulturalActivityMapper;



@RestController
@RequestMapping("/Api/")
public class CulturalActivityController {
	
	@Autowired
	private CulturalActivityMapper culturalActivityMapper;

	private static Logger logger = LogManager.getLogger(CulturalActivityMapper.class);

	@PostMapping("/saveculact")
	public CulturalActivity saveCulturalActivity(@RequestBody CulturalActivityDto culturalActivityDto) {
		try {
			return culturalActivityMapper.saveCulturalActivity(culturalActivityDto);
		} catch (Exception e) {
			logger.info("culturalActivity Controller -> Not succesfully", e.getMessage());
		}

		return null;
	}

	@GetMapping("/listculact")
	public List<CulturalActivityDto> getCulturalActivity() {
		logger.info("CulturalActivity Controller ->  CulturalActivity listviewed ");
		return culturalActivityMapper.listCulturalActivity();
	}
	@GetMapping("/culact/{culactId}")
	public CulturalActivityDto getCulturalActivityById(@PathVariable(name="culactId") Long culturalActivityId) {
		return culturalActivityMapper.getCulturalActivityById(culturalActivityId);
	}
	
	@DeleteMapping("/culact/{culactId}")
	public ResponseEntity<String> deleteCulturalActivity(@PathVariable("culactId") Long culturalActivityId){
		if(culturalActivityMapper.getCulturalActivityById(culturalActivityId) != null) {
			if(culturalActivityMapper.deleteCulturalActivity(culturalActivityId)==null) {
				return new ResponseEntity<>("sucessfully delete",HttpStatus.OK);
			}else {
				return new ResponseEntity<String>("not delete",HttpStatus.BAD_REQUEST);
			}
		}
		return new ResponseEntity<>("faild",HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("/culact")
	public ResponseEntity<String> updateCulturalActivity(@RequestBody CulturalActivityDto culturalActivityDto){
		if(culturalActivityMapper.updateCulturalActivity(culturalActivityDto) != null) {
			return new ResponseEntity<String>("sucessfully update",HttpStatus.OK);
		}
		return new ResponseEntity<String>("update faild",HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/culact/name/{name}")
	public List<CulturalActivityDto> getCulturalActivityByName(@PathVariable("name") String name){
		return culturalActivityMapper.getCulturalActivityByName(name); 
	}
}

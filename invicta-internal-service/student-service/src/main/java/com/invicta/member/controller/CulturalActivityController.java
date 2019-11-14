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

}

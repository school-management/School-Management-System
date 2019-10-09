package com.invicta.member.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invicta.member.dto.GradeDto;
import com.invicta.member.entity.Grade;
import com.invicta.member.mapper.GradeMapper;

@RestController
public class GradeController {
	
	@Autowired
	private GradeMapper gradeMapper;
	
	private static Logger logger = LogManager.getLogger(GradeMapper.class);
	
	@PostMapping("/savegrade")
	public Grade savedGrade(@RequestBody GradeDto gradeDto) {
		try {
			return gradeMapper.saveGrade(gradeDto);
		}catch(Exception e) {
			logger.info("Grade Controller -> New Grade Create succesfully",e.getMessage());
		}
		return null;
	}

}

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

import com.invicta.member.dto.DivisionDto;
import com.invicta.member.entity.Division;
import com.invicta.member.mapper.DivisionMapper;

@RestController
@RequestMapping("/division")
public class DivisionController {
	
	@Autowired
	private DivisionMapper divisionMapper;
	
	private static Logger logger = LogManager.getLogger(DivisionMapper.class);
	
	@PostMapping("/save")
	public Division saveDivision(@RequestBody DivisionDto divisionDto) {
		try {
			return divisionMapper.saveDivision(divisionDto);
		}catch(Exception e) {
			logger.info("Division Controller -> Not succesfully",e.getMessage());
		}
		
		return null;
	}
	
	@GetMapping("/list")
	public List<DivisionDto> getDivision(){
		logger.info("Division Controller ->  Division listviewed ");
		return divisionMapper.listDivision();
	}
	
}

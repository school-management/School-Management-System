package com.invicta.student.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invicta.student.dto.ExtraCurricularDto;
import com.invicta.student.entity.ExtraCurricular;
import com.invicta.student.mapper.ExtraCurricularMapper;



@RestController
@RequestMapping("/Api/")
public class ExtraCurricularController {
	
private static Logger logger = LogManager.getLogger(ExtraCurricularMapper.class);
	
	@Autowired
	private ExtraCurricularMapper extraCurricularMapper;
	
	
	@PostMapping("/saveextracurricular")
	public ExtraCurricular saveExtraCurricular(@RequestBody ExtraCurricularDto extraCurricularDto) {
		try {
			return extraCurricularMapper.saveExtraCurricular(extraCurricularDto);
		} catch (Exception e) {
			logger.info("ExtraCurricular Controller -> Not succesfully", e.getMessage());
		}
		
		return null;
	}
	
	@GetMapping("/listextracurricular")
	public List<ExtraCurricularDto> getAllExtraCurricular() {
		logger.info(" ExtraCurricular ->  ExtraCurricular listviewed ");
		return extraCurricularMapper.listExtraCurricular();
	}

}

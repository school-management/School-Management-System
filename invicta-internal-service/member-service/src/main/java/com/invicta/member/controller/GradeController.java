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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invicta.member.dto.GradeDto;
import com.invicta.member.entity.Grade;
import com.invicta.member.mapper.GradeMapper;

@RestController
//@RequestMapping("/gradeapi")
public class GradeController {
	
	@Autowired
	private GradeMapper gradeMapper;
	
	private static Logger logger = LogManager.getLogger(GradeMapper.class);
	
	@PostMapping("/gradesave")
	public Grade savedGrade(@RequestBody GradeDto gradeDto) {
		try {
			return gradeMapper.saveGrade(gradeDto);
		}catch(Exception e) {
			logger.info("Grade Controller -> New Grade Create succesfully",e.getMessage());
		}
		return null;
	}
	@GetMapping("/grade")
	public List<GradeDto> getGrade(){
		logger.info("Grade Controller ->  Grade listviewed ");
		return gradeMapper.listGrade();
		
	}
	
	@GetMapping("/grade/{gradeId}")
	public GradeDto getGradeById(@PathVariable(name="gradeId") Long gradeId) {
		return gradeMapper.getGradeById(gradeId);
	}
	
	@DeleteMapping("/grade/{gradeId}")
	public ResponseEntity<String> deleteGrade(@PathVariable("gradeId") Long gradeId){
		if(gradeMapper.getGradeById(gradeId)!=null) {
			if(gradeMapper.deleteGrade(gradeId)==null) {
				return new ResponseEntity<>("successfully deleted",HttpStatus.OK);
			}else {
				return new ResponseEntity<String>("not deleted",HttpStatus.BAD_REQUEST);
			}
		}
		return new ResponseEntity<>("faild",HttpStatus.BAD_REQUEST);
		
	}

}

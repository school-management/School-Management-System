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

import com.invicta.member.dto.DivisionDto;
import com.invicta.member.entity.Division;
import com.invicta.member.mapper.DivisionMapper;
import com.invicta.member.repository.DivisionRepository;

@RestController
//@RequestMapping("/division")
public class DivisionController {
	
	@Autowired
	private DivisionMapper divisionMapper;
	
	@Autowired
	private DivisionRepository divisionRepository;
	
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
	
	@GetMapping("division/{divisionId}")
	public DivisionDto getDivisionById(@PathVariable(name="divisionId") long divisionId) {
		return divisionMapper.getDivisionById(divisionId);
	}
	
	@DeleteMapping("/division/{divisionId}")
	public ResponseEntity<String> deleteDivision(@PathVariable("divisionId") Long divisionId){
		if(divisionMapper.getDivisionById(divisionId)!= null) {
			if(divisionMapper.deleteDivision(divisionId)==null) {
				return new ResponseEntity<>("successfully deleted",HttpStatus.OK);
			}else {
				return new ResponseEntity<String>("not deleted",HttpStatus.BAD_REQUEST);
			}
		}
		return new ResponseEntity<>("faild",HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("/division")
	public ResponseEntity<String> updateDivision(@RequestBody DivisionDto divisionDto){
		if(divisionMapper.updateDivision(divisionDto)!=null) {
			return new ResponseEntity<>("sucessfully update",HttpStatus.OK);
			 
		}
		return new ResponseEntity<String>("update faild",HttpStatus.BAD_REQUEST);

	}
	
	@GetMapping("/division/name/{name}")
	public List<DivisionDto> getDivisionByName(@PathVariable(name="name") String name){
		return divisionMapper.getDivisionByName(name);
	}
	
	@GetMapping("/division/gradeId/{id}")
	public List<String> getDivisionByGradeId(@PathVariable(name="id") Long id){
		return divisionMapper.getDivisionByGradeId(id);
	}
}

package com.invicta.member.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invicta.member.dto.LeaveTypeDto;
import com.invicta.member.mapper.LeaveTypeMapper;

@RestController
@RequestMapping("/Api/")
public class LeaveTypeController {
	
	@Autowired
	private LeaveTypeMapper leaveTypeMapper;
	
	private static Logger logger = LogManager.getLogger(LeaveTypeMapper.class);
	
	@PostMapping("/saveLeaveType")
	public ResponseEntity<String> saveLeaveType(@RequestBody LeaveTypeDto leaveTypeDto){
		if(leaveTypeMapper.saveLeaveType(leaveTypeDto)!=null) {
		try {
			return new ResponseEntity<String>("saved",HttpStatus.OK);
		}catch(Exception e){
			logger.info("leaveType Controller -> save leaveType", e.getMessage());
		}
		}
		else {
			return new ResponseEntity<String>("not saved",HttpStatus.BAD_REQUEST);
		}
		return null;
	}
	
	@GetMapping("listLeaveType")
	public List<LeaveTypeDto> getLeaveType(){
		logger.info("leaveType Controller ->  leaveType listviewed ");
		return leaveTypeMapper.getAllLeaveType();
	}
	
}

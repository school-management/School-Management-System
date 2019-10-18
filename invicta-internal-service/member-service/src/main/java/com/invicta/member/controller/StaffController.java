package com.invicta.member.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invicta.member.ServiceImp.StaffServiceImp;
import com.invicta.member.dto.StaffDto;
import com.invicta.member.dto.StudentDto;
import com.invicta.member.entity.Staff;
import com.invicta.member.mapper.StaffDtoMapper;

@RestController
@RequestMapping("/Api/")
public class StaffController {

	@Autowired
	private StaffDtoMapper staffDtoMapper;

	@SuppressWarnings("unused")
	@Autowired
	private StaffServiceImp staffServiceImp;

	private static Logger logger = LogManager.getLogger(StaffDtoMapper.class);

	@PostMapping("/savestaff")
	public Staff savedstaff(@RequestBody StaffDto staffDto) {
		try {

			return staffDtoMapper.saveStaff(staffDto);

		} catch (Exception e) {
			logger.info("Studet Controller -> New Student Created not succesfully");

		}

		return null;
	}
	
	@GetMapping("/GetAllStaff")
	public ResponseEntity<List<StaffDto>> getAllStaff() {
		try {
			return new ResponseEntity<>(staffDtoMapper.getAllStaff(), HttpStatus.OK);
		} catch (Exception e) {
			logger.info("Staff Controller -> GetALL", e.getMessage());
		}
		return null;

	}
	
	@GetMapping("/{staffId}")
	public ResponseEntity<StaffDto> getByStaffId(@PathVariable Long staffId) {
		try {
			//return new ResponseEntity<>(staffDtoMapper.getBystaffId(staffId), HttpStatus.OK);
		} catch (Exception e) {
			logger.info("Staff Controller -> getBystaffId", e.getMessage());
		}
		return null;

	}

}

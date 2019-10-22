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

import com.invicta.member.ServiceImp.StaffServiceImp;
import com.invicta.member.dto.StaffDto;
import com.invicta.member.entity.Staff;
import com.invicta.member.mapper.StaffDtoMapper;

@RestController
@RequestMapping
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
	public ResponseEntity<StaffDto> getBystaffId(@PathVariable(name = "staffId") Long staffId) {
		try {
//			return new ResponseEntity<>(staffDtoMapper.getBystaffId(staffId), HttpStatus.OK);
		} catch (Exception e) {
			logger.info("Staff Controller -> getBystaffId", e.getMessage());
		}
		return null;
	}

	@DeleteMapping("/{staffId}")
	public ResponseEntity<String> deleteBystaffId(@PathVariable("staffId") Long staffId) {
		if (staffDtoMapper.getBystaffId(staffId) != null) {
			if (staffDtoMapper.deleteBystaffId(staffId) == null) {
				logger.info("Staff Controller -> Staff Deleted Successful");
				return new ResponseEntity<>("Staff Sucessfully deleted", HttpStatus.OK);
			}
		} else {
			logger.info("Staff Controller -> Staff Id Not Found");
			return new ResponseEntity<>("Staff Id Not FOUND!!!", HttpStatus.BAD_REQUEST);
		}
		logger.info("Staff Controller -> Staff Deleted Failed!!!");
		return new ResponseEntity<>("Delete FAILED!!!", HttpStatus.BAD_REQUEST);
	}

	@PutMapping("update/{staffId}")
	public ResponseEntity<String> updatestaff(@RequestBody StaffDto staffDto) {
		try {
			logger.info("Staff Controller :-> Update");
			if (staffDtoMapper.UpdateStaff(staffDto) != null) {
				return new ResponseEntity<>("Successfully Updated", HttpStatus.OK);
			}
			return new ResponseEntity<>("Failed To Update", HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Student Controller :-> Error" + ex.getMessage());
		}

		return null;
	}

	@GetMapping("/getbyempid/{empId}")
	public List<StaffDto> getbyempid(@PathVariable(name = "empId") String empId) {
		try {
			return staffDtoMapper.findByempId(empId);
		} catch (Exception e) {
			logger.error("Staff Controller :-> Error" + e.getMessage());
		}
		return null;
	}

	@GetMapping("/getbylastname/{lastname}")
	public List<StaffDto> getbylastname(@PathVariable(name = "lastname") String lastname) {
		try {
			return staffDtoMapper.findBylastname(lastname);
		} catch (Exception e) {
			logger.error("Staff Controller :-> Error" + e.getMessage());
		}
		return null;
	}
	
	@GetMapping("/getbydesignation/{designation}")
	public List<StaffDto> getbydesignation(@PathVariable(name = "designation") String designation) {
		try {
			return staffDtoMapper.findBydesignation(designation);
		} catch (Exception e) {
			logger.error("Staff Controller :-> Error" + e.getMessage());
		}
		return null;
	}
}

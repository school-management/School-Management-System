package com.invicta.staff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invicta.staff.dto.LeaveDto;
import com.invicta.staff.dtomapper.LeaveMapper;
import com.invicta.staff.entity.Leave;


@RestController
@RequestMapping("/Api/")
public class LeaveController {
	
	@Autowired
	private LeaveMapper leaveMapper;
	
	
	@PostMapping("/saveleave")
	public Leave savedstaff(@RequestBody LeaveDto leaveDto) {
		try {

			return leaveMapper.saveLeave(leaveDto);

		} catch (Exception e) {
			//logger.info("leave Controller -> New leave Created not succesfully");
			
		}

		return null;
	}
	
	@GetMapping("/listLeave")
	public List<LeaveDto> getAllLeave(){
		return leaveMapper.listLeave();
	}
	
}

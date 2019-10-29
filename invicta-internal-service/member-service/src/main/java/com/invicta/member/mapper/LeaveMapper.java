package com.invicta.member.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Converter.LeaveConverter;
import com.invicta.member.Service.LeaveService;
import com.invicta.member.dto.LeaveDto;
import com.invicta.member.entity.Leave;

@Service
public class LeaveMapper {
	
	@Autowired
	private LeaveService leaveService;
	
	@Autowired
	private LeaveConverter leaveConverter;
	
	
	@SuppressWarnings("static-access")
	public Leave saveLeave(LeaveDto leaveDto) {
		return leaveService.saveLeave(leaveConverter.LeaveDtoToLeave(leaveDto));
	}
	
	@SuppressWarnings("static-access")
	public List<LeaveDto> listLeave() {
		List<Leave> leaveList=leaveService.getAllLeave();
		
		return leaveConverter.LeaveToLeaveDtoList(leaveList);
	}
}

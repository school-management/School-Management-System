package com.invicta.staff.dtomapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.staff.convertor.LeaveConverter;
import com.invicta.staff.dto.LeaveDto;
import com.invicta.staff.entity.Leave;
import com.invicta.staff.service.LeaveService;


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

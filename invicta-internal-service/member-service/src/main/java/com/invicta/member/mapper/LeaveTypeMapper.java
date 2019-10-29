package com.invicta.member.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Converter.LeaveTypeConverter;
import com.invicta.member.Service.LeaveTypeService;
import com.invicta.member.dto.LeaveTypeDto;
import com.invicta.member.entity.LeaveType;

@Service
public class LeaveTypeMapper {
	
	@Autowired
	private LeaveTypeService leaveTypeService;
	
	@Autowired
	private LeaveTypeConverter leaveTypeConverter;
	
	private static Logger logger = LogManager.getLogger(LeaveTypeConverter.class);
	
	@SuppressWarnings("static-access")
	public LeaveType saveLeaveType(LeaveTypeDto leaveTypeDto) {
		logger.info("leaveType Mapper -> leaveType Saved");
		return leaveTypeService.saveLeaveType(leaveTypeConverter.LeaveTypeDtoToLeaveType(leaveTypeDto));
	}
	
	@SuppressWarnings("static-access")
	public List<LeaveTypeDto> getAllLeaveType() {
		List<LeaveType> listLeaveType=leaveTypeService.getAllLeaveType();
		return leaveTypeConverter.leaveTypeToLeaveTypeDtoList(listLeaveType);
		
	}
}

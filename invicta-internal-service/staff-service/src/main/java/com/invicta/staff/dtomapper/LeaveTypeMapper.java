package com.invicta.staff.dtomapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.staff.convertor.LeaveTypeConverter;
import com.invicta.staff.dto.LeaveTypeDto;
import com.invicta.staff.entity.LeaveType;
import com.invicta.staff.service.LeaveTypeService;


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

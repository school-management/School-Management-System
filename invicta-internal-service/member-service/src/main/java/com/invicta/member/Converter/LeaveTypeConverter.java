package com.invicta.member.Converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.invicta.member.dto.LeaveTypeDto;
import com.invicta.member.entity.LeaveType;

@Service
public class LeaveTypeConverter {
	
	private static Logger logger = LogManager.getLogger(LeaveTypeDto.class);
	
	public static LeaveType LeaveTypeDtoToLeaveType(LeaveTypeDto leaveTypeDto) {
		LeaveType leaveType =new LeaveType();
		if(leaveTypeDto != null) {
			logger.info("leaveType Converter---> DTO To Entity");
			leaveType.setLeaveTypeId(leaveTypeDto.getLeaveTypeId());
			leaveType.setLeaveName(leaveTypeDto.getLeaveName());
			return leaveType;
		}
		return null;
	}
	
	public static List<LeaveTypeDto> leaveTypeToLeaveTypeDtoList(List<LeaveType> listLeaveType){
		if(listLeaveType !=null) {
			logger.info("leaveType Converter---> Entity To DTO ");
			List<LeaveTypeDto> listLeaveTypeDto=new ArrayList<>();
			for(LeaveType leaveType : listLeaveType) {
				LeaveTypeDto leaveTypeDto=new LeaveTypeDto();
				logger.info("leaveType Converter---> Student List Converte");
				leaveTypeDto.setLeaveTypeId(leaveType.getLeaveTypeId());
				leaveTypeDto.setLeaveName(leaveType.getLeaveName());
				listLeaveTypeDto.add(leaveTypeDto);
			}
			
			return listLeaveTypeDto;
		}
		return null;
	}
	
	public static LeaveTypeDto leaveTypeToLeaveTypeDto(LeaveType leaveType) {
		LeaveTypeDto leaveTypeDto =new LeaveTypeDto();
		if(leaveType !=null) {
		logger.info("leaveType Converter -> Convert Object Entity to DTO");
		leaveTypeDto.setLeaveTypeId(leaveType.getLeaveTypeId());
		leaveTypeDto.setLeaveName(leaveType.getLeaveName());
		return leaveTypeDto;
		}
		return null;
	}
}

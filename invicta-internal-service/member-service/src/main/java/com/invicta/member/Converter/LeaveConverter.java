package com.invicta.member.Converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.invicta.member.dto.LeaveDto;
import com.invicta.member.entity.Leave;
import com.invicta.member.entity.LeaveType;
import com.invicta.member.entity.Staff;

@Service
public class LeaveConverter {
	
	private static Logger logger = LogManager.getLogger(LeaveDto.class);
	
	public static Leave LeaveDtoToLeave(LeaveDto leaveDto) {
		Leave leave=new Leave();
		if(leaveDto != null) {
			logger.info("leave converter---> DTO To Entity");
			leave.setLeaveDate(leaveDto.getLeaveDate());
			
			
			LeaveType leaveType=new LeaveType();
			leaveType.setLeaveTypeId(leaveDto.getLeaveTypeId());
			leave.setLeavetype(leaveType);
			
			

			
			leave.setNoOfDay(leaveDto.getNoOfDay());
			leave.setReason(leaveDto.getReason());
			
			Staff staff=new Staff();
			staff.setStaffId(leaveDto.getStaffId());
			leave.setStaff(staff);
			
			
			leave.setStatus(leaveDto.getStatus());
			leave.setLeaveDetailsId(leaveDto.getLeaveDetailsId());
			
			return leave;
		}
		return null;
	}
	
	public static List<LeaveDto> LeaveToLeaveDtoList(List<Leave> leaveList){
		if(leaveList != null) {
			logger.info("leave converter---> Entity To Dto list");
			List<LeaveDto> listLeaveDto=new ArrayList<>();
			for(Leave leave:leaveList) {
				logger.info("leave Converter--> leave List converte");
				LeaveDto leaveDto=new LeaveDto();
				leaveDto.setFullName(leave.getStaff().getFirstname()+""+leave.getStaff().getLastname());
				leaveDto.setLeaveDate(leave.getLeaveDate());
				leaveDto.setLeaveDetailsId(leave.getLeaveDetailsId());
				leaveDto.setLeaveTypeId(leave.getLeavetype().getLeaveTypeId());
				leaveDto.setLeaveName(leave.getLeavetype().getLeaveName());
				leaveDto.setNoOfDay(leave.getNoOfDay());
				leaveDto.setReason(leave.getReason());
				leaveDto.setStaffId(leave.getStaff().getStaffId());
				leaveDto.setStatus(leave.getStatus());
				listLeaveDto.add(leaveDto);
			}
			return listLeaveDto;
		}
		return null;
	}
	
	public static LeaveDto LeaveToLeaveDto(Leave leave) {
		LeaveDto leaveDto =new LeaveDto();
		if(leave !=null) {
			logger.info("leave Converter --> leave Object Entity To Dto");

			//leaveDto.setFullName(leave.getFullName());
			leaveDto.setLeaveDate(leave.getLeaveDate());
			leaveDto.setLeaveDetailsId(leave.getLeaveDetailsId());
			leaveDto.setLeaveTypeId(leave.getLeavetype().getLeaveTypeId());
			

			leaveDto.setNoOfDay(leave.getNoOfDay());
			leaveDto.setReason(leave.getReason());
			leaveDto.setStaffId(leave.getStaff().getStaffId());
			leaveDto.setStatus(leave.getStatus());
			return leaveDto;
		}
		return null;
	}
	
}

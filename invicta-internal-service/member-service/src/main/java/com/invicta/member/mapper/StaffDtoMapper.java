package com.invicta.member.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Converter.StaffDtoConverter;
import com.invicta.member.Converter.StudentdtoConverter;
import com.invicta.member.Service.StaffService;
import com.invicta.member.dto.StaffDto;
import com.invicta.member.entity.Staff;

@Service 
public class StaffDtoMapper {
	
	@Autowired
	private StaffService  staffService;
	
	private static Logger logger = LogManager.getLogger(StaffDtoConverter.class);
	
	@Autowired
	private StaffDtoConverter  staffDtoConverter;
	
	@SuppressWarnings("static-access")
	public Staff saveStaff(StaffDto staffDto) {
		logger.info("staff Details -> staff Saved");
		return staffService.saveStaff(StaffDtoConverter.StaffDtoToStaff(staffDto));
		
	}
	
	public List<StaffDto> getAllStaff(){
		logger.info("Staff listed successfully");
		List<Staff> stafflist  = staffService.getAllStaff();
		return StaffDtoConverter.StaffToStaffDTO(stafflist);
		
	}
	
	

}

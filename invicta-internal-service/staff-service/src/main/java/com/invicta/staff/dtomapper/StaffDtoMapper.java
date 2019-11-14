package com.invicta.staff.dtomapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.staff.convertor.StaffDtoConverter;
import com.invicta.staff.dto.StaffDto;
import com.invicta.staff.entity.Staff;
import com.invicta.staff.service.StaffService;


@Service 
public class StaffDtoMapper {
	
	@Autowired
	private StaffService  staffService;
	
	private static Logger logger = LogManager.getLogger(StaffDtoConverter.class);
	
	@Autowired
	private StaffDtoConverter  staffDtoConverter;
	
	public Staff saveStaff(StaffDto staffDto) {
		logger.info("staff Details -> staff Saved");
		return staffService.saveStaff(StaffDtoConverter.StaffDtoToStaff(staffDto));
		
	}
	
	public List<StaffDto> getAllStaff(){
		logger.info("Staff listed successfully");
		List<Staff> stafflist  = staffService.getAllStaff();
		return StaffDtoConverter.StaffToStaffDTO(stafflist);
		
	}
	@SuppressWarnings("static-access")
	public StaffDto getBystaffId(Long staffId) {
		logger.info("Successfully get staff by Id");
		Staff staff = staffService.getBystaffId(staffId);
		return staffDtoConverter.StaffEntityToStaffDTO(staff);
	}
	
//	public StudentDto deleteBystaffId(Long staffId) {
//		logger.info("staff Mapper -> staff Deleted");
//		staffService.deleteByStaffId(staffId);
//		return null;
//	}
	@SuppressWarnings("static-access")
	public Staff UpdateStaff(StaffDto staffDto) {
		@SuppressWarnings("unused")
	Staff staff = StaffDtoConverter.StaffDtoToStaff(staffDto);
		return staffService.updatestaff(staffDtoConverter.StaffDtoToStaff(staffDto));
	}
	
	public List<StaffDto> findByempId(String empId) {
		List<Staff> staff = staffService.findByempId(empId);
		return StaffDtoConverter.StaffToStaffDTO(staff);
				}
	
	public List<StaffDto> findBylastname(String lastname) {
		List<Staff> staff = staffService.findBylastname(lastname);
		return StaffDtoConverter.StaffToStaffDTO(staff);
				}
	
	public List<StaffDto> findBydesignation(String designation) {
		List<Staff> staff = staffService.findBydesignation(designation);
		return StaffDtoConverter.StaffToStaffDTO(staff);
				}
}

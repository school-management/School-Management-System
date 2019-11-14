package com.invicta.staff.service;

import java.util.List;

import com.invicta.staff.entity.Staff;


public interface StaffService {
	
	public Staff saveStaff(Staff staff);

	public List<Staff> getAllStaff();
	
	public  Staff getBystaffId(Long staffId);
	
	public  Staff deleteByStaffId(Long staff);
	
	public  Staff updatestaff(Staff staff);
	
	public List<Staff>findByempId(String empId);
	
	public List<Staff>findBylastname(String lastname);
	
	public List<Staff>findBydesignation(String designation);

}

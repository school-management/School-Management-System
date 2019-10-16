package com.invicta.member.Service;

import java.util.List;

import com.invicta.member.entity.Staff;


public interface StaffService {
	
	public Staff saveStaff(Staff staff);

	public List<Staff> getAllStaff();
	
	public  Staff getBystaffId(Long staff);
	
	public  Staff deleteBystaffId(Long staff);
	
	public  Staff editStaff( Staff  staff);

}

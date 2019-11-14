package com.invicta.staff.service;

import java.util.List;

import com.invicta.staff.entity.LeaveType;

public interface LeaveTypeService {
	public LeaveType saveLeaveType(LeaveType leaveType);
	
	public List<LeaveType> getAllLeaveType();
}

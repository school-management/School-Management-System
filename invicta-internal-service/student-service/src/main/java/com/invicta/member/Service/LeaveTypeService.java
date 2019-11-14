package com.invicta.member.Service;

import java.util.List;

import com.invicta.member.entity.LeaveType;

public interface LeaveTypeService {
	public LeaveType saveLeaveType(LeaveType leaveType);
	
	public List<LeaveType> getAllLeaveType();
}

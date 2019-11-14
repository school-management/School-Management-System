package com.invicta.staff.service;

import java.util.List;

import com.invicta.staff.entity.Leave;


public interface LeaveService {
	public Leave saveLeave(Leave leave);
	
	public List<Leave> getAllLeave();
	
	public Leave getLeaveById(Long leaveId);
	
	public Leave deleteById(Long leaveId);
	
	public Leave updateLeave(Leave leave);
}

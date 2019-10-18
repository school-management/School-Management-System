package com.invicta.member.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.invicta.member.entity.Leave;


public interface LeaveService {
	public Leave saveLeave(Leave leave);
	
	public List<Leave> getAllLeave();
	
	public Leave getLeaveById(Long leaveId);
	
	public Leave deleteById(Long leaveId);
	
	public Leave updateLeave(Leave leave);
}

package com.invicta.member.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.invicta.member.Service.LeaveTypeService;
import com.invicta.member.entity.LeaveType;
import com.invicta.member.repository.LeaveTypeRepository;

@Service
public class LeaveTypeServiceImpl implements LeaveTypeService{
	
	@Autowired
	private LeaveTypeRepository leaveTypeRepository;
	
	@Override
	public LeaveType saveLeaveType(LeaveType leaveType) {
		
		return leaveTypeRepository.save(leaveType);
	}

	@Override
	public List<LeaveType> getAllLeaveType() {
		
		return leaveTypeRepository.findAll();
	}

}

package com.invicta.staff.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.staff.Repository.LeaveTypeRepository;
import com.invicta.staff.entity.LeaveType;
import com.invicta.staff.service.LeaveTypeService;

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

package com.invicta.member.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Service.LeaveService;
import com.invicta.member.entity.Leave;
import com.invicta.member.repository.LeaveRepository;

@Service
public class LeaveServiceImpl implements LeaveService{
	
	@Autowired
	private LeaveRepository leaveRepository;
	
	@Override
	public Leave saveLeave(Leave leave) {
		
		return leaveRepository.save(leave);
	}

	@Override
	public List<Leave> getAllLeave() {
		
		return leaveRepository.findAll();
	}

	@Override
	public Leave getLeaveById(Long leaveId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Leave deleteById(Long leaveId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Leave updateLeave(Leave leave) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.invicta.member.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Service.StaffService;
import com.invicta.member.entity.Staff;
import com.invicta.member.repository.StaffRepository;

@Service
public class StaffServiceImp implements StaffService {
	
	@Autowired
	private StaffRepository staffRepository;

	@Override
	public Staff saveStaff(Staff staff) {
		
		return staffRepository.save(staff);
	}

	@Override
	public List<Staff> getAllStaff() {
		
		return staffRepository.findAll();
	}

	@Override
	public Staff getBystaffId(Long staff) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Staff deleteBystaffId(Long staff) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Staff editStaff(Staff staff) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

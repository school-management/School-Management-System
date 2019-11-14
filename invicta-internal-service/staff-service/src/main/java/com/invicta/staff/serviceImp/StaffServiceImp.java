package com.invicta.staff.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.staff.Repository.StaffRepository;
import com.invicta.staff.entity.Staff;
import com.invicta.staff.service.StaffService;

@Service
public class StaffServiceImp implements StaffService {

	@SuppressWarnings("unused")
	private static final Object Staff = null;
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
	public Staff getBystaffId(Long staffId) {
		return staffRepository.findStaffByStaffId(staffId);
	}

	@Override
	public Staff deleteByStaffId(Long staffId) {

		staffRepository.deleteById(staffId);
		return null;
	}

	@Override
	public Staff updatestaff(Staff staff) {
		return staffRepository.save(staff);
	}

	@Override
	public List<Staff> findByempId(String empId) {
		
		return staffRepository.findStaffByEmpId(empId);
	}

	@Override
	public List<Staff> findBylastname(String lastname) {
				return staffRepository.findStaffByLastName(lastname);
	}

	@Override
	public List<Staff> findBydesignation(String designation) {
		
		return staffRepository.findStaffBydesignation(designation);
	}

	
	
}

package com.invicta.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invicta.member.entity.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long> {
	
	//public Staff FindStaffByStaffId  (Long staffId);

}

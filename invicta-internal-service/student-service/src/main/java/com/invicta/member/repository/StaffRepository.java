package com.invicta.member.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.invicta.member.entity.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long> {
	
	public Staff findStaffByStaffId(Long staffId);
	
	String FINDstaff="SELECT * FROM staff where emp_id=?1";
	@Query(value = FINDstaff,nativeQuery = true)
	List<Staff> findStaffByEmpId(String id);
	
	String FINDlname="SELECT * FROM staff where lastname=?1";
	@Query(value = FINDlname,nativeQuery = true)
	List<Staff> findStaffByLastName(String name);
	
	String FINDdesignation="SELECT * FROM staff where designation=?1";
	@Query(value = FINDdesignation,nativeQuery = true)
	List<Staff> findStaffBydesignation(String designation);

}

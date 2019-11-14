package com.invicta.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.invicta.member.entity.LeaveType;

public interface LeaveTypeRepository extends JpaRepository<LeaveType, Long>{
	public LeaveType findLeaveTypeByLeaveTypeId(Long leaveTypeId);
}

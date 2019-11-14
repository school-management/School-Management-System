package com.invicta.staff.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invicta.staff.entity.LeaveType;

public interface LeaveTypeRepository extends JpaRepository<LeaveType, Long>{
	public LeaveType findLeaveTypeByLeaveTypeId(Long leaveTypeId);
}

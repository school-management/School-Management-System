package com.invicta.staff.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invicta.staff.entity.Leave;

public interface LeaveRepository extends JpaRepository<Leave, Long>{
	public Leave findLeaveByLeaveDetailsId(Long leaveId);
}

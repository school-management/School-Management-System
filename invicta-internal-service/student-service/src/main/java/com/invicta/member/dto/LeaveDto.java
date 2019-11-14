package com.invicta.member.dto;

import java.util.Date;

public class LeaveDto {
	
private Long leaveDetailsId;
	
	private Long leaveTypeId;
	
	private Long staffId;
	
	private String fullName;
	
	private Date leaveDate;
	
	private int noOfDay;
	
	private String reason;
	
	private String status;
	
	private String leaveName;

	public String getLeaveName() {
		return leaveName;
	}

	public void setLeaveName(String leaveName) {
		this.leaveName = leaveName;
	}

	public Long getLeaveDetailsId() {
		return leaveDetailsId;
	}

	public void setLeaveDetailsId(Long leaveDetailsId) {
		this.leaveDetailsId = leaveDetailsId;
	}

	public Long getLeaveTypeId() {
		return leaveTypeId;
	}

	public void setLeaveTypeId(Long leaveTypeId) {
		this.leaveTypeId = leaveTypeId;
	}

	

	

	

	public Long getStaffId() {
		return staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

	public int getNoOfDay() {
		return noOfDay;
	}

	public void setNoOfDay(int noOfDay) {
		this.noOfDay = noOfDay;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}

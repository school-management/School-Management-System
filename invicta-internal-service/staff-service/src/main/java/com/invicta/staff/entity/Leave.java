package com.invicta.staff.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(schema="studentservice" , name="leave")
public class Leave implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long leaveDetailsId;
	
	@ManyToOne
	@JoinColumn(name="leaveTypeId", nullable = false)
	private LeaveType leavetype;
	
	@ManyToOne
	@JoinColumn(name="staffId",nullable =false)
	private Staff staff;
	
	
	
	private Date leaveDate;
	
	
	
	private int noOfDay;
	
	private String reason;
	
	private String status;

	public Long getLeaveDetailsId() {
		return leaveDetailsId;
	}

	public void setLeaveDetailsId(Long leaveDetailsId) {
		this.leaveDetailsId = leaveDetailsId;
	}

	public LeaveType getLeavetype() {
		return leavetype;
	}

	public void setLeavetype(LeaveType leavetype) {
		this.leavetype = leavetype;
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

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	

	

	
}

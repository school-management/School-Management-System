package com.invicta.calendar.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(schema = "attendanceservice", name = "calendar")
public class Calendar implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long calendarId;
	private String Typeofday;
	private Date todaydate;
	private String resoan;
	
	public Long getCalendarId() {
		return calendarId;
	}
	public void setCalendarId(Long calendarId) {
		this.calendarId = calendarId;
	}
	public String getTypeofday() {
		return Typeofday;
	}
	public void setTypeofday(String typeofday) {
		Typeofday = typeofday;
	}
	public Date getTodaydate() {
		return todaydate;
	}
	public void setTodaydate(Date todaydate) {
		this.todaydate = todaydate;
	}
	public String getResoan() {
		return resoan;
	}
	public void setResoan(String resoan) {
		this.resoan = resoan;
	}
	
	


	

}

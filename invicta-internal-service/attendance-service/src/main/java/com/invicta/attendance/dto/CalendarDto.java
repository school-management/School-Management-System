package com.invicta.attendance.dto;

import java.util.Date;

public class CalendarDto {
	
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

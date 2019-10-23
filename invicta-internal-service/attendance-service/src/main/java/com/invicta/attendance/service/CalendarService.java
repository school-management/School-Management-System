package com.invicta.attendance.service;

import org.springframework.stereotype.Service;

import com.invicta.attendance.entity.Calendar;

@Service
public interface CalendarService {
	
	public Calendar saveCalendar(Calendar calendar);

}

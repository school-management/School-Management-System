package com.invicta.attendance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.invicta.attendance.entity.Calendar;

@Service
public interface CalendarService {

	public Calendar saveCalendar(Calendar calendar);

	public List<Calendar> getallCalendardetails();

	public Calendar updateCalendar(Calendar calendar);

}

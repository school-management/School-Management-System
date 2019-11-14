package com.invicta.calendar.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.invicta.calendar.entity.Calendar;

@Service
public interface CalendarService {

	public Calendar saveCalendar(Calendar calendar);

	public List<Calendar> getallCalendardetails();

	public Calendar updateCalendar(Calendar calendar);

}

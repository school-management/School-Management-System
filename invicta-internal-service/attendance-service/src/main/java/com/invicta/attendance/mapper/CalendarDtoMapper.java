package com.invicta.attendance.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.attendance.convertor.CalendarDtoConvertor;
import com.invicta.attendance.dto.CalendarDto;
import com.invicta.attendance.entity.Calendar;
import com.invicta.attendance.service.CalendarService;

@Service
public class CalendarDtoMapper {

	
	@Autowired
	private CalendarService calendarService;
	
	@Autowired
	private CalendarDtoConvertor caledCalendarDtoConvertor;
	
	
	@SuppressWarnings("static-access")
	public Calendar saveCalendar(CalendarDto calendarDto) {
		return calendarService.saveCalendar(caledCalendarDtoConvertor.CalendarDTOToClandar(calendarDto));
		
	}
}

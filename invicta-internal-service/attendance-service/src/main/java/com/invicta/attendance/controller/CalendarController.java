package com.invicta.attendance.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.invicta.attendance.dto.CalendarDto;
import com.invicta.attendance.entity.Calendar;
import com.invicta.attendance.mapper.CalendarDtoMapper;
import com.invicta.attendance.serviceImp.CalendarServiceimpl;

@RestController
@RequestMapping("/api/")
public class CalendarController {

	@Autowired
	private CalendarDtoMapper calendarDtoMapper;

	private static Logger logger = LogManager.getLogger(CalendarServiceimpl.class);

	@PostMapping("/savecalendar")
	public Calendar savedcalendar(@RequestBody CalendarDto calendarDto) {
		try {
			return calendarDtoMapper.saveCalendar(calendarDto);
		} catch (Exception e) {
			logger.info("Studet Controller -> New Student Created succesfully", e.getMessage());
		}

		return null;
	}
	
	
}

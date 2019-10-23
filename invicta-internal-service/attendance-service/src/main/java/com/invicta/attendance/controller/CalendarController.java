package com.invicta.attendance.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.invicta.attendance.dto.CalendarDto;
import com.invicta.attendance.entity.Calendar;
import com.invicta.attendance.mapper.CalendarDtoMapper;
import com.invicta.attendance.service.CalendarService;
import com.invicta.attendance.serviceImp.CalendarServiceimpl;

@RestController
@RequestMapping("/calendar")
public class CalendarController {

	@Autowired
	private CalendarDtoMapper calendarDtoMapper;

	@SuppressWarnings("unused")
	@Autowired
	private CalendarService calendarService;

	private static Logger logger = LogManager.getLogger(CalendarServiceimpl.class);

	@PostMapping("/savecalendar")
	public Calendar savedcalendar(@RequestBody CalendarDto calendarDto) {
		try {
			return calendarDtoMapper.saveCalendar(calendarDto);
		} catch (Exception e) {
			logger.info("Calendar Controller -> New Calendar Created succesfully", e.getMessage());
		}

		return null;
	}

	@GetMapping("/GetAllCalendarDetails")
	public ResponseEntity<List<CalendarDto>> getAllCalendarDetails() {
		try {
			return new ResponseEntity<>(calendarDtoMapper.getAllCalendar(), HttpStatus.OK);
		} catch (Exception e) {
			logger.info("Calendar Controller -> GetCalendarDetails", e.getMessage());
		}
		return null;

	}

}

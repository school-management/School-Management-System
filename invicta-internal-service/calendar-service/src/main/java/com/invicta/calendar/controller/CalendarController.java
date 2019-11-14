package com.invicta.calendar.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invicta.calendar.dto.CalendarDto;
import com.invicta.calendar.dtomapper.CalendarDtoMapper;
import com.invicta.calendar.entity.Calendar;
import com.invicta.calendar.service.CalendarService;
import com.invicta.calendar.serviceImp.CalendarServiceimpl;

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
	
	@PutMapping("updatecalendar/{calendarId}") // update Employee Using Employee ID
	public ResponseEntity<String> updatecalendar(@RequestBody CalendarDto calendarDto) {
		try {
			logger.info("Employee Controller :-> Update");
			if (calendarDtoMapper.Updatecalendar(calendarDto) != null) {
				return new ResponseEntity<>("Successfully Updated", HttpStatus.OK);
			}
			return new ResponseEntity<>("Failed To Update", HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Employee Controller :-> Error" + ex.getMessage());
		}

		return null;
	}

}

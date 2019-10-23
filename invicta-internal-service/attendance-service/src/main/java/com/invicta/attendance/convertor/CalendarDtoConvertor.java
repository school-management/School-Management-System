package com.invicta.attendance.convertor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.invicta.attendance.dto.CalendarDto;
import com.invicta.attendance.entity.Calendar;

@Service
public class CalendarDtoConvertor {
	private static Logger logger = LogManager.getLogger(CalendarDto.class);
	public static Calendar CalendarDTOToClandar(CalendarDto calendarDto) {
		Calendar calendar = new Calendar();
		if (calendarDto != null) {
			logger.info("Student Converter---> DTO To Entity");
			calendar.setCalendarId(calendarDto.getCalenderId());
			calendar.setHoliday(calendarDto.getHoliday());
			return calendar;
		}
		return null;

	}

}

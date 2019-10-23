package com.invicta.attendance.convertor;

import java.util.ArrayList;
import java.util.List;
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

	public static List<CalendarDto> CalendarToCalendarDTO(List<Calendar> calendarlist) {

		if (calendarlist != null) {
			logger.info("Student Converter---> Entity To DTO ");
			List<CalendarDto> listCalendarDto = new ArrayList<>();
			for (Calendar calendar : calendarlist) {
				logger.info("Student Converter---> Student List Converte");
				CalendarDto calendarDto = new CalendarDto();
				calendarDto.setCalenderId(calendar.getCalendarId());
				calendarDto.setHoliday(calendar.getHoliday());
				listCalendarDto.add(calendarDto);

			}

			return listCalendarDto;
		}
		return null;
	}

}

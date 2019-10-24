package com.invicta.attendance.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

	private static Logger logger = LogManager.getLogger(CalendarDto.class);

	@SuppressWarnings("static-access")
	public Calendar saveCalendar(CalendarDto calendarDto) {
		return calendarService.saveCalendar(caledCalendarDtoConvertor.CalendarDTOToClandar(calendarDto));

	}

	@SuppressWarnings("static-access")
	public List<CalendarDto> getAllCalendar() {
		logger.info(" Student Successfully Listed ");
		List<Calendar> calendartlist = calendarService.getallCalendardetails();
		return caledCalendarDtoConvertor.CalendarToCalendarDTO(calendartlist);

	}
	
	
	  public Calendar Updatecalendar(CalendarDto calendarDto) {
//		    logger.info("Employee is Updated", employeeDTO.getEmpId());
		  	@SuppressWarnings("static-access")
			Calendar calendar = caledCalendarDtoConvertor.CalendarDTOToClandar(calendarDto);
		  	return calendarService.updateCalendar(caledCalendarDtoConvertor.CalendarDTOToClandar(calendarDto));

		  }
}

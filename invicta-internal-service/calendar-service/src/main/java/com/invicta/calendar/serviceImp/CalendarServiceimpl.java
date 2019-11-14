package com.invicta.calendar.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.calendar.entity.Calendar;
import com.invicta.calendar.repository.CalendarRepository;
import com.invicta.calendar.service.CalendarService;

@Service
public class CalendarServiceimpl implements CalendarService {

	@Autowired
	private CalendarRepository calendarRepository;

	@Override
	public Calendar saveCalendar(Calendar calendar) {
		return calendarRepository.save(calendar);
	}

	@Override
	public List<Calendar> getallCalendardetails() {
		return calendarRepository.findAll();
	}

	@Override
	public Calendar updateCalendar(Calendar calendar) {
		return calendarRepository.save(calendar);
	}

}

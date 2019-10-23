package com.invicta.attendance.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.attendance.entity.Calendar;
import com.invicta.attendance.repository.CalendarRepository;
import com.invicta.attendance.service.CalendarService;

@Service
public class CalendarServiceimpl implements CalendarService {

	@Autowired
	private CalendarRepository calendarRepository;

	@Override
	public Calendar saveCalendar(Calendar calendar) {
		return calendarRepository.save(calendar);
	}

}

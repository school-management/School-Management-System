package com.invicta.calendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invicta.calendar.entity.Calendar;

public interface CalendarRepository extends JpaRepository<Calendar, Long> {

}

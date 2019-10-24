package com.invicta.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invicta.attendance.entity.Calendar;

public interface CalendarRepository extends JpaRepository<Calendar, Long> {

}

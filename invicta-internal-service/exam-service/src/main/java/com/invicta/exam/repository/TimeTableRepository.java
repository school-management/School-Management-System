package com.invicta.exam.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.invicta.exam.entity.TimeTable;

public interface TimeTableRepository extends JpaRepository<TimeTable, Long>{

	public TimeTable findByTimeTableId(Long timeTableId);
	
	
}

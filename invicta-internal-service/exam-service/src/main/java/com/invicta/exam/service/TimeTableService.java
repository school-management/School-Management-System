package com.invicta.exam.service;

import java.util.List;

import com.invicta.exam.entity.TimeTable;

public interface TimeTableService {

	public TimeTable createTimeTable(TimeTable timeTable);

	public List<TimeTable> getAllTimeTableRecords();

	public TimeTable getByTimeTableId(Long timetableId);

	public TimeTable deleteByTimeTableId(Long timetableId);

	public TimeTable updateTimeTable(TimeTable timeTable);

}

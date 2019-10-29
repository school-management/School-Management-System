package com.invicta.exam.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.exam.convertor.TimeTableConverter;
import com.invicta.exam.dto.TimeTableDto;
import com.invicta.exam.entity.TimeTable;
import com.invicta.exam.service.TimeTableService;

@Service
public class TimeTableMapper {

	@Autowired
	private TimeTableService timeTableService;

	@Autowired
	private TimeTableConverter timeTableConverter;

	private static Logger logger = LogManager.getLogger(TimeTableConverter.class);

	public TimeTable saveTimeTableRecords(TimeTableDto timeTableDto) {
		logger.info("Time Table Mapper -> Time Table Saved");
		return timeTableService.createTimeTable(timeTableConverter.TimeTableDtoToTimeTableEntity(timeTableDto));
	}

	@SuppressWarnings("static-access")
	public List<TimeTableDto> getAllTimeTable() {
		logger.info("All Time Table Successfully Listed ");
		List<TimeTable> timeTableList = timeTableService.getAllTimeTableRecords();
		return timeTableConverter.TimeTableEntityToTimeTableDtoforList(timeTableList);

	}

	@SuppressWarnings("static-access")
	public TimeTableDto getByTimeTableId(Long timetableId) {
		logger.info("Successfully get Time Table by Id");
		TimeTable timeTable = timeTableService.getByTimeTableId(timetableId);
		return timeTableConverter.TimeTableEntityToTimeTableDto(timeTable);
	}

	public TimeTableDto deleteTimeTableById(Long timetableId) {
		logger.info("Time Table Mapper ----> Time Table Record Deleted");
		timeTableService.deleteByTimeTableId(timetableId);
		return null;
	}

	public TimeTable UpdateTimeTable(TimeTableDto timeTableDto) {
		logger.info("Time Table is Updated", timeTableDto.getTimeTableId());
		TimeTable timeTable = timeTableConverter.TimeTableDtoToTimeTableEntity(timeTableDto);
		return timeTableService.updateTimeTable(timeTable);

	}
}

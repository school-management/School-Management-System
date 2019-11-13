package com.invicta.exam.serviceImp;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.exam.entity.TimeTable;
import com.invicta.exam.repository.TimeTableRepository;
import com.invicta.exam.service.TimeTableService;

@Service
public class TimeTableServiceImpl implements TimeTableService {

	@Autowired
	private TimeTableRepository timeTableRepository;

	private static Logger logger = LogManager.getLogger(TimeTableRepository.class);

	@Override
	public TimeTable createTimeTable(TimeTable timeTable) {
		try {
			return timeTableRepository.save(timeTable);
		} catch (Exception e) {
			logger.info("Time Table Service Implementation -->", e.getMessage());
			System.out.println(timeTable.getGradeId());
		}
		return null;
	}

	@Override
	public List<TimeTable> getAllTimeTableRecords() {
		try {
			return timeTableRepository.findAll();
		} catch (Exception e) {
			logger.info("Time Table Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public TimeTable getByTimeTableId(Long timetableId) {
		try {
			return timeTableRepository.findByTimeTableId(timetableId);
		} catch (Exception e) {
			logger.info("Time Table Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public TimeTable deleteByTimeTableId(Long timetableId) {
		try {
			timeTableRepository.deleteById(timetableId);
		} catch (Exception e) {
			logger.info("Time Table Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public TimeTable updateTimeTable(TimeTable timeTable) {
		Long timeTableId = timeTable.getTimeTableId();
		boolean isExist = timeTableRepository.findByTimeTableId(timeTableId) != null;
		if (isExist) {
			logger.info("Time Table updates Successfully");
			return timeTableRepository.save(timeTable);
		} else {
			logger.info("Time Table Id is Not Found");
		}
		return null;
	}

}

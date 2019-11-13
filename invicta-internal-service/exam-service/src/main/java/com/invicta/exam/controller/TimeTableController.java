package com.invicta.exam.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invicta.exam.dto.TimeTableDto;
import com.invicta.exam.entity.TimeTable;
import com.invicta.exam.mapper.TimeTableMapper;

@RestController
@RequestMapping("/timetable")
public class TimeTableController {

	@Autowired
	private TimeTableMapper timeTableMapper;

	private static Logger logger = LogManager.getLogger(TimeTableMapper.class);

	@PostMapping("/timetables")
	public TimeTable saveTimeTable(@RequestBody TimeTableDto timeTableDto) {
		try {
			return timeTableMapper.saveTimeTableRecords(timeTableDto);
		} catch (Exception e) {
			logger.info("Time Table Controller -> New Time Table Created succesfully", e.getMessage());
		}

		return null;
	}

	@GetMapping("/timetables")
	public ResponseEntity<List<TimeTableDto>> getAllTimeTable() {
		try {
			return new ResponseEntity<>(timeTableMapper.getAllTimeTable(), HttpStatus.OK);
		} catch (Exception e) {
			logger.info("Time Table Controller -> GetAllTimeTable", e.getMessage());
		}
		return null;

	}

	@GetMapping("timetables/{timeTableId}")
	public ResponseEntity<TimeTableDto> getTimeTablebyId(@PathVariable Long timeTableId) {
		try {
			return new ResponseEntity<>(timeTableMapper.getByTimeTableId(timeTableId), HttpStatus.OK);
		} catch (Exception e) {
			logger.info("Time Table Controller -> GetByTimeTableId", e.getMessage());
		}
		return null;

	}

	@DeleteMapping("timetables/{timeTableId}")
	public ResponseEntity<String> deleteTimeTableById(@PathVariable Long timeTableId) {
		try {
			if (timeTableMapper.getByTimeTableId(timeTableId) != null) {
				if (timeTableMapper.deleteTimeTableById(timeTableId) == null) {
					logger.info("Time Table Controller -> Time Table Deleted Successfully");
					return new ResponseEntity<>("Time Table Sucessfully deleted", HttpStatus.OK);
				}
			} else {
				logger.info("Time Table Controller -> Time Table Id Not Found");
				return new ResponseEntity<>("Time Table Id Not FOUND!!!", HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			logger.error("Time Table Controller -> Time Table Deleted Failed!!!");
			return new ResponseEntity<>("Delete FAILED!!!", HttpStatus.BAD_REQUEST);
		}
		return null;

	}

	@PutMapping("timetables/{timeTableId}")
	public ResponseEntity<String> updateTimeTable(@RequestBody TimeTableDto timeTableDto) {
		try {
			logger.info("Time Table Controller :-> Update");
			if (timeTableMapper.UpdateTimeTable(timeTableDto) != null) {
				return new ResponseEntity<>("Successfully Updated", HttpStatus.OK);
			}
			return new ResponseEntity<>("Failed To Update", HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Time Table Controller :-> Error" + ex.getMessage());
		}

		return null;
	}
}

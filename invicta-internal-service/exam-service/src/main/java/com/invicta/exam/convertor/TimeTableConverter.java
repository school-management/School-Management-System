package com.invicta.exam.convertor;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.exam.dto.TimeTableDto;
import com.invicta.exam.entity.Subject;
import com.invicta.exam.entity.TimeTable;
import com.invicta.exam.serviceImp.SubjectServiceImpl;

@Service
public class TimeTableConverter {

	@Autowired
	private SubjectServiceImpl subjectService;

	private static Logger logger = LogManager.getLogger(TimeTableDto.class);

	public TimeTable TimeTableDtoToTimeTableEntity(TimeTableDto timeTableDto) {
		TimeTable timeTable = new TimeTable();
		if (timeTableDto != null) {
			logger.info("TimeTable Converter ----> DTO To Entity");
			timeTable.setTimeTableId(timeTableDto.getTimeTableId());
			timeTable.setYear(timeTableDto.getYear());
			timeTable.setTerm(timeTableDto.getTerm());

			Subject subject = new Subject();

			Subject subject1 = subjectService.getBySubjectId(timeTableDto.getSubjectId());
			subject.setSubjectId(subject1.getSubjectId());
			timeTable.setSubject(subject);

			timeTable.setExamDate(timeTableDto.getExamDate());
			timeTable.setStartTime(timeTableDto.getStartTime());
			timeTable.setEndTime(timeTableDto.getEndTime());
			timeTable.setGradeId(subject1.getGradeId());
			return timeTable;
		}
		return null;

	}

	public static TimeTableDto TimeTableEntityToTimeTableDto(TimeTable timeTable) {
		TimeTableDto timeTableDto = new TimeTableDto();
		if (timeTable != null) {
			logger.info("TimeTable Converter ----> Entity To DTO ");
			timeTableDto.setTimeTableId(timeTable.getTimeTableId());
			timeTableDto.setYear(timeTable.getYear());
			timeTableDto.setTerm(timeTable.getTerm());
			timeTableDto.setGradeId(timeTable.getSubject().getGradeId());
			timeTableDto.setSubjectId(timeTable.getSubject().getSubjectId());
			timeTableDto.setSubjectName(timeTable.getSubject().getSubjectName());
			timeTableDto.setCategory(timeTable.getSubject().getCategory());
			timeTableDto.setExamDate(timeTable.getExamDate());
			timeTableDto.setStartTime(timeTable.getStartTime());
			timeTableDto.setEndTime(timeTable.getEndTime());

			return timeTableDto;
		}
		return null;

	}

	public static List<TimeTableDto> TimeTableEntityToTimeTableDtoforList(List<TimeTable> timeTableList) {
		if (timeTableList != null) {
			logger.info("TimeTable To DTO Converter for List");
			List<TimeTableDto> listTimeTableDto = new ArrayList<>();
			for (TimeTable timeTable : timeTableList) {
				TimeTableDto timeTableDto = new TimeTableDto();
				timeTableDto.setTimeTableId(timeTable.getTimeTableId());
				timeTableDto.setYear(timeTable.getYear());
				timeTableDto.setTerm(timeTable.getTerm());
				timeTableDto.setGradeId(timeTable.getSubject().getGradeId());
				timeTableDto.setSubjectId(timeTable.getSubject().getSubjectId());
				timeTableDto.setSubjectName(timeTable.getSubject().getSubjectName());
				timeTableDto.setCategory(timeTable.getSubject().getCategory());
				// timeTableDto.setGradeId(timeTable.getSubject().getGradeId());
				timeTableDto.setExamDate(timeTable.getExamDate());
				timeTableDto.setStartTime(timeTable.getStartTime());
				timeTableDto.setEndTime(timeTable.getEndTime());
				listTimeTableDto.add(timeTableDto);
			}
			return listTimeTableDto;
		}
		return null;
	}
}

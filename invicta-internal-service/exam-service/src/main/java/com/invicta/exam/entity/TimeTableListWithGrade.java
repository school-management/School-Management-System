package com.invicta.exam.entity;

import java.sql.Time;
import java.util.Date;

public class TimeTableListWithGrade {

	private Long timeTableId;
	private Long year;
	private Long term;
	private Long gradeId;
	private Long subjectId;
	private String subjectName;
	private String category;
	private Date examDate;
	private Time startTime;
	private Time endTime;

	private Grade gradeObj;

	
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getTimeTableId() {
		return timeTableId;
	}

	public void setTimeTableId(Long timeTableId) {
		this.timeTableId = timeTableId;
	}

	public Long getYear() {
		return year;
	}

	public void setYear(Long year) {
		this.year = year;
	}

	public Long getTerm() {
		return term;
	}

	public void setTerm(Long term) {
		this.term = term;
	}

	public Grade getGradeObj() {
		return gradeObj;
	}

	public void setGradeObj(Grade gradeObj) {
		this.gradeObj = gradeObj;
	}
	
	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

}

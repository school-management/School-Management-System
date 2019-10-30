package com.invicta.exam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name ="time_table", schema ="examservice")
public class TimeTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long timeTableId;

	@Column(nullable = false)
	private Long year;

	@Column(nullable = false)
	private Long term;

	@Column(nullable = false)
	private Long gradeId;

	@OneToOne
	@JoinColumn(name = "subjectId")
	private Subject subject;

	@Column(nullable = false)
	private Date examDate;

	@Column(nullable = false)
	private Time startTime;

	@Column(nullable = false)
	private Time endTime;

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

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
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

	

}

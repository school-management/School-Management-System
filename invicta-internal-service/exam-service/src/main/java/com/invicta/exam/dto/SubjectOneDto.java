package com.invicta.exam.dto;

import java.sql.Date;

@SuppressWarnings("unused")
public class SubjectOneDto {

	private Long subjectId;
	private String subjectName;
	private Long gradeId;
	

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

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}
	
	

	

}

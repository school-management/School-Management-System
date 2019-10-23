package com.invicta.exam.entity;

public class SubjectOneList {

	private Long subjectId;
	private String subjectName;
	private Long gradeId;

	private Grade gradeObj;

	public Grade getGradeObj() {
		return gradeObj;
	}

	public void setGradeObj(Grade gradeObj) {
		this.gradeObj = gradeObj;
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

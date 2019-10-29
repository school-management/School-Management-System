package com.invicta.exam.entity;

public class SubjectListWithGrade {

	private Long SubjectId;
	private String SubjectName;
	private String Category;
	private Long gradeId;

	private Grade gradeObj;

	public Long getSubjectId() {
		return SubjectId;
	}

	public void setSubjectId(Long subjectId) {
		SubjectId = subjectId;
	}

	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public Grade getGradeObj() {
		return gradeObj;
	}

	public void setGradeObj(Grade gradeObj) {
		this.gradeObj = gradeObj;
	}

}

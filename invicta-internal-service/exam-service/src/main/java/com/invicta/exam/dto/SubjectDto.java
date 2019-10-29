package com.invicta.exam.dto;

public class SubjectDto {

	private Long SubjectId;
	private String SubjectName;
	private String Category;
	private Long gradeId;

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

}

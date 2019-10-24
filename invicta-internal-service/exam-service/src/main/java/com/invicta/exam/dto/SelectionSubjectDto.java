package com.invicta.exam.dto;

public class SelectionSubjectDto {
	
	private Long selectionSubjectId;
	private String selectionSubjectName;
	private String selectionSubjectCategory;

	public Long getSelectionSubjectId() {
		return selectionSubjectId;
	}

	public void setSelectionSubjectId(Long selectionSubjectId) {
		this.selectionSubjectId = selectionSubjectId;
	}

	public String getSelectionSubjectName() {
		return selectionSubjectName;
	}

	public void setSelectionSubjectName(String selectionSubjectName) {
		this.selectionSubjectName = selectionSubjectName;
	}

	public String getSelectionSubjectCategory() {
		return selectionSubjectCategory;
	}

	public void setSelectionSubjectCategory(String selectionSubjectCategory) {
		this.selectionSubjectCategory = selectionSubjectCategory;
	}
}

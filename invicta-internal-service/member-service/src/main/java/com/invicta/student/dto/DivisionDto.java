package com.invicta.student.dto;

public class DivisionDto {
	
	private Long divisionId;
	
	private Long gradeId;
	
	private String divisionName;
	
	private int gradeName;

	public int getGradeName() {
		return gradeName;
	}

	public void setGradeName(int gradeName) {
		this.gradeName = gradeName;
	}

	public Long getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(Long divisionId) {
		this.divisionId = divisionId;
	}

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}
	
}

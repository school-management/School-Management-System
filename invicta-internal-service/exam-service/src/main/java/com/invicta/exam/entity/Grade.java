package com.invicta.exam.entity;

import java.io.Serializable;


public class Grade implements Serializable {

	private Long gradeId;
	private int gradeName;

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public int getGradeName() {
		return gradeName;
	}

	public void setGradeName(int gradeName) {
		this.gradeName = gradeName;
	}

}

package com.invicta.student.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(schema = "studentservice", name = "grade")
public class Grade implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

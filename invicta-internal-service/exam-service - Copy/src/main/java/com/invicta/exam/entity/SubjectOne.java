package com.invicta.exam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject1to8", schema = "examservice")
public class SubjectOne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subjectId", nullable = false)
	private Long subjectId;
	
	@Column(name = "subjectName", nullable = false)
	private String subjectName;
	
	@Column(name = "gradeId", nullable = false)
	private Long gradeId;

	public SubjectOne(Long subjectId, String subjectName, Long gradeId) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.gradeId = gradeId;
	}
	
	

	public SubjectOne(Long gradeId) {
		super();
		this.gradeId = gradeId;
	}



	public SubjectOne() {
		super();
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

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}
	
	

//	public Long getsId() {
//		return sId;
//	}
//
//	public void setsId(Long sId) {
//		this.sId = sId;
//	}
	

}

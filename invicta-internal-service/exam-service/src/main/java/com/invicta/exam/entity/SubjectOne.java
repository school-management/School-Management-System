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
<<<<<<< HEAD
	
	@Column(name = "sId", nullable = false)
	private Long sId;


	public SubjectOne(Long subjectId, String subjectName, Long sId) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.sId = sId;
	}

	public SubjectOne(Long sId) {
		super();
		this.sId = sId;
	}

	public SubjectOne() {
		super();
	}
=======

	@Column(name = "gradeId", nullable = false)
	private Long gradeId;
>>>>>>> aeb3b123ea345ab321014a602c063654eac9d1ff

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

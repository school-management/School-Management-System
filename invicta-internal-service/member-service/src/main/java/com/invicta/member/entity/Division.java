package com.invicta.member.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(schema="memberservice", name="division")
public class Division implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long divisionId;
	
	
	@ManyToOne
	@JoinColumn(name="gradeId")
	private Grade gradeId;
	
	
	private String divisionName;


	public Long getDivisionId() {
		return divisionId;
	}


	public void setDivisionId(Long divisionId) {
		this.divisionId = divisionId;
	}


	public Grade getGradeId() {
		return gradeId;
	}


	public void setGradeId(Grade gradeId) {
		this.gradeId = gradeId;
	}


	public String getDivisionName() {
		return divisionName;
	}


	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}
	
}

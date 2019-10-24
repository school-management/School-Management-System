package com.invicta.exam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "selection_subject", schema = "examservice")
public class SelectionSubject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "selectionSubjectId", nullable = false)
	private Long selectionSubjectId;
	
	@Column(name = "selectionSubjectName", nullable = false)
	private String selectionSubjectName;
	
	@Column(name = "selectionSubjectCategory", nullable = false)
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

package com.invicta.member.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(schema = "memberservice", name = "culturalType")
public class CulturalType implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long culturalTypeId;
	
	private String eventCategory;

	public Long getCulturalTypeId() {
		return culturalTypeId;
	}

	public void setCulturalTypeId(Long culturalTypeId) {
		this.culturalTypeId = culturalTypeId;
	}

	public String getEventCategory() {
		return eventCategory;
	}

	public void setEventCategory(String eventCategory) {
		this.eventCategory = eventCategory;
	}
	
	

}

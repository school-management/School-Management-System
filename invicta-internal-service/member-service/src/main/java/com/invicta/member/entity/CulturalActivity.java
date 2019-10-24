package com.invicta.member.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(schema = "memberservice", name = "culturalActivity")
public class CulturalActivity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long culturalActivityId;
	
	private String eventName;
	
	private String eventType;
	
	private String level;
	
	private String underby;
	
	private String position;
	
	@ManyToOne
	@JoinColumn(name = "culturalTypeId", nullable = false)
	private CulturalType culturalType;
	
	@ManyToOne
	@JoinColumn(name = "studentId", nullable = false)
	private Student student;
	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Long getCulturalActivityId() {
		return culturalActivityId;
	}

	public void setCulturalActivityId(Long culturalActivityId) {
		this.culturalActivityId = culturalActivityId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getUnderby() {
		return underby;
	}

	public void setUnderby(String underby) {
		this.underby = underby;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public CulturalType getCulturalType() {
		return culturalType;
	}

	public void setCulturalType(CulturalType culturalType) {
		this.culturalType = culturalType;
	}
	
	
}

package com.invicta.member.dto;


public class CulturalActivityDto {
	
	private Long culturalActivityId;
	
	private String eventName;
	
	private String eventType;
	
	private String level;
	
	private String underby;
	
	private String position;
	
	private Long culturalTypeId;
	
	private Long studentId;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
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

	public Long getCulturalTypeId() {
		return culturalTypeId;
	}

	public void setCulturalTypeId(Long culturalTypeId) {
		this.culturalTypeId = culturalTypeId;
	}

	
	
	
}

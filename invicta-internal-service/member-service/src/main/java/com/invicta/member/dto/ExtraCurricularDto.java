package com.invicta.member.dto;

public class ExtraCurricularDto {
	
	private Long extraCurricularId;
	
	private Long studentId;
	
	private Long sportId;
	
	
	private Long culturalId;
	
	private Long AthId;
	
	private String comments;

	public Long getExtraCurricularId() {
		return extraCurricularId;
	}

	public void setExtraCurricularId(Long extraCurricularId) {
		this.extraCurricularId = extraCurricularId;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getSportId() {
		return sportId;
	}

	public void setSportId(Long sportId) {
		this.sportId = sportId;
	}

	public Long getCulturalId() {
		return culturalId;
	}

	public void setCulturalId(Long culturalId) {
		this.culturalId = culturalId;
	}

	public Long getAthId() {
		return AthId;
	}

	public void setAthId(Long athId) {
		AthId = athId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
}

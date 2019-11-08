package com.invicta.exam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scholarshipresults", schema = "examservice")
public class ScholarshipResults {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long scholarshipResultId;
	
	@Column(nullable = false)
	private Long sId;
	
	@Column(nullable = false)
	private Long year;
	
	@Column(nullable = false)
	private Long indexNo;
	
	@Column(nullable = false)
	private Long marks;
	
	@Column(nullable = false)
	private Long cutOffMarks;
	
	@Column(nullable = false)
	private String results;
	
	@Column(nullable = false)
	private String incomeStatus;

	public Long getScholarshipResultId() {
		return scholarshipResultId;
	}

	public void setScholarshipResultId(Long scholarshipResultId) {
		this.scholarshipResultId = scholarshipResultId;
	}
	
	

	public Long getsId() {
		return sId;
	}

	public void setsId(Long sId) {
		this.sId = sId;
	}

	public Long getYear() {
		return year;
	}

	public void setYear(Long year) {
		this.year = year;
	}

	public Long getIndexNo() {
		return indexNo;
	}

	public void setIndexNo(Long indexNo) {
		this.indexNo = indexNo;
	}

	public Long getMarks() {
		return marks;
	}

	public void setMarks(Long marks) {
		this.marks = marks;
	}

	public Long getCutOffMarks() {
		return cutOffMarks;
	}

	public void setCutOffMarks(Long cutOffMarks) {
		this.cutOffMarks = cutOffMarks;
	}

	public String getResults() {
		return results;
	}

	public void setResults(String results) {
		this.results = results;
	}

	public String getIncomeStatus() {
		return incomeStatus;
	}

	public void setIncomeStatus(String incomeStatus) {
		this.incomeStatus = incomeStatus;
	}

}

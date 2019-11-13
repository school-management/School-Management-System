package com.invicta.exam.dto;

public class ScholarshipResultsDto {

	private Long scholarshipResultId;
	private Long sId;
	private Long year;
	private Long indexNo;
	private Long marks;
	private Long cutOffMarks;
	private String results;
	private String incomeStatus;

	public Long getsId() {
		return sId;
	}

	public void setsId(Long sId) {
		this.sId = sId;
	}

	public Long getScholarshipResultId() {
		return scholarshipResultId;
	}

	public void setScholarshipResultId(Long scholarshipResultId) {
		this.scholarshipResultId = scholarshipResultId;
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

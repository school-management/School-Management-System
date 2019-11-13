package com.invicta.exam.service;

import java.util.List;

import com.invicta.exam.entity.ScholarshipResults;

public interface ScholarshipResultsService {

	public ScholarshipResults createScholarshipResult(ScholarshipResults scholarshipResults);

	public List<ScholarshipResults> getAllScholarshipResults();

	public ScholarshipResults getByScholarshipResultId(Long scholarshipResultId);

	public ScholarshipResults deleteByScholarshipResultId(Long scholarshipResultId);

	public ScholarshipResults updateSubject(ScholarshipResults scholarshipResults);
	
	public List<ScholarshipResults> getAllScholarshipResultId();

}

package com.invicta.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.invicta.exam.entity.ScholarshipResults;

public interface ScholarshipResultsRepository extends JpaRepository<ScholarshipResults, Long>{

	public ScholarshipResults findByScholarshipResultId(Long scholarshipResultId);
	
	String fetchAllScholarshipId = "SELECT scholarship_result_id FROM scholarshipresults";
	@Query(value = fetchAllScholarshipId, nativeQuery = true)
	<T> List<T> getAllScholarshipId();	
	
	String fetchAllStudentId = "SELECT s_id FROM student";
	@Query(value = fetchAllStudentId, nativeQuery = true)
	<T> List<T> getAllStudentId();	

}

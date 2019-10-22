package com.invicta.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.invicta.exam.entity.SubjectOne;

public interface SubjectOneRepository extends JpaRepository<SubjectOne, Long>{

	public SubjectOne findBySubjectId(Long subjectId);
	
//	List<SubjectOne> save(List<SubjectOne> subjectOne);
	
	String fetchAllgradeIdfromSubjectOne = "SELECT grade_id FROM subject1to8";

	@Query(value = fetchAllgradeIdfromSubjectOne, nativeQuery = true)
	<T> List<T> getAllgradeIdfromSubjectOne();
	
	String fetchAllgradeIdfromgrade = "SELECT grade_id FROM grade";

	@Query(value = fetchAllgradeIdfromgrade, nativeQuery = true)
	<T> List<T> getAllgradeIdfromgrade();

}

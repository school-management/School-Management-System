package com.invicta.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.invicta.exam.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long>{

	public Subject findBySubjectId(Long SubjectId);
	
	String fetchAllSubjectId = "SELECT subject_id FROM subject";
	@Query(value = fetchAllSubjectId, nativeQuery = true)
	<T> List<T> getAllSubjectId();	

	String fetchAllgradeId = "SELECT grade_id FROM grade";
	@Query(value = fetchAllgradeId, nativeQuery = true)
	<T> List<T> getAllgradeId();
}

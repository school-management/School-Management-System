package com.invicta.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invicta.student.entity.Grade;

public interface GradeRepository extends JpaRepository<Grade, Long>{
	public Grade findGradeByGradeId(Long gradeId);
	
	
}

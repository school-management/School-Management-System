package com.invicta.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invicta.member.entity.Grade;

public interface GradeRepository extends JpaRepository<Grade, Long>{
	public Grade findGradeByGradeId(Long gradeId);
	
	
}

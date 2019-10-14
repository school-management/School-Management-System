package com.invicta.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invicta.exam.entity.Subject1To8;

public interface Subject1To8Repository extends JpaRepository<Subject1To8, Long>{

	public Subject1To8 findBySubjectId(Long subjectId);
}

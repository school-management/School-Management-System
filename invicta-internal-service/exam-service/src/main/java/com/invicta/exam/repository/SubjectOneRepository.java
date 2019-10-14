package com.invicta.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invicta.exam.entity.SubjectOne;

public interface SubjectOneRepository extends JpaRepository<SubjectOne, Long>{

	public SubjectOne findBySubjectId(Long subjectId);
}

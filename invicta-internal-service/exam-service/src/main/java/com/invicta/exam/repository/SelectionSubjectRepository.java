package com.invicta.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invicta.exam.entity.SelectionSubject;

public interface SelectionSubjectRepository extends JpaRepository<SelectionSubject, Long>{

	public SelectionSubject findBySelectionSubjectId(Long selectionSubjectId);
}

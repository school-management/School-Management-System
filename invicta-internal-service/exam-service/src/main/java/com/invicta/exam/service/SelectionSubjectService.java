package com.invicta.exam.service;

import java.util.List;

import com.invicta.exam.entity.SelectionSubject;


public interface SelectionSubjectService {

	public SelectionSubject createSelectionSubject(SelectionSubject selectionSubject);

	public List<SelectionSubject> getAllSelectionSubjects();

	public SelectionSubject getBySelectionSubjectId(Long selectionSubjectId);

	public SelectionSubject deleteBySelectionSubjectId(Long selectionSubjectId);

	public SelectionSubject updateSubject(SelectionSubject selectionSubject);

}

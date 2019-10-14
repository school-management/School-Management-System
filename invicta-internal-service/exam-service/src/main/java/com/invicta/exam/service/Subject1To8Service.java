package com.invicta.exam.service;

import java.util.List;

import com.invicta.exam.entity.Subject1To8;

public interface Subject1To8Service {

	public Subject1To8 createSubject(Subject1To8 subject1To8);

	public List<Subject1To8> getAllSubjects();

	public Subject1To8 getBySubjectId(Long subjectId);

	public Subject1To8 deleteBySubjectId(Long subjectId);

	public Subject1To8 updateSubject(Subject1To8 subject1To8);
}

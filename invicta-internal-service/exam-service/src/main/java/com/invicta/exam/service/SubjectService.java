package com.invicta.exam.service;

import java.util.List;

import com.invicta.exam.entity.Grade;
import com.invicta.exam.entity.Subject;


public interface SubjectService {

	public Subject createSubject(Subject subject);

	public List<Subject> getAllSubjects();

	public Subject getBySubjectId(Long SubjectId);

	public Subject deleteBySubjectId(Long SubjectId);

	public Subject updateSubject(Subject subject);
	
	public List<Subject> getAllSubjectId();

	public List<Grade> getAllGradeId();

}

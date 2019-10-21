package com.invicta.exam.service;

import java.util.List;

import com.invicta.exam.entity.Student;
import com.invicta.exam.entity.SubjectList;
import com.invicta.exam.entity.SubjectOne;

public interface SubjectOneService {

	public SubjectOne createSubject(SubjectOne subject1To8);

	public List<SubjectOne> getAllSubjects();

	public SubjectOne getBySubjectId(Long subjectId);

	public SubjectOne deleteBySubjectId(Long subjectId);

	public SubjectOne updateSubject(SubjectOne subject1To8);
	
	public List<SubjectOne> getsubjectById();
	
	public List<SubjectOne> getAllstudentId();
	
	public List<SubjectOne> getAllsubjectId();
	
;
}



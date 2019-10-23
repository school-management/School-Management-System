package com.invicta.exam.service;

import java.util.List;

<<<<<<< HEAD
import com.invicta.exam.entity.Student;
import com.invicta.exam.entity.SubjectList;
=======
import com.invicta.exam.entity.Grade;
>>>>>>> aeb3b123ea345ab321014a602c063654eac9d1ff
import com.invicta.exam.entity.SubjectOne;

public interface SubjectOneService {

	public SubjectOne createSubject(SubjectOne subject1To8);

	public List<SubjectOne> getAllSubjects();

	public SubjectOne getBySubjectId(Long subjectId);

	public SubjectOne deleteBySubjectId(Long subjectId);

	public SubjectOne updateSubject(SubjectOne subject1To8);

	public List<SubjectOne> getsubjectById();
<<<<<<< HEAD
	
	public List<SubjectOne> getAllstudentId();
	
	public List<SubjectOne> getAllsubjectId();
	
;
=======

	public List<SubjectOne> getallgradebyId();

	public List<Grade> getAllGradeId();

//	public SubjectOne getBySubjectId(Long subjectId);
	
	
	
>>>>>>> aeb3b123ea345ab321014a602c063654eac9d1ff
}



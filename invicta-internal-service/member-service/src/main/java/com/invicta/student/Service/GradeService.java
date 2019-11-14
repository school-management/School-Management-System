package com.invicta.student.Service;

import java.util.List;

import com.invicta.student.entity.Grade;

public interface GradeService {
	public Grade saveGrade(Grade grade);
	
	public List<Grade> getAllGrade();
	
	public Grade getById(Long gradeId);
	
	public Grade deleteById(Long gradeId);
	
	public Grade updateGrade(Grade grade);
}

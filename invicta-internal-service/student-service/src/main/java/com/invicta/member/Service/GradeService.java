package com.invicta.member.Service;

import java.util.List;

import com.invicta.member.entity.Grade;

public interface GradeService {
	public Grade saveGrade(Grade grade);
	
	public List<Grade> getAllGrade();
	
	public Grade getById(Long gradeId);
	
	public Grade deleteById(Long gradeId);
	
	public Grade updateGrade(Grade grade);
}

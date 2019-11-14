package com.invicta.student.Service;

import java.util.List;

import com.invicta.student.entity.Division;

public interface DivisionService {
	public Division saveDivision(Division division);
	
	public List<Division> getAllDivision();
	
	public Division getDivisionById(Long divisionId);
	
	public Division deleteById(Long divisionId);
	
	public Division updateDivision(Division division);
	
	public List<Division> getDivisionByName(String name);
	
	public List<String> getDivisionByGradeId(Long gradeId);
	
}

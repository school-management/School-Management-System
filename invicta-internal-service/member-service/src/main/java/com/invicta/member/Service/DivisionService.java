package com.invicta.member.Service;

import java.util.List;

import com.invicta.member.entity.Division;

public interface DivisionService {
	public Division saveDivision(Division division);
	
	public List<Division> getAllDivision();
	
	public Division getDivisionById(Long divisionId);
	
	public Division deleteById(Long divisionId);
	
	public Division updateDivision(Division division);
	
	
}

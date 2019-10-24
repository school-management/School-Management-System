package com.invicta.member.Service;

import java.util.List;

import com.invicta.member.entity.ExtraCurricular;




public interface ExtraCurricularService {
	
	public ExtraCurricular saveExtraCurricular(ExtraCurricular extraCurricular);
	
	public List<ExtraCurricular> getAllExtraCurricular();
	
	public ExtraCurricular getExtraCurricularById(Long extraCurricularId);
	
	public ExtraCurricular deleteById(Long divisionId);
	
	public ExtraCurricular updateExtraCurricular(ExtraCurricular extraCurricular);
	
	public List<ExtraCurricular> getExtraCurricularByName(String name);
	
	public List<String> getExtraCurricularByStudentId(Long studentId);
}

package com.invicta.student.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.student.Service.ExtraCurricularService;
import com.invicta.student.entity.ExtraCurricular;
import com.invicta.student.repository.ExtraCurricularRepository;

@Service
public class ExtraCurricularServiceImpl implements ExtraCurricularService{
	
	@Autowired
	private ExtraCurricularRepository extraCurricularRepository;
	
	@Override
	public ExtraCurricular saveExtraCurricular(ExtraCurricular extraCurricular) {
	
		return extraCurricularRepository.save(extraCurricular);
	}

	@Override
	public List<ExtraCurricular> getAllExtraCurricular() {
		
		return extraCurricularRepository.findAll();
	}

	@Override
	public ExtraCurricular getExtraCurricularById(Long extraCurricularId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExtraCurricular deleteById(Long divisionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExtraCurricular updateExtraCurricular(ExtraCurricular extraCurricular) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExtraCurricular> getExtraCurricularByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getExtraCurricularByStudentId(Long studentId) {
		// TODO Auto-generated method stub
		return null;
	}

}

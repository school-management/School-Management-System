package com.invicta.member.ServiceImp;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Service.GradeService;
import com.invicta.member.entity.Grade;
import com.invicta.member.repository.GradeRepository;

@Service
public class GradeServiceImpl implements GradeService{
	
	@Autowired
	private GradeRepository gradeRepository;
	
	
	private static Logger logger = LogManager.getLogger(GradeRepository.class);
	
	@Override
	public Grade saveGrade(Grade grade) {
		try {
			return gradeRepository.save(grade);
		}catch(Exception e) {
			logger.info("grade service Implementation -->",e.getMessage());
		}
		return null;
	}

	@Override
	public List<Grade> getAllGrade() {
		
		return null;
	}

	@Override
	public Grade getById(Long gradeId) {
		
		return null;
	}

	@Override
	public Grade deleteById(Long gradeId) {
		
		return null;
	}

}

package com.invicta.student.ServiceImp;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.student.Service.GradeService;
import com.invicta.student.entity.Grade;
import com.invicta.student.repository.GradeRepository;

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
		logger.info("grade service Implementation -->");
		return gradeRepository.findAll();
	}

	@Override
	public Grade getById(Long gradeId) {
		logger.info("grade service Implementation -->");
		return gradeRepository.findGradeByGradeId(gradeId);
	}

	@Override
	public Grade deleteById(Long gradeId) {
		logger.info("grade service Implementation -->");
		gradeRepository.deleteById(gradeId);
		return null;
	}

	@Override
	public Grade updateGrade(Grade grade) {
		Long gradeId=grade.getGradeId();
		
		boolean isExist=gradeRepository.findGradeByGradeId(gradeId) != null;
		if(isExist){
			return gradeRepository.save(grade);
		}
		
		return null;
	}

}

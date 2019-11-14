package com.invicta.student.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.student.Converter.GradedtoConverter;
import com.invicta.student.Service.GradeService;
import com.invicta.student.dto.GradeDto;
import com.invicta.student.entity.Grade;

@Service
public class GradeMapper {
	
	@Autowired
	private GradeService gradeService;
	
	private GradedtoConverter gradeConverter;
	private static Logger logger = LogManager.getLogger(GradedtoConverter.class);
	
	
	@SuppressWarnings("static-access")
	public Grade saveGrade(GradeDto gradeDto) {
		logger.info("grade Mapper -> grade Saved");
		return gradeService.saveGrade(gradeConverter.GradeDtoTograde(gradeDto));
	}
	
	@SuppressWarnings("static-access")
	public List<GradeDto> listGrade(){
		logger.info("grade Mapper -> grade listed");
		List<Grade> listgrade=gradeService.getAllGrade();
		return gradeConverter.GradeToGradeDto(listgrade);
		
	}
	
	@SuppressWarnings("static-access")
	public GradeDto getGradeById(Long gradeId) {
		logger.info("grade Mapper -> grade getgradeById");
		Grade grade=gradeService.getById(gradeId);
		return gradeConverter.GradeEntityToGradeDto(grade); 
	}
	
	
	@SuppressWarnings("unused")
	public GradeDto deleteGrade(Long gradeId) {
		logger.info("grade Mapper -> grade deletegrade");
		Grade grade=gradeService.deleteById(gradeId);
		return null;
	}
}

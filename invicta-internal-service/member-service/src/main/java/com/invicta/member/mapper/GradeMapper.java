package com.invicta.member.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Converter.GradedtoConverter;
import com.invicta.member.Service.GradeService;
import com.invicta.member.dto.GradeDto;
import com.invicta.member.entity.Grade;

@Service
public class GradeMapper {
	
	@Autowired
	private GradeService gradeService;
	
	private GradedtoConverter gradeConverter;
	private static Logger logger = LogManager.getLogger(GradedtoConverter.class);
	
	
	@SuppressWarnings("static-access")
	public Grade saveGrade(GradeDto gradeDto) {
		logger.info("status Mapper -> Status Saved");
		return gradeService.saveGrade(gradeConverter.GradeDtoTograde(gradeDto));
	}
	
	@SuppressWarnings("static-access")
	public List<GradeDto> listGrade(){
		logger.info("status Mapper -> Status listed");
		List<Grade> listgrade=gradeService.getAllGrade();
		return gradeConverter.GradeToGradeDto(listgrade);
		
	}
	
	@SuppressWarnings("static-access")
	public GradeDto getGradeById(Long gradeId) {
		logger.info("status Mapper -> Status getgradeById");
		Grade grade=gradeService.getById(gradeId);
		return gradeConverter.GradeEntityToGradeDto(grade); 
	}
	
	
	@SuppressWarnings("unused")
	public GradeDto deleteGrade(Long gradeId) {
		logger.info("status Mapper -> Status deletegrade");
		Grade grade=gradeService.deleteById(gradeId);
		return null;
	}
}

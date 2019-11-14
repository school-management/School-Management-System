package com.invicta.member.Converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.invicta.member.dto.GradeDto;
import com.invicta.member.entity.Grade;

@Service
public class GradedtoConverter {
	private static Logger logger = LogManager.getLogger(GradeDto.class);
	
	public static Grade GradeDtoTograde(GradeDto gradeDto) {
		Grade grade =new Grade();
		if(gradeDto != null) {
			logger.info("Grade converter---> DTO To Entity");
			grade.setGradeId(gradeDto.getGradeId());
			grade.setGradeName(gradeDto.getGradeName());
			return grade;
		}
		return null;
	}
	
	public static List<GradeDto> GradeToGradeDto(List<Grade> gradelist){
		if(gradelist !=null) {
			logger.info("Grade converter---> Entity To Dto");
			List<GradeDto> listgradeDto=new ArrayList<>();
			for (Grade grade:gradelist) {
				logger.info("Grade Converter--> Grade List converte");
				GradeDto gradeDto=new GradeDto();
				gradeDto.setGradeId(grade.getGradeId());
				gradeDto.setGradeName(grade.getGradeName());
				listgradeDto.add(gradeDto);
				
			}
			return listgradeDto;
		}
		return null;
	}
	
	public static GradeDto GradeEntityToGradeDto(Grade grade) {
		GradeDto gradeDto =new GradeDto();
		if(grade !=null) {
			logger.info("Grade Converter --> Grade Object Entity To Dto");
			gradeDto.setGradeId(grade.getGradeId());
			gradeDto.setGradeName(grade.getGradeName());
			return gradeDto;
			
		}
		return null;
	}
}

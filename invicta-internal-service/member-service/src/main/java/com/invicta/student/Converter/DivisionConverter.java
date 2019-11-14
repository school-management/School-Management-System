package com.invicta.student.Converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.invicta.student.dto.DivisionDto;
import com.invicta.student.entity.Division;
import com.invicta.student.entity.Grade;

@Service
public class DivisionConverter {
	
	private static Logger logger = LogManager.getLogger(DivisionDto.class);
	
	public static Division DivisionDtoToDivision(DivisionDto divisionDto) {
		Division division=new Division();
		if(divisionDto != null) {
			logger.info("Division converter---> DTO To Entity");
			division.setDivisionId(divisionDto.getDivisionId());
			division.setDivisionName(divisionDto.getDivisionName());
			
			Grade grade=new Grade();
			grade.setGradeId(divisionDto.getGradeId());
			division.setGrade(grade);
			
			return division;
			
		}
		return null;
	}
	
	public static List<DivisionDto> DivisionToDivisionDtoList(List<Division> divisionlist){
		if(divisionlist != null) {
			logger.info("Division converter---> Entity To Dto list");
			List<DivisionDto> listDivisionDto=new ArrayList<>();
			for(Division division:divisionlist) {
				logger.info("Division Converter--> Division List converte");
				DivisionDto divisionDto=new DivisionDto();
				divisionDto.setDivisionId(division.getDivisionId());
				divisionDto.setDivisionName(division.getDivisionName());
				divisionDto.setGradeName(division.getGrade().getGradeName());
				divisionDto.setGradeId(division.getGrade().getGradeId());
				listDivisionDto.add(divisionDto);
				
			}
			return listDivisionDto;
		}
		return null;
	}
	
	public static DivisionDto DivisionToDivisionDto(Division division) {
		DivisionDto divisionDto=new DivisionDto();
		if(division !=null) {
			logger.info("Division Converter --> division Object Entity To Dto");
			divisionDto.setDivisionId(division.getDivisionId());
			divisionDto.setDivisionName(division.getDivisionName());
			divisionDto.setGradeId(division.getGrade().getGradeId());
			divisionDto.setGradeName(division.getGrade().getGradeName());
			return divisionDto;
		}
		return null;
	}
}

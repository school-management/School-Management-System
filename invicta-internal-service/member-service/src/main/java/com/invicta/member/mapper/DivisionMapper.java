package com.invicta.member.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Converter.DivisionConverter;
import com.invicta.member.Service.DivisionService;
import com.invicta.member.dto.DivisionDto;
import com.invicta.member.entity.Division;

@Service
public class DivisionMapper {
	
	@Autowired
	private DivisionService divisionService;
	
	private DivisionConverter divisionConverter;
	
	private static Logger logger = LogManager.getLogger(DivisionConverter.class);
	
	@SuppressWarnings("static-access")
	public Division saveDivision(DivisionDto divisionDto) {
		logger.info("division Mapper -> division Saved");
		return divisionService.saveDivision(divisionConverter.DivisionDtoToDivision(divisionDto));
		
	}
	
	@SuppressWarnings("static-access")
	public List<DivisionDto> listDivision(){
		logger.info("division Mapper -> division listed");	
		List<Division> listDivision=divisionService.getAllDivision();
		return divisionConverter.DivisionToDivisionDtoList(listDivision);
	}
	
	@SuppressWarnings("static-access")
	public DivisionDto getDivisionById(Long divisionId) {
		logger.info("division Mapper -> division getdivisionById");
		Division division=divisionService.getDivisionById(divisionId);
		return divisionConverter.DivisionToDivisionDto(division);
	}
	
	public DivisionDto deleteDivision(Long divisionId) {
		logger.info("division Mapper -> division deletedivision");
		Division division=divisionService.deleteById(divisionId);
		return null;
	}
	
	@SuppressWarnings("static-access")
	public Division updateDivision(DivisionDto divisionDto) {
		return divisionService.updateDivision(divisionConverter.DivisionDtoToDivision(divisionDto));
	}
	
	@SuppressWarnings("static-access")
	public List<DivisionDto> getDivisionByName(String name){
		List<Division> listDivision=divisionService.getDivisionByName(name);
		
		return divisionConverter.DivisionToDivisionDtoList(listDivision);
	}
	
	public List<String> getDivisionByGradeId(Long gradeId){
		
		return divisionService.getDivisionByGradeId(gradeId);
	}
}

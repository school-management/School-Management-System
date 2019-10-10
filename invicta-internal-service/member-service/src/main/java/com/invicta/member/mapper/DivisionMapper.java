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
		logger.info("status Mapper -> Status Saved");
		return divisionService.saveDivision(divisionConverter.DivisionDtoToDivision(divisionDto));
		
	}
	
	@SuppressWarnings("static-access")
	public List<DivisionDto> listDivision(){
		logger.info("status Mapper -> Status listed");	
		List<Division> listDivision=divisionService.getAllDivision();
		return divisionConverter.DivisionToDivisionDtoList(listDivision);
	}

}

package com.invicta.member.ServiceImp;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Service.DivisionService;
import com.invicta.member.entity.Division;
import com.invicta.member.repository.DivisionRepository;

@Service
public class DivisionServiceImpl implements DivisionService{
	
	@Autowired
	private DivisionRepository divisionRepository;
	
	private static Logger logger = LogManager.getLogger(DivisionRepository.class);
	
	@Override
	public Division saveDivision(Division division) {
		try {
			return divisionRepository.save(division);
		}catch(Exception e) {
			logger.info("division service Implementation -->",e.getMessage());
		}
		return null;
	}

	@Override
	public List<Division> getAllDivision() {
		logger.info("division service Implementation -->");
		return divisionRepository.findAll();
	}

	@Override
	public Division getDivisionById(Long divisionId) {
		logger.info("division service Implementation -->");
		return divisionRepository.findDivisionByDivisionId(divisionId);
	}

	@Override
	public Division deleteById(Long divisionId) {
		logger.info("division service Implementation -->");
		divisionRepository.deleteById(divisionId);
		return null;
	}

	@Override
	public Division updateDivision(Division division) {
		Long divisionId=division.getDivisionId();
		
		boolean isExist=divisionRepository.findDivisionByDivisionId(divisionId) != null;
		if(isExist) {
			return divisionRepository.save(division);
		}else {
		}
		return null;
	}

	@Override
	public List<Division> getDivisionByName(String name) {
		
		return divisionRepository.findDivisionByName(name);
	}

}

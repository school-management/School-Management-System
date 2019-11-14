package com.invicta.student.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.student.Converter.ExtraCurricularConverter;
import com.invicta.student.Service.ExtraCurricularService;
import com.invicta.student.dto.ExtraCurricularDto;
import com.invicta.student.entity.ExtraCurricular;


@Service
public class ExtraCurricularMapper {
	
	@Autowired
	private ExtraCurricularService extraCurricularService;
	
	private ExtraCurricularConverter extraCurricularConverter;
	
	private static Logger logger = LogManager.getLogger(ExtraCurricularDto.class);
	
	@SuppressWarnings("static-access")
	public ExtraCurricular saveExtraCurricular(ExtraCurricularDto extraCurricularDto) {
		logger.info("ExtraCurricular Mapper -> ExtraCurricular Saved");
		return extraCurricularService.saveExtraCurricular(extraCurricularConverter.ExtraCurricularDtoTOEntity(extraCurricularDto));
		
	}
	
	@SuppressWarnings("static-access")
	public List<ExtraCurricularDto> listExtraCurricular(){
		logger.info("ExtraCurricular Mapper -> ExtraCurricular listed");	
		List<ExtraCurricular> listExtraCurricular=extraCurricularService.getAllExtraCurricular();
		return extraCurricularConverter.ExtraCurricularToDtoList(listExtraCurricular);
	}

}

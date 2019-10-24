package com.invicta.member.Converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.invicta.member.dto.ExtraCurricularDto;
import com.invicta.member.entity.ExtraCurricular;



@Service
public class ExtraCurricularConverter {
	
	private static Logger logger = LogManager.getLogger(ExtraCurricularDto.class);
	
	public static ExtraCurricular ExtraCurricularDtoTOEntity(ExtraCurricularDto extraCurricularDto){
		ExtraCurricular extraCurricular=new ExtraCurricular();
		if(extraCurricularDto != null) {
			logger.info("Division converter---> DTO To Entity");
			
			extraCurricular.setExtraCurricularId(extraCurricularDto.getExtraCurricularId());
			
			
			extraCurricular.setComments(extraCurricularDto.getComments());
			
			return extraCurricular;
		}
		return null;
		
	}
	
	public static List<ExtraCurricularDto> ExtraCurricularToDtoList(List<ExtraCurricular> extraCurricularlist){
		if(extraCurricularlist !=null) {
			List<ExtraCurricularDto> listExtraCurricularDto=new ArrayList<>();
			for(ExtraCurricular extraCurricular:extraCurricularlist) {
				ExtraCurricularDto extraCurricularDto=new ExtraCurricularDto();
				extraCurricularDto.setExtraCurricularId(extraCurricular.getExtraCurricularId());
				extraCurricularDto.setComments(extraCurricular.getComments());
				listExtraCurricularDto.add(extraCurricularDto);
			
			}
			return listExtraCurricularDto;
			
		}
		
		
		return null;
	}
	
	public static ExtraCurricularDto ExtraCurricularToDto(ExtraCurricular extraCurricular) {
		ExtraCurricularDto extraCurricularDto=new ExtraCurricularDto();
		if(extraCurricular != null) {
		extraCurricularDto.setExtraCurricularId(extraCurricular.getExtraCurricularId());
		extraCurricularDto.setComments(extraCurricular.getComments());
		return extraCurricularDto;
		}
		return null;
		
	}
	

}

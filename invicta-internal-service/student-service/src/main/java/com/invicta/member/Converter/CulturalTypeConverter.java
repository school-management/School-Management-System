package com.invicta.member.Converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.invicta.member.dto.CulturalTypeDto;
import com.invicta.member.entity.CulturalType;

@Service
public class CulturalTypeConverter {
	
	private static Logger logger = LogManager.getLogger(CulturalTypeDto.class);
	
	public static CulturalType CulturalTypeDtoToculturalType(CulturalTypeDto culturalTypeDto) {
		CulturalType culturalType=new CulturalType();
		if(culturalTypeDto!=null) {
			logger.info("culturalType converter---> DTO To Entity");
			culturalType.setCulturalTypeId(culturalTypeDto.getCulturalTypeId());
			culturalType.setEventCategory(culturalTypeDto.getEventCategory());
			return culturalType;
		}
		return null;
	}
	
	public static List<CulturalTypeDto> CulturalTypeToculturalTypeDtoList(List<CulturalType> culturalTypelist) {
		if(culturalTypelist != null) {
			List<CulturalTypeDto> listCulturalTypeDto=new ArrayList<>();
			for(CulturalType culturalType: culturalTypelist) {
				
				CulturalTypeDto culturalTypeDto=new CulturalTypeDto();
				culturalTypeDto.setCulturalTypeId(culturalType.getCulturalTypeId());
				culturalTypeDto.setEventCategory(culturalType.getEventCategory());
				listCulturalTypeDto.add(culturalTypeDto);
				
			}
			return listCulturalTypeDto;
		}
		return null;
	}
	
	public static CulturalTypeDto CulturalTypeToculturalTypeDto(CulturalType culturalType) {
		CulturalTypeDto culturalTypeDto=new CulturalTypeDto();
		
		if(culturalType != null) {
				
				culturalTypeDto.setCulturalTypeId(culturalType.getCulturalTypeId());
				culturalTypeDto.setEventCategory(culturalType.getEventCategory());
				return culturalTypeDto;
				
			}
			return null;
	
	}
}

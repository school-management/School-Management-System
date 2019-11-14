package com.invicta.member.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Converter.CulturalTypeConverter;
import com.invicta.member.Service.CulturalTypeService;
import com.invicta.member.dto.CulturalTypeDto;
import com.invicta.member.entity.CulturalType;

@Service
public class CulturalTypeMapper {
	
	@Autowired
	private CulturalTypeService culturalTypeService;
	
	@Autowired
	private CulturalTypeConverter culturalTypeConverter;
	
	private static Logger logger = LogManager.getLogger(CulturalTypeDto.class);
	
	@SuppressWarnings("static-access")
	public CulturalType saveCulturalType(CulturalTypeDto culturalTypeDto) {
		
		return culturalTypeService.saveCulturalType(culturalTypeConverter.CulturalTypeDtoToculturalType(culturalTypeDto));
	}
	
	@SuppressWarnings("static-access")
	public List<CulturalTypeDto> getAllCulturalType() {
		List<CulturalType> listCulturalType=culturalTypeService.getAllCulturalType();
		return culturalTypeConverter.CulturalTypeToculturalTypeDtoList(listCulturalType);
	}
	
	@SuppressWarnings("static-access")
	public CulturalTypeDto getCulturalTypeById(Long culturalTypeId) {
		logger.info("CulturalType Mapper -> CulturalType getCulturalTypeById");
		CulturalType culturalType=culturalTypeService.getCulturalTypeById(culturalTypeId); 
		return culturalTypeConverter.CulturalTypeToculturalTypeDto(culturalType);
	}
	
	public CulturalTypeDto deleteCulturalType(Long culturalTypeId) {
		logger.info("CulturalType Mapper -> CulturalType deleteCulturalType");
		@SuppressWarnings("unused")
		CulturalType culturalType=culturalTypeService.deleteById(culturalTypeId);
		return null;
	}
	
	@SuppressWarnings("static-access")
	public CulturalType updateCulturalType(CulturalTypeDto culturalTypeDto) {
		return culturalTypeService.updateCulturalType(culturalTypeConverter.CulturalTypeDtoToculturalType(culturalTypeDto));
	}
}

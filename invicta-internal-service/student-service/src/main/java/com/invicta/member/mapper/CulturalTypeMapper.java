package com.invicta.member.mapper;

import java.util.List;

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
	
	@SuppressWarnings("static-access")
	public CulturalType saveCulturalType(CulturalTypeDto culturalTypeDto) {
		
		return culturalTypeService.saveCulturalType(culturalTypeConverter.CulturalTypeDtoToculturalType(culturalTypeDto));
	}
	
	@SuppressWarnings("static-access")
	public List<CulturalTypeDto> getAllCulturalType() {
		List<CulturalType> listCulturalType=culturalTypeService.getAllCulturalType();
		return culturalTypeConverter.CulturalTypeToculturalTypeDtoList(listCulturalType);
	}
}

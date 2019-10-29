package com.invicta.member.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Converter.CulturalActivityConverter;
import com.invicta.member.Service.CulturalActivityService;
import com.invicta.member.dto.CulturalActivityDto;
import com.invicta.member.entity.CulturalActivity;

@Service
public class CulturalActivityMapper {
	
	@Autowired
	private CulturalActivityService culturalActivityService;
	
	private CulturalActivityConverter culturalActivityConverter;
	
	@SuppressWarnings("static-access")
	public CulturalActivity saveCulturalActivity(CulturalActivityDto culturalActivityDto) {
		return culturalActivityService.saveCulturalActivity(culturalActivityConverter.CulturalActivityDtoToEntity(culturalActivityDto));
		
	}
	
	@SuppressWarnings("static-access")
	public List<CulturalActivityDto> listCulturalActivity(){
		List<CulturalActivity> listCulturalActivity=culturalActivityService.getAllCulturalActivity();
		return culturalActivityConverter.CulturalActivityToDtoList(listCulturalActivity);
	}
	
}

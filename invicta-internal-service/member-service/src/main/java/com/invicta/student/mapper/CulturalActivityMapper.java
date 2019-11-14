package com.invicta.student.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.student.Converter.CulturalActivityConverter;
import com.invicta.student.Service.CulturalActivityService;
import com.invicta.student.dto.CulturalActivityDto;
import com.invicta.student.entity.CulturalActivity;

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

package com.invicta.member.Service;

import java.util.List;

import com.invicta.member.entity.CulturalActivity;



public interface CulturalActivityService {
	
	public CulturalActivity saveCulturalActivity(CulturalActivity culturalActivity);
	
	public List<CulturalActivity> getAllCulturalActivity();
	
	public CulturalActivity getCulturalActivityById(Long culturalActivityId);
	
	public CulturalActivity deleteById(Long culturalActivityId);
	
	public CulturalActivity updateCulturalActivity(CulturalActivity culturalActivity);
	
	public List<CulturalActivity> getCulturalActivityByName(String name);
	
	
	
}

package com.invicta.member.Service;

import java.util.List;

import com.invicta.member.entity.CulturalActivity;


public interface CulturalActivityService {
	
	public CulturalActivity saveCulturalActivity(CulturalActivity culturalActivity);
	
	public List<CulturalActivity> getAllCulturalActivity();
	
}

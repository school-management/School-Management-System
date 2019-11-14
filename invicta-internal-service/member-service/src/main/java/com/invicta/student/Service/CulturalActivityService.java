package com.invicta.student.Service;

import java.util.List;

import com.invicta.student.entity.CulturalActivity;


public interface CulturalActivityService {
	
	public CulturalActivity saveCulturalActivity(CulturalActivity culturalActivity);
	
	public List<CulturalActivity> getAllCulturalActivity();
	
}

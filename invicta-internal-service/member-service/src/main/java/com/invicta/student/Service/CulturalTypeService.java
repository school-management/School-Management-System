package com.invicta.student.Service;

import java.util.List;

import com.invicta.student.entity.CulturalType;

public interface CulturalTypeService {
	
	public CulturalType saveCulturalType(CulturalType culturalType);
	
	public List<CulturalType> getAllCulturalType();
}

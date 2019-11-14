package com.invicta.member.Service;

import java.util.List;

import com.invicta.member.entity.CulturalType;

public interface CulturalTypeService {
	
	public CulturalType saveCulturalType(CulturalType culturalType);
	
	public List<CulturalType> getAllCulturalType();
}

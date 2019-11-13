package com.invicta.member.Service;

import java.util.List;

import com.invicta.member.entity.CulturalType;


public interface CulturalTypeService {
	
	public CulturalType saveCulturalType(CulturalType culturalType);
	
	public List<CulturalType> getAllCulturalType();
	
	public CulturalType getCulturalTypeById(Long culturalTypeId);
	
	public CulturalType deleteById(Long culturalTypeId);
	
	public CulturalType updateCulturalType(CulturalType culturalType);
	
	public List<CulturalType> getCulturalTypeByName(String name);
	
}

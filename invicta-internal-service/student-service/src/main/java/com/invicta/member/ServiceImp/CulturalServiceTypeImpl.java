package com.invicta.member.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Service.CulturalTypeService;
import com.invicta.member.entity.CulturalType;
import com.invicta.member.repository.CulturalTypeRepository;

@Service
public class CulturalServiceTypeImpl implements CulturalTypeService{
	
	@Autowired
	private CulturalTypeRepository culturalTypeRepository;
	
	@Override
	public CulturalType saveCulturalType(CulturalType culturalType) {
		
		return culturalTypeRepository.save(culturalType);
	}

	@Override
	public List<CulturalType> getAllCulturalType() {
		
		return culturalTypeRepository.findAll();
	}

}

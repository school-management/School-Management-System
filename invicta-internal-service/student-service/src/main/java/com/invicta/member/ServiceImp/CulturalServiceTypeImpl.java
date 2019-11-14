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

	@Override
	public CulturalType getCulturalTypeById(Long culturalTypeId) {
		
		return culturalTypeRepository.findCulturalTypeByCulturalTypeId(culturalTypeId);
	}

	@Override
	public CulturalType deleteById(Long culturalTypeId) {
		
		culturalTypeRepository.deleteById(culturalTypeId);
		return null;
	}

	@Override
	public CulturalType updateCulturalType(CulturalType culturalType) {
		Long culturalTypeId=culturalType.getCulturalTypeId();
		
		boolean isExit=culturalTypeRepository.findCulturalTypeByCulturalTypeId(culturalTypeId)!=null;
		if(isExit) {
			return culturalTypeRepository.save(culturalType);
		}
		return null;
	}

	@Override
	public List<CulturalType> getCulturalTypeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}

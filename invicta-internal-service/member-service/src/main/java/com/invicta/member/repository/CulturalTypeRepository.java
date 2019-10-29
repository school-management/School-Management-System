package com.invicta.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invicta.member.entity.CulturalType;

public interface CulturalTypeRepository extends JpaRepository<CulturalType, Long>{
	public CulturalType findCulturalTypeByCulturalTypeId(Long culturalTypeId);
}

package com.invicta.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invicta.student.entity.CulturalType;

public interface CulturalTypeRepository extends JpaRepository<CulturalType, Long>{
	public CulturalType findCulturalTypeByCulturalTypeId(Long culturalTypeId);
}

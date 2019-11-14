package com.invicta.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invicta.member.entity.CulturalActivity;

public interface CulturalActivityRepository extends JpaRepository<CulturalActivity, Long>{
	public CulturalActivity findCulturalActivityByCulturalActivityId(Long culturalActivityId);
}

package com.invicta.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invicta.student.entity.CulturalActivity;

public interface CulturalActivityRepository extends JpaRepository<CulturalActivity, Long>{
	public CulturalActivity findCulturalActivityByCulturalActivityId(Long culturalActivityId);
}

package com.invicta.member.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.invicta.member.entity.CulturalActivity;

public interface CulturalActivityRepository extends JpaRepository<CulturalActivity, Long>{
	public CulturalActivity findCulturalActivityByCulturalActivityId(Long culturalActivityId);
	
	String FINDNAME="SELECT * FROM culturalActivity where eventName=?1";
	@Query(value =FINDNAME,nativeQuery=true)
	List<CulturalActivity> findCulturalActivityByName(String name);
}

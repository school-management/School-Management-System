package com.invicta.member.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Service.CulturalActivityService;
import com.invicta.member.entity.CulturalActivity;
import com.invicta.member.repository.CulturalActivityRepository;

@Service
public class CulturalActivityServiceImpl implements CulturalActivityService{
	
	@Autowired
	private CulturalActivityRepository culturalActivityRepository;
	@Override
	public CulturalActivity saveCulturalActivity(CulturalActivity culturalActivity) {
		
		return culturalActivityRepository.save(culturalActivity);
	}

	@Override
	public List<CulturalActivity> getAllCulturalActivity() {
		
		return culturalActivityRepository.findAll();
	}

}

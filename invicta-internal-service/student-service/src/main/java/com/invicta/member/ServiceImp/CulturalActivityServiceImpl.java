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

	@Override
	public CulturalActivity getCulturalActivityById(Long culturalActivityId) {
		
		return culturalActivityRepository.findCulturalActivityByCulturalActivityId(culturalActivityId);
	}

	@Override
	public CulturalActivity deleteById(Long culturalActivityId) {
		culturalActivityRepository.deleteById(culturalActivityId);
		return null;
	}

	@Override
	public CulturalActivity updateCulturalActivity(CulturalActivity culturalActivity) {
		Long culturalActivityId=culturalActivity.getCulturalActivityId();
		
		boolean isExit=culturalActivityRepository.findCulturalActivityByCulturalActivityId(culturalActivityId) !=null;
		if(isExit) {
			return culturalActivityRepository.save(culturalActivity);
		}else {
			
		}
		
		return null;
	}

	@Override
	public List<CulturalActivity> getCulturalActivityByName(String name) {
		
		return culturalActivityRepository.findCulturalActivityByName(name);
	}

}

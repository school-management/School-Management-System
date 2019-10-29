package com.invicta.member.Converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.invicta.member.dto.CulturalActivityDto;
import com.invicta.member.dto.CulturalTypeDto;
import com.invicta.member.entity.CulturalActivity;
import com.invicta.member.entity.CulturalType;
import com.invicta.member.entity.Student;

@Service
public class CulturalActivityConverter {
	
	private static Logger logger = LogManager.getLogger(CulturalTypeDto.class);
	
	public static CulturalActivity CulturalActivityDtoToEntity(CulturalActivityDto culturalActivityDto){
		CulturalActivity culturalActivity=new CulturalActivity();
		if(culturalActivity != null) {
			logger.info("culturalActivity converter---> DTO To Entity");
			culturalActivity.setCulturalActivityId(culturalActivityDto.getCulturalActivityId());
			
			CulturalType culturalType=new CulturalType();
			culturalType.setCulturalTypeId(culturalActivityDto.getCulturalTypeId());
			culturalActivity.setCulturalType(culturalType);
			
			Student student=new Student();
			student.setsId(culturalActivityDto.getStudentId());
			culturalActivity.setStudent(student);
			
			culturalActivity.setEventName(culturalActivityDto.getEventName());
			culturalActivity.setEventType(culturalActivityDto.getEventType());
			culturalActivity.setLevel(culturalActivityDto.getLevel());
			culturalActivity.setPosition(culturalActivityDto.getPosition());
			culturalActivity.setUnderby(culturalActivityDto.getUnderby());
			
			return culturalActivity;
			}
		
	return null;
		
	}
	
	public static List<CulturalActivityDto> CulturalActivityToDtoList(List<CulturalActivity> culturalActivitylist){
		if(culturalActivitylist !=null) {
			logger.info("culturalActivity converter---> Entity To Dto list");
			List<CulturalActivityDto> listCulturalActivityDto=new ArrayList<>();
			for(CulturalActivity culturalActivity: culturalActivitylist) {
				logger.info("culturalActivity Converter--> culturalActivity List converte");
				CulturalActivityDto culturalActivityDto=new CulturalActivityDto();
				culturalActivityDto.setCulturalActivityId(culturalActivity.getCulturalActivityId());
				
				culturalActivityDto.setCulturalTypeId(culturalActivity.getCulturalType().getCulturalTypeId());
				
				culturalActivityDto.setStudentId(culturalActivity.getStudent().getsId());
				
				culturalActivityDto.setEventName(culturalActivity.getEventName());
				culturalActivityDto.setEventType(culturalActivity.getEventType());
				culturalActivityDto.setLevel(culturalActivity.getLevel());
				culturalActivityDto.setPosition(culturalActivity.getPosition());
				culturalActivityDto.setUnderby(culturalActivity.getUnderby());
				listCulturalActivityDto.add(culturalActivityDto);
			}
			return listCulturalActivityDto;
		}
	return null;
		
	}
	public static CulturalActivityDto CulturalActivityToDto(CulturalActivity culturalActivity) {
		CulturalActivityDto culturalActivityDto=new CulturalActivityDto();
		if(culturalActivity != null) {
			
			logger.info("culturalActivity Converter --> culturalActivity Object Entity To Dto");
			culturalActivityDto.setCulturalActivityId(culturalActivity.getCulturalActivityId());
			
			culturalActivityDto.setCulturalTypeId(culturalActivity.getCulturalType().getCulturalTypeId());
			
			culturalActivityDto.setStudentId(culturalActivity.getStudent().getsId());
			
			culturalActivityDto.setEventName(culturalActivity.getEventName());
			culturalActivityDto.setEventType(culturalActivity.getEventType());
			culturalActivityDto.setLevel(culturalActivity.getLevel());
			culturalActivityDto.setPosition(culturalActivity.getPosition());
			culturalActivityDto.setUnderby(culturalActivity.getUnderby());
			return culturalActivityDto;
		}
		return null;
	}
}

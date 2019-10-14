package com.invicta.exam.convertor;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.invicta.exam.dto.Subject1To8Dto;
import com.invicta.exam.entity.Subject1To8;

@Service
public class Subject1To8Convertor {

	private static Logger logger = LogManager.getLogger(Subject1To8Dto.class);

	public static Subject1To8 SubjectDtoToSubject(Subject1To8Dto subject1To8Dto) {
		Subject1To8 subject1To8 = new Subject1To8();
		if (subject1To8Dto != null) {
			logger.info("Subject 1To8 Converter ----> DTO To Entity");
			subject1To8.setSubjectId(subject1To8Dto.getSubjectId());
			subject1To8.setSubjectName(subject1To8Dto.getSubjectName());
			subject1To8.setGradeId(subject1To8Dto.getGradeId());
			return subject1To8;
		}
		return null;

	}
	
	public static Subject1To8Dto SubjectToSubjectDto(Subject1To8 subject1To8) {
		Subject1To8Dto subject1To8Dto = new Subject1To8Dto();
		if (subject1To8Dto != null) {
			logger.info("Subject 1To8 Converter ----> Entity To DTO ");
			subject1To8Dto.setSubjectId(subject1To8.getSubjectId());
			subject1To8Dto.setSubjectName(subject1To8.getSubjectName());
			subject1To8Dto.setGradeId(subject1To8.getGradeId());
			return subject1To8Dto;
		}
		return null;

	}
	
	public static List<Subject1To8Dto> SubjectToSubjectDto(List<Subject1To8> subjectList){
		if(subjectList !=null) {
			logger.info("Subject To DTO Converter for List");
			List<Subject1To8Dto> listSubjectDto = new ArrayList<>();
			for(Subject1To8 subject1To8 : subjectList) {
				Subject1To8Dto subject1To8Dto = new Subject1To8Dto();
				subject1To8Dto.setSubjectId(subject1To8.getSubjectId());
				subject1To8Dto.setSubjectName(subject1To8.getSubjectName());
				subject1To8Dto.setGradeId(subject1To8.getGradeId());
				listSubjectDto.add(subject1To8Dto);
			}
			return listSubjectDto;
		}
		return null;
	}

}

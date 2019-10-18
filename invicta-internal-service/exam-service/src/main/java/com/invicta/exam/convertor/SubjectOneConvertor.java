package com.invicta.exam.convertor;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.invicta.exam.dto.SubjectOneDto;
import com.invicta.exam.entity.SubjectOne;

@Service
public class SubjectOneConvertor {

	private static Logger logger = LogManager.getLogger(SubjectOneDto.class);

	public static SubjectOne SubjectDtoToSubject(SubjectOneDto subject1To8Dto) {
		SubjectOne subject1To8 = new SubjectOne();
		if (subject1To8Dto != null) {
			logger.info("Subject 1To8 Converter ----> DTO To Entity");
			subject1To8.setSubjectId(subject1To8Dto.getSubjectId());
			subject1To8.setSubjectName(subject1To8Dto.getSubjectName());
			subject1To8.setsId(subject1To8Dto.getsId());
			return subject1To8;
		}
		return null;

	}
	
	@SuppressWarnings("unused")
	public static SubjectOneDto SubjectToSubjectDto(SubjectOne subject1To8) {
		SubjectOneDto subject1To8Dto = new SubjectOneDto();
		if (subject1To8Dto != null) {
			logger.info("Subject 1To8 Converter ----> Entity To DTO ");
			subject1To8Dto.setSubjectId(subject1To8.getSubjectId());
			subject1To8Dto.setSubjectName(subject1To8.getSubjectName());
			subject1To8Dto.setsId(subject1To8.getsId());
			return subject1To8Dto;
		}
		return null;

	}
	
	public static List<SubjectOneDto> SubjectToSubjectDto(List<SubjectOne> subjectList){
		if(subjectList !=null) {
			logger.info("Subject To DTO Converter for List");
			List<SubjectOneDto> listSubjectDto = new ArrayList<>();
			for(SubjectOne subject1To8 : subjectList) {
				SubjectOneDto subject1To8Dto = new SubjectOneDto();
				subject1To8Dto.setSubjectId(subject1To8.getSubjectId());
				subject1To8Dto.setSubjectName(subject1To8.getSubjectName());
				subject1To8Dto.setsId(subject1To8Dto.getsId());
				listSubjectDto.add(subject1To8Dto);
			}
			return listSubjectDto;
		}
		return null;
	}

}

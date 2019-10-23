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
	
	public static SubjectOne SubjectDtoToSubject(SubjectOneDto subjectOneDto) {
		SubjectOne subjectOne = new SubjectOne();
		if (subjectOneDto != null) {
			logger.info("Subject 1To8 Converter ----> DTO To Entity");
			subjectOne.setSubjectId(subjectOneDto.getSubjectId());
			subjectOne.setSubjectName(subjectOneDto.getSubjectName());
			subjectOne.setGradeId(subjectOneDto.getGradeId());
			return subjectOne;
		}
		return null;

	}
	
	@SuppressWarnings("unused")
	public static SubjectOneDto SubjectToSubjectDto(SubjectOne subjectOne) {
		SubjectOneDto subjectOneDto = new SubjectOneDto();
		if (subjectOneDto != null) {
			logger.info("Subject 1To8 Converter ----> Entity To DTO ");
			subjectOneDto.setSubjectId(subjectOne.getSubjectId());
			subjectOneDto.setSubjectName(subjectOne.getSubjectName());
			subjectOneDto.setGradeId(subjectOne.getGradeId());
			//subject1To8Dto.setsId(subject1To8.getsId());
			return subjectOneDto;
		}
		return null;

	}
	
	public static List<SubjectOneDto> SubjectToSubjectDto(List<SubjectOne> subjectOneList){
		if(subjectOneList !=null) {
			logger.info("Subject To DTO Converter for List");
			List<SubjectOneDto> listSubjectDto = new ArrayList<>();
			for(SubjectOne subjectOne : subjectOneList) {
				SubjectOneDto subjectOneDto = new SubjectOneDto();
				subjectOneDto.setSubjectId(subjectOne.getSubjectId());
				subjectOneDto.setSubjectName(subjectOne.getSubjectName());
				subjectOneDto.setGradeId(subjectOne.getGradeId());
				listSubjectDto.add(subjectOneDto);
			}
			return listSubjectDto;
		}
		return null;
	}

}

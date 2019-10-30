package com.invicta.exam.convertor;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.invicta.exam.dto.SubjectDto;
import com.invicta.exam.entity.Subject;

@Service
public class SubjectConverter {

private static Logger logger = LogManager.getLogger(SubjectDto.class);
	
	public static Subject SubjectDtoToSubjectEntity(SubjectDto subjectDto) {
		Subject subject = new Subject();
		if (subjectDto != null) {
			logger.info("Selection Subjects Converter ----> DTO To Entity");
			subject.setSubjectId(subjectDto.getSubjectId());
			subject.setSubjectName(subjectDto.getSubjectName());
			subject.setCategory(subjectDto.getCategory());
			subject.setGradeId(subjectDto.getGradeId());
			return subject;
		}
		return null;

	}
	
	public static SubjectDto SubjectEntityToSubjectDto(Subject subject) {
		SubjectDto subjectDto = new SubjectDto();
		if (subject != null) {
			logger.info("Selection Subjects Converter ----> Entity To DTO ");
			subjectDto.setSubjectId(subject.getGradeId());
			subjectDto.setSubjectName(subject.getSubjectName());
			subjectDto.setCategory(subject.getCategory());
			subjectDto.setGradeId(subject.getGradeId());
			return subjectDto;
		}
		return null;

	}
	
	public static List<SubjectDto> SubjectEntityToSubjectDtoforList(List<Subject> subjectList){
		if(subjectList !=null) {
			logger.info("Subjects To DTO Converter for List");
			List<SubjectDto> listSubjectDto = new ArrayList<>();
			for(Subject subject : subjectList) {
				SubjectDto subjectDto = new SubjectDto();
				subjectDto.setSubjectId(subject.getSubjectId());
				subjectDto.setSubjectName(subject.getSubjectName());
				subjectDto.setCategory(subject.getCategory());
				subjectDto.setGradeId(subject.getGradeId());
				listSubjectDto.add(subjectDto);
			}
			return listSubjectDto;
		}
		return null;
	}
}

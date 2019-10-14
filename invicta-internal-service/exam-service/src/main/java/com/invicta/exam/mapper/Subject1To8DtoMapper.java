package com.invicta.exam.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.exam.convertor.Subject1To8Convertor;
import com.invicta.exam.dto.Subject1To8Dto;
import com.invicta.exam.entity.Subject1To8;
import com.invicta.exam.service.Subject1To8Service;

@Service
public class Subject1To8DtoMapper {

	@Autowired
	private Subject1To8Service subject1To8Service;
	
	@Autowired
	private Subject1To8Convertor subject1To8Convertor;
	
	private static Logger logger = LogManager.getLogger(Subject1To8Convertor.class);
	
	@SuppressWarnings("static-access")
	public Subject1To8 saveSubjects(Subject1To8Dto subject1To8Dto) {
		logger.info("Subject Mapper -> Subject Saved");
		return subject1To8Service.createSubject(subject1To8Convertor.SubjectDtoToSubject(subject1To8Dto));
	}
	
	@SuppressWarnings("static-access")
	public List<Subject1To8Dto> getAllSubjects() {
		logger.info(" All Subjects Successfully Listed ");
		List<Subject1To8> subjectList =subject1To8Service.getAllSubjects();
		return subject1To8Convertor.SubjectToSubjectDto(subjectList);

	}

	@SuppressWarnings("static-access")
	public Subject1To8Dto getBySubjectId(Long subjectId) {
		logger.info("Successfully get Subject by Id");
		Subject1To8 subject1To8 = subject1To8Service.getBySubjectId(subjectId);
		return subject1To8Convertor.SubjectToSubjectDto(subject1To8);
	}

	public Subject1To8Dto deleteSubjectById(Long subjectId) {
		logger.info("Subject Mapper ----> Subject Record Deleted");
		subject1To8Service.deleteBySubjectId(subjectId);
		return null;
	}

	@SuppressWarnings("static-access")
	public Subject1To8 UpdateSubjects(Subject1To8Dto subject1To8Dto) {
		logger.info("Subject is Updated", subject1To8Dto.getSubjectId());
		@SuppressWarnings("unused")
		Subject1To8 subject1To8 = subject1To8Convertor.SubjectDtoToSubject(subject1To8Dto);
		return subject1To8Service.updateSubject(subject1To8);

	}
}

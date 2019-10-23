package com.invicta.exam.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.exam.convertor.SubjectOneConvertor;
import com.invicta.exam.dto.SubjectOneDto;
import com.invicta.exam.entity.SubjectOne;
import com.invicta.exam.service.SubjectOneService;

@Service
public class SubjectOneMapper {

	@Autowired
	private SubjectOneService subject1To8Service;
	
	@Autowired
	private SubjectOneConvertor subject1To8Convertor;
	
	private static Logger logger = LogManager.getLogger(SubjectOneConvertor.class);
	
	@SuppressWarnings("static-access")
	public SubjectOne saveSubjects(SubjectOneDto subject1To8Dto) {
		logger.info("Subject Mapper -> Subject Saved");
		return subject1To8Service.createSubject(subject1To8Convertor.SubjectDtoToSubject(subject1To8Dto));
	}
	
	@SuppressWarnings("static-access")
	public List<SubjectOneDto> getAllSubjects() {
		logger.info(" All Subjects Successfully Listed ");
		List<SubjectOne> subjectList =subject1To8Service.getAllSubjects();
		return subject1To8Convertor.SubjectToSubjectDto(subjectList);

	}

	@SuppressWarnings("static-access")
	public SubjectOneDto getBySubjectId(Long subjectId) {
		logger.info("Successfully get Subject by Id");
		SubjectOne subject1To8 = subject1To8Service.getBySubjectId(subjectId);
		return subject1To8Convertor.SubjectToSubjectDto(subject1To8);
	}

	public SubjectOneDto deleteSubjectById(Long subjectId) {
		logger.info("Subject Mapper ----> Subject Record Deleted");
		subject1To8Service.deleteBySubjectId(subjectId);
		return null;
	}

	@SuppressWarnings("static-access")
	public SubjectOne UpdateSubjects(SubjectOneDto subject1To8Dto) {
		logger.info("Subject is Updated", subject1To8Dto.getSubjectId());
		@SuppressWarnings("unused")
		SubjectOne subject1To8 = subject1To8Convertor.SubjectDtoToSubject(subject1To8Dto);
		return subject1To8Service.updateSubject(subject1To8);

	}
}

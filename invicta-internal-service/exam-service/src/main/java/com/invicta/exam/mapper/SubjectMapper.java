package com.invicta.exam.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.exam.convertor.SubjectConverter;
import com.invicta.exam.dto.SubjectDto;
import com.invicta.exam.entity.Subject;
import com.invicta.exam.service.SubjectService;

@Service
public class SubjectMapper {

	@Autowired
	private SubjectService subjectService;

	@Autowired
	private SubjectConverter subjectConverter;

	private static Logger logger = LogManager.getLogger(SubjectConverter.class);

	@SuppressWarnings("static-access")
	public Subject saveSubjects(SubjectDto subjectDto) {
		logger.info("Subject Mapper -> Selection Subject Saved");
		return subjectService.createSubject(
				subjectConverter.SubjectDtoToSubjectEntity(subjectDto));
	}

	@SuppressWarnings("static-access")
	public List<SubjectDto> getAllSubjects() {
		logger.info(" All Subjects Successfully Listed ");
		List<Subject> subjectList = subjectService.getAllSubjects();
		return subjectConverter.SubjectEntityToSubjectDtoforList(subjectList);

	}

	@SuppressWarnings("static-access")
	public SubjectDto getBySubjectId(Long subjectId) {
		logger.info("Successfully get Subject by Id");
		Subject subject = subjectService.getBySubjectId(subjectId);
		return subjectConverter.SubjectEntityToSubjectDto(subject);
	}

	public SubjectDto deleteSubjectById(Long subjectId) {
		logger.info("Subject Mapper ----> Subject Record Deleted");
		subjectService.deleteBySubjectId(subjectId);
		return null;
	}

	@SuppressWarnings("static-access")
	public Subject UpdateSubjects(SubjectDto subjectDto) {
		logger.info("Subject is Updated", subjectDto.getSubjectId());
		Subject subject = subjectConverter.SubjectDtoToSubjectEntity(subjectDto);
		return subjectService.updateSubject(subject);

	}
}

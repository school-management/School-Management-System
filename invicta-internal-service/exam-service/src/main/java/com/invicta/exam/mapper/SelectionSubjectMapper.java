package com.invicta.exam.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.exam.convertor.SelectionSubjectConverter;
import com.invicta.exam.dto.SelectionSubjectDto;
import com.invicta.exam.entity.SelectionSubject;
import com.invicta.exam.service.SelectionSubjectService;

@Service
public class SelectionSubjectMapper {

	@Autowired
	private SelectionSubjectService selectionSubjectService;

	@Autowired
	private SelectionSubjectConverter selectionSubjectConverter;

	private static Logger logger = LogManager.getLogger(SelectionSubjectConverter.class);

	@SuppressWarnings("static-access")
	public SelectionSubject saveSelectionSubjects(SelectionSubjectDto selectionSubjectDto) {
		logger.info("Selection Subject Mapper -> Selection Subject Saved");
		return selectionSubjectService.createSelectionSubject(
				selectionSubjectConverter.SelectionSubjectDtoToSelectionSubjectEntity(selectionSubjectDto));
	}

	@SuppressWarnings("static-access")
	public List<SelectionSubjectDto> getAllSelectionSubjects() {
		logger.info(" All Selection Subjects Successfully Listed ");
		List<SelectionSubject> selectionSubjectList = selectionSubjectService.getAllSelectionSubjects();
		return selectionSubjectConverter.SelectionSubjectEntityToSelectionSubjectDtoforList(selectionSubjectList);

	}

	@SuppressWarnings("static-access")
	public SelectionSubjectDto getBySelectionSubjectId(Long selectionSubjectId) {
		logger.info("Successfully get Selection Subject by Id");
		SelectionSubject selectionSubject = selectionSubjectService.getBySelectionSubjectId(selectionSubjectId);
		return selectionSubjectConverter.SelectionSubjectEntityToSelectionSubjectDto(selectionSubject);
	}

	public SelectionSubjectDto deleteSelectionSubjectById(Long selectionSubjectId) {
		logger.info("Selection Subject Mapper ----> Selection Subject Record Deleted");
		selectionSubjectService.deleteBySelectionSubjectId(selectionSubjectId);
		return null;
	}

	@SuppressWarnings("static-access")
	public SelectionSubject UpdateSelectionSubjects(SelectionSubjectDto selectionSubjectDto) {
		logger.info("Selection Subject is Updated", selectionSubjectDto.getSelectionSubjectId());
		SelectionSubject selectionSubject = selectionSubjectConverter.SelectionSubjectDtoToSelectionSubjectEntity(selectionSubjectDto);
		return selectionSubjectService.updateSubject(selectionSubject);

	}
}

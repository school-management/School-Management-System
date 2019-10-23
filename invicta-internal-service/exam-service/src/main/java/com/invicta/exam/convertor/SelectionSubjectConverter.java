package com.invicta.exam.convertor;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.invicta.exam.dto.SelectionSubjectDto;
import com.invicta.exam.entity.SelectionSubject;

@Service
public class SelectionSubjectConverter {

private static Logger logger = LogManager.getLogger(SelectionSubjectDto.class);
	
	public static SelectionSubject SelectionSubjectDtoToSelectionSubjectEntity(SelectionSubjectDto selectionSubjectDto) {
		SelectionSubject selectionSubject = new SelectionSubject();
		if (selectionSubjectDto != null) {
			logger.info("Selection Subjects Converter ----> DTO To Entity");
			selectionSubject.setSelectionSubjectId(selectionSubjectDto.getSelectionSubjectId());
			selectionSubject.setSelectionSubjectName(selectionSubjectDto.getSelectionSubjectName());
			selectionSubject.setSelectionSubjectCategory(selectionSubjectDto.getSelectionSubjectCategory());
			return selectionSubject;
		}
		return null;

	}
	
	public static SelectionSubjectDto SelectionSubjectEntityToSelectionSubjectDto(SelectionSubject selectionSubject) {
		SelectionSubjectDto selectionSubjectDto = new SelectionSubjectDto();
		if (selectionSubject != null) {
			logger.info("Selection Subjects Converter ----> Entity To DTO ");
			selectionSubjectDto.setSelectionSubjectId(selectionSubject.getSelectionSubjectId());
			selectionSubjectDto.setSelectionSubjectName(selectionSubject.getSelectionSubjectName());
			selectionSubjectDto.setSelectionSubjectCategory(selectionSubject.getSelectionSubjectCategory());
			return selectionSubjectDto;
		}
		return null;

	}
	
	public static List<SelectionSubjectDto> SelectionSubjectEntityToSelectionSubjectDtoforList(List<SelectionSubject> selectionSubjectList){
		if(selectionSubjectList !=null) {
			logger.info("Selection Subjects To DTO Converter for List");
			List<SelectionSubjectDto> listSelectionSubjectDto = new ArrayList<>();
			for(SelectionSubject selectionSubject : selectionSubjectList) {
				SelectionSubjectDto selectionSubjectDto = new SelectionSubjectDto();
				selectionSubjectDto.setSelectionSubjectId(selectionSubject.getSelectionSubjectId());
				selectionSubjectDto.setSelectionSubjectName(selectionSubject.getSelectionSubjectName());
				selectionSubjectDto.setSelectionSubjectCategory(selectionSubject.getSelectionSubjectCategory());
				listSelectionSubjectDto.add(selectionSubjectDto);
			}
			return listSelectionSubjectDto;
		}
		return null;
	}
}

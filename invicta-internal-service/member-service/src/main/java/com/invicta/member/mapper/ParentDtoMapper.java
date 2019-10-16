package com.invicta.member.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Converter.ParentDtoConverter;
import com.invicta.member.Service.ParentService;
import com.invicta.member.dto.ParentDto;
import com.invicta.member.entity.Parent;


@Service
public class ParentDtoMapper {

	@Autowired
	private ParentDtoConverter parentDtoConverter;

	@Autowired
	private ParentService parentService;

	private static Logger logger = LogManager.getLogger(ParentDtoConverter.class);

	@SuppressWarnings("static-access")
	public Parent saveParent(ParentDto parentDto) {
		logger.info("Parent Dto Mapper --> Parent Dto Mapper Saved");
		return parentService.saveParent(parentDtoConverter.ParentDtoToParent(parentDto));
	}

	@SuppressWarnings("static-access")
	public List<ParentDto> getAllParent() {
		logger.info("Parent Successsfully Listed");
		List<Parent> parentlist = parentService.getAllParent();
		return parentDtoConverter.ParentToParentDto(parentlist);
	}

	@SuppressWarnings("static-access")
	public ParentDto getByparentId(Long parId) {
		logger.info("Successfully get Parent by Id");
		Parent parent = parentService.getByParID(parId);
		return parentDtoConverter.ParentEntityToParentDto(parent);
	}

	public ParentDto deleteParentById(Long parId) {
		logger.info("Parent Dto Mapper -> Parent Deleted");
		parentService.deleteByParId(parId);
		return null;
	}

	@SuppressWarnings("static-access")
	public Parent UpdateParent(ParentDto parentDto) {
		logger.info("Parent is Updated", parentDto.getParId());
		@SuppressWarnings("unused")
		Parent parent = parentDtoConverter.ParentDtoToParent(parentDto);
		return parentService.updateParent(parentDtoConverter.ParentDtoToParent(parentDto));

	}

	@SuppressWarnings("static-access")
	public List<ParentDto> getParentByfathername(String fathername) {
		logger.info("Successfully Get Parent By fatherName");
		List<Parent> parent = parentService.getByFathername(fathername);
		return parentDtoConverter.ParentToParentDto(parent);
	}

	@SuppressWarnings("static-access")
	public List<ParentDto> getParentBymothername(String mothername) {
		logger.info("Successfully Get Parent By mothername");
		List<Parent> parent = parentService.getByMothername(mothername);
		return parentDtoConverter.ParentToParentDto(parent);
	}

	@SuppressWarnings("static-access")
	public List<ParentDto> getParentByGuardianName(String guardianname) {
		logger.info("Successfully Get Parent By GuardianName");
		List<Parent> parent = parentService.getByGuardianname(guardianname);
		return parentDtoConverter.ParentToParentDto(parent);
		
	}
}

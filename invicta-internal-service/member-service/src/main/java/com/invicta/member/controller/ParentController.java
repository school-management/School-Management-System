package com.invicta.member.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.invicta.member.dto.ParentDto;
import com.invicta.member.entity.Parent;
import com.invicta.member.mapper.ParentDtoMapper;
import com.invicta.member.repository.ParentRepository;

@RestController
public class ParentController {

	@Autowired
	private ParentDtoMapper parentDtoMapper;
	
	@Autowired
	private ParentRepository parentRepository;

	private static Logger logger = LogManager.getLogger(ParentDtoMapper.class);

	@PostMapping("/saveparent")
	public Parent savedparent(@RequestBody ParentDto parentDto) {
		try {
			return parentDtoMapper.saveParent(parentDto);
		} catch (Exception e) {
			logger.info("Studet Controller -> New Student Created succesfully", e.getMessage());
		}

		return null;
	}
}

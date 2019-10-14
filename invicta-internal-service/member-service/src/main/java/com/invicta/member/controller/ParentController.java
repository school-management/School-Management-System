package com.invicta.member.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.invicta.member.dto.ParentDto;
import com.invicta.member.entity.Parent;
import com.invicta.member.mapper.ParentDtoMapper;


@RestController
@RequestMapping("/Api/")
public class ParentController {

	@Autowired
	private ParentDtoMapper parentDtoMapper;
	
	@SuppressWarnings("unused")
	@Autowired
	private ParentRepository parentRepository;

	private static Logger logger = LogManager.getLogger(ParentDtoMapper.class);

	@PostMapping("/saveparent")
	public Parent savedparent(@RequestBody ParentDto parentDto) {
		try {
			return parentDtoMapper.saveParent(parentDto);
		} catch (Exception e) {
			logger.info("Parent Controller -> New Parent Created succesfully", e.getMessage());
		}

		return null;
	}
	
	@GetMapping("/GetAllParent")
	public ResponseEntity<List<ParentDto>> getAllParent() {
		try {
			return new ResponseEntity<>(parentDtoMapper.getAllParent(), HttpStatus.OK);
		} catch (Exception e) {
			logger.info("Parent Controller -> GetDesignation", e.getMessage());
		}
		return null;
		
	}
}

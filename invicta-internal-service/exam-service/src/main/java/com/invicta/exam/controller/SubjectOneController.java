package com.invicta.exam.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invicta.exam.dto.SubjectOneDto;
import com.invicta.exam.entity.SubjectOne;
import com.invicta.exam.mapper.SubjectOneDtoMapper;

@RestController
@RequestMapping("/Api/")
public class SubjectOneController {

	@Autowired
	private SubjectOneDtoMapper subject1To8DtoMapper;

	private static Logger logger = LogManager.getLogger(SubjectOneDtoMapper.class);

	@PostMapping("/subjects")
	public SubjectOne saveSubject(@RequestBody SubjectOneDto subject1To8Dto) {
		try {
			return subject1To8DtoMapper.saveSubjects(subject1To8Dto);
		} catch (Exception e) {
			logger.info("Subject8 Controller -> New Subject Created succesfully", e.getMessage());
		}

		return null;
	}

	@GetMapping("/subjects")
	public ResponseEntity<List<SubjectOneDto>> getAllSubjects() {
		try {
			return new ResponseEntity<>(subject1To8DtoMapper.getAllSubjects(), HttpStatus.OK);
		} catch (Exception e) {
			logger.info("Subject8 Controller -> GetAllSubjects", e.getMessage());
		}
		return null;

	}

	@GetMapping("subjects/{subjectId}")
	public ResponseEntity<SubjectOneDto> getSubjectbyId(@PathVariable Long subjectId) {
		try {
			return new ResponseEntity<>(subject1To8DtoMapper.getBySubjectId(subjectId), HttpStatus.OK);
		} catch (Exception e) {
			logger.info("Subject8 Controller -> GetSubjectById", e.getMessage());
		}
		return null;

	}

	@DeleteMapping("subjects/{subjectId}")
	public ResponseEntity<String> deleteSubjectsById(@PathVariable Long subjectId) {
		try {
			if (subject1To8DtoMapper.getBySubjectId(subjectId) != null) {
				if (subject1To8DtoMapper.deleteSubjectById(subjectId) == null) {
					logger.info("Subject8 Controller -> Subject Deleted Successfully");
					return new ResponseEntity<>("Subject Sucessfully deleted", HttpStatus.OK);
				}
			} 
			else {
				logger.info("Subject8 Controller -> Student Id Not Found");
				return new ResponseEntity<>("Subject Id Not FOUND!!!", HttpStatus.BAD_REQUEST);
			}
		}
		catch (Exception e) {
			logger.error("Subject8 Controller -> Subject8 Deleted Failed!!!");
			return new ResponseEntity<>("Delete FAILED!!!", HttpStatus.BAD_REQUEST);
		}
		return null;
		
	}

	@PutMapping("subjects/{subjectId}")
	public ResponseEntity<String> updateStudent(@RequestBody SubjectOneDto subject1To8Dto) {
		try {
			logger.info("Subject8 Controller :-> Update");
			if (subject1To8DtoMapper.UpdateSubjects(subject1To8Dto) != null) {
				return new ResponseEntity<>("Successfully Updated", HttpStatus.OK);
			}
			return new ResponseEntity<>("Failed To Update", HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Subject8 Controller :-> Error" + ex.getMessage());
		}

		return null;
	}
}

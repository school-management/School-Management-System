package com.invicta.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.invicta.member.dto.StudentDto;
import com.invicta.member.entity.Student;
import com.invicta.member.mapper.StudentDtoMapper;

@RestController
public class StudentController {

	@Autowired
	private StudentDtoMapper studentDtoMapper;

	private static Logger logger = LogManager.getLogger(StudentDtoMapper.class);

	@PostMapping("/savestudent")
	public Student savedstudent(@RequestBody StudentDto studentDto) {
		try {
			return studentDtoMapper.saveStudent(studentDto);
		} catch (Exception e) {
			logger.info("Studet Controller -> New Student Created succesfully", e.getMessage());
		}

		return null;
	}

	@GetMapping("/GetAllStudent")
	public ResponseEntity<List<StudentDto>> getAllStudent() {
		try {
			return new ResponseEntity<>(studentDtoMapper.getAllStudent(), HttpStatus.OK);
		} catch (Exception e) {
			logger.info("Student Controller -> GetDesignation", e.getMessage());
		}
		return null;

	}

}

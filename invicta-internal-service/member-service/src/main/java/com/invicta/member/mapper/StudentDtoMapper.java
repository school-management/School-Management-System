package com.invicta.member.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.invicta.member.Converter.StudentdtoConverter;
import com.invicta.member.Service.StudentService;
import com.invicta.member.dto.StudentDto;
import com.invicta.member.entity.Student;

@Service
public class StudentDtoMapper {

	@Autowired
	private StudentService studentService;

	@Autowired
	private StudentdtoConverter studentdtoConverter;

	private static Logger logger = LogManager.getLogger(StudentdtoConverter.class);

	@SuppressWarnings("static-access")
	public Student saveStudent(StudentDto studentDto) {
		logger.info("Status Mapper -> Status Saved");
		return studentService.saveStudent(studentdtoConverter.StudentToStudentDTO(studentDto));
	}

	@SuppressWarnings("static-access")
	public List<StudentDto> getAllStudent() {
		logger.info(" Student Successfully Listed ");
		List<Student> studentlist = studentService.getAllStudent();
		return studentdtoConverter.StudentToStudentDTO(studentlist);

	}
}

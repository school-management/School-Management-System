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
		return studentService.saveStudent(studentdtoConverter.StudentDTOToStuden(studentDto));
	}

	@SuppressWarnings("static-access")
	public List<StudentDto> getAllStudent() {
		logger.info(" Student Successfully Listed ");
		List<Student> studentlist = studentService.getAllStudent();
		return studentdtoConverter.StudentToStudentDTO(studentlist);

	}

	@SuppressWarnings("static-access")
	public StudentDto getBystudentid(Long sId) {
		logger.info("Successfully get Student by Id");
		Student student = studentService.getBysId(sId);
		return studentdtoConverter.StudentEntityToStudentDTO(student);
	}

	public StudentDto deleteStudentById(Long sId) {
		logger.info("Student Mapper -> Student Deleted");
		studentService.deleteBysId(sId);
		return null;
	}

	@SuppressWarnings("static-access")
	public Student UpdateStudent(StudentDto studentDto) {
		logger.info("Student is Updated", studentDto.getsId());
		@SuppressWarnings("unused")
		Student student = studentdtoConverter.StudentDTOToStuden(studentDto);
		return studentService.updatestudent(studentdtoConverter.StudentDTOToStuden(studentDto));

	}

	@SuppressWarnings("static-access")
	public List<StudentDto> getStudentBylastname(String lastname) {

		List<Student> student = studentService.findBylastname(lastname);
		return studentdtoConverter.StudentToStudentDTO(student);
	}

	@SuppressWarnings("static-access")
	public List<StudentDto> getStudentByfirstname(String firstname) {
		logger.info("Successfully Get Student By FirstName");
		List<Student> student = studentService.getByfirstname(firstname);
		return studentdtoConverter.StudentToStudentDTO(student);
	}

	@SuppressWarnings("static-access")
	public List<StudentDto> getStudentByreligion(String religion) {
		logger.info("Successfully Get Student By FirstName");
		List<Student> student = studentService.findbyreligion(religion);
		return studentdtoConverter.StudentToStudentDTO(student);
	}

	@SuppressWarnings("static-access")
	public List<StudentDto> getbygender(String gender) {
		List<Student> student = studentService.findbygender(gender);
		return studentdtoConverter.StudentToStudentDTO(student);
	}

	@SuppressWarnings("static-access")
	public List<StudentDto> findtbyhostelstudent(Boolean hostelneed) {
		List<Student> student = studentService.findtbyhostelstudent(hostelneed);
		return studentdtoConverter.StudentToStudentDTO(student);
	}

	@SuppressWarnings("static-access")
	public List<StudentDto> findByClass(Long gradeId) {
		List<Student> student = studentService.findStudentByClass(gradeId);
		return studentdtoConverter.StudentToStudentDTO(student);
	}

}

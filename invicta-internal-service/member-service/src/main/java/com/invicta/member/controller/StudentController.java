package com.invicta.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.invicta.member.dto.StudentDto;
import com.invicta.member.entity.Student;
import com.invicta.member.mapper.StudentDtoMapper;
import com.invicta.member.repository.StudentRepository;

import org.springframework.web.bind.annotation.PutMapping;

//@RequestMapping("/api/")
@RestController
public class StudentController {

	@Autowired
	private StudentDtoMapper studentDtoMapper;

	@Autowired
	private StudentRepository studentRepository;

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

	@GetMapping("/{sId}")
	public ResponseEntity<StudentDto> getStudentbyId(@PathVariable Long sId) {
		try {
			return new ResponseEntity<>(studentDtoMapper.getBystudentid(sId), HttpStatus.OK);
		} catch (Exception e) {
			logger.info("Student Controller -> GetStudentById", e.getMessage());
		}
		return null;

	}

	@DeleteMapping("/{sId}")
	public ResponseEntity<String> deleteStudentsId(@PathVariable Long sId) {
		if (studentDtoMapper.getBystudentid(sId) != null) {
			if (studentDtoMapper.deleteStudentById(sId) == null) {
				logger.info("Student Controller -> Company Deleted Successful");
				return new ResponseEntity<>("Student Sucessfully deleted", HttpStatus.OK);
			}
		} else {
			logger.info("Student Controller -> Student Id Not Found");
			return new ResponseEntity<>("Student Id Not FOUND!!!", HttpStatus.BAD_REQUEST);
		}
		logger.info("Student Controller -> Student Deleted Failed!!!");
		return new ResponseEntity<>("Delete FAILED!!!", HttpStatus.BAD_REQUEST);
	}

	@PutMapping("update/{sId}")
	public ResponseEntity<String> updateStudent(@RequestBody StudentDto studentDto) {
		try {
			logger.info("Student Controller :-> Update");
			if (studentDtoMapper.UpdateStudent(studentDto) != null) {
				return new ResponseEntity<>("Successfully Updated", HttpStatus.OK);
			}
			return new ResponseEntity<>("Failed To Update", HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Student Controller :-> Error" + ex.getMessage());
		}

		return null;
	}

	@GetMapping("/getlastname/{lastname}")
	public List<StudentDto> getBylastName(@PathVariable(name = "lastname") String lastname) {
		try {
			return studentDtoMapper.getStudentBylastname(lastname);
		} catch (Exception e) {
			logger.error("Student Controller :-> Error" + e.getMessage());
		}
		return null;

	}

	@GetMapping("/getfirstname/{firstname}")
	public List<StudentDto> getbyfirstname(@PathVariable(name = "firstname") String firstname) {
		try {
			return studentDtoMapper.getStudentByfirstname(firstname);
		} catch (Exception e) {
			logger.error("Student Controller :-> Error" + e.getMessage());
		}
		return null;

	}

	@GetMapping("/getbyreligion/{religion}")
	public List<StudentDto> getStudentByreligion(@PathVariable(name = "religion") String religion) {
		try {
			return studentDtoMapper.getStudentByreligion(religion);
		} catch (Exception e) {
			logger.error("Student Controller :-> Error" + e.getMessage());
		}
		return null;

	}

	@GetMapping("getbygender/{gender}")
	public List<StudentDto> getStudentBygender(@PathVariable(name = "gender") String gender) {
		try {
			return studentDtoMapper.getbygender(gender);
		} catch (Exception e) {
			logger.error("Student Controller :-> Error" + e.getMessage());
		}
		return null;

	}

	@GetMapping("gethostelstudent/{hostelneed}")
	public List<StudentDto> gethostelstudent(@PathVariable(name = "hostelneed") Boolean hostelneed) {
		try {
			return studentDtoMapper.findtbyhostelstudent(hostelneed);

		} catch (Exception e) {
			logger.error("Student Controller :-> Error" + e.getMessage());
		}
		return null;

	}

	@GetMapping("/getstudentbyclass/{gradeId}")
	public List<StudentDto> getstudentbyclass(@PathVariable(name = "gradeId") Long gradeId) {
		try {
			return studentDtoMapper.findByClass(gradeId);
		} catch (Exception e) {
			logger.error("Student Controller :-> Error" + e.getMessage());
		}
		return null;
	}

}

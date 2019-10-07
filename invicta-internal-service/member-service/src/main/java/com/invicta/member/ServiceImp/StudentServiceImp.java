package com.invicta.member.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Service.StudentService;
import com.invicta.member.entity.Student;
import com.invicta.member.repository.StudentRepository;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentRepository studentrepository;

	private static Logger logger = LogManager.getLogger(StudentRepository.class);

	@Override
	public Student saveStudent(Student student) {
		try {
			return studentrepository.save(student);
		} catch (Exception e) {
			logger.info("Student Service Implementation -->", e.getMessage());
		}
		return null;
		

	}

	@Override
	public List<Student> getAllStudent() {
		try {
			return studentrepository.findAll();
		} catch (Exception e) {
			logger.info("Student Service Implementation -->", e.getMessage());
		}
		return null;
	
	}

}

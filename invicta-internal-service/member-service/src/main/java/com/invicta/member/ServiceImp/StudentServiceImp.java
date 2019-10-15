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

	@Override
	public Student getBysId(Long sId) {
		try {
			return studentrepository.findBysId(sId);
		} catch (Exception e) {
			logger.info("Student Service Implementation -->", e.getMessage());
		}
		return null;

	}

	@Override
	public Student deleteBysId(Long sId) {
		try {
			studentrepository.deleteById(sId);
		} catch (Exception e) {
			logger.info("Student Service Implementation --->", e.getMessage());
		}
		return null;

	}

	@Override
	public Student updatestudent(Student student) {
		return studentrepository.save(student);
	}

	@Override
	public List<Student> getByfirstname(String firstname) {
		return studentrepository.findByfirstname(firstname);
	}

	@Override
	public List<Student> findBylastname(String lastname) {
		return studentrepository.findBylastname(lastname);
	}

	@Override
	public List<Student> findbyreligion(String religion) {

		return studentrepository.findbyreligion(religion);
	}

	@Override
	public List<Student> findbygender(String gender) {

		return studentrepository.findbygender(gender);
	}

	@Override
	public List<Student> findtbyhostelstudent(Boolean hostelneed) {

		return studentrepository.findtbyhostelstudent(hostelneed);
	}

	@Override
	public List<Student> findStudentByClass(Long gradeId) {
		return studentrepository.findStudentByClass(gradeId);
	}

	@Override
	public List<Student> findBystuId(String stuId) {
		return studentrepository.findBystuId(stuId);
	}

}

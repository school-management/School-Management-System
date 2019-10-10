package com.invicta.member.Converter;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import com.invicta.member.dto.StudentDto;
import com.invicta.member.entity.Grade;
import com.invicta.member.entity.Student;

@Service
public class StudentdtoConverter {

	private static Logger logger = LogManager.getLogger(StudentDto.class);

	public static Student StudentDTOToStuden(StudentDto studentDto) {
		Student student = new Student();
		if (studentDto != null) {
			logger.info("Student Converter---> DTO To Entity");
			student.setsId(studentDto.getsId());
			student.setStuId(studentDto.getStuId());
			student.setFirstname(studentDto.getFirstname());
			student.setMiddlename(studentDto.getMiddlename());
			student.setLastname(studentDto.getLastname());
			student.setAddress(studentDto.getAddress());
			student.setContactno(studentDto.getContactno());
			student.setDob(studentDto.getDob());
			student.setDistance(studentDto.getDistance());
			student.setGender(studentDto.getGender());
			student.setGsdivision(studentDto.getGsdivision());
			student.setFormarschool(studentDto.getFormarschool());
			student.setFormerclass(studentDto.getFormerclass());
			student.setAchievementsport(studentDto.getAchievementsport());
			student.setAchievementstudy(studentDto.getAchievementstudy());
			student.setHostelneed(studentDto.isHostelneed());
			student.setRace(studentDto.getRace());
			student.setReligion(studentDto.getReligion());
			student.setStartDate(studentDto.getStartDate());
			Grade grade = new Grade();
			grade.setGradeId(studentDto.getGradeId());
			grade.setGradeName(studentDto.getGradeName());
			student.setGrade(grade);
			
			return student;
		}
		return null;

	}

	public static List<StudentDto> StudentToStudentDTO(List<Student> studentlist) {

		if (studentlist != null) {
			logger.info("Student Converter---> Entity To DTO ");
			List<StudentDto> liststudentDto = new ArrayList<>();
			for (Student student : studentlist) {
				logger.info("Student Converter---> Student List Converte");
				StudentDto studentDto = new StudentDto();
				studentDto.setsId(student.getsId());
				studentDto.setStuId(student.getStuId().toUpperCase());
				studentDto.setFirstname(student.getFirstname());
				studentDto.setMiddlename(student.getMiddlename());
				studentDto.setLastname(student.getLastname());
				studentDto.setAddress(student.getAddress());
				studentDto.setDob(student.getDob());
				studentDto.setDistance(student.getDistance());
				studentDto.setGender(student.getGender());
				studentDto.setGsdivision(student.getGsdivision());
				studentDto.setHostelneed(student.isHostelneed());
				studentDto.setFormarschool(student.getFormarschool());
				studentDto.setFormerclass(student.getFormerclass());
				studentDto.setRace(student.getRace());
				studentDto.setReligion(student.getReligion());
				studentDto.setStartDate(student.getStartDate());
				studentDto.setContactno(student.getContactno());
				studentDto.setAchievementsport(student.getAchievementsport());
				studentDto.setAchievementstudy(student.getAchievementstudy());
				studentDto.setGradeId(student.getGrade().getGradeId());
				studentDto.setGradeName(student.getGrade().getGradeName());
				liststudentDto.add(studentDto);

			}

			return liststudentDto;
		}
		return null;
	}
	
	public static StudentDto StudentEntityToStudentDTO(Student student) {
		StudentDto studentDto = new StudentDto();
		if (student != null) {
			logger.info("Company Converter -> Convert Object Entity to DTO");
			studentDto.setsId(student.getsId());
			studentDto.setStuId(student.getStuId().toUpperCase());
			studentDto.setFirstname(student.getFirstname());
			studentDto.setMiddlename(student.getMiddlename());
			studentDto.setLastname(student.getLastname());
			studentDto.setAddress(student.getAddress());
			studentDto.setDob(student.getDob());
			studentDto.setDistance(student.getDistance());
			studentDto.setGender(student.getGender());
			studentDto.setGsdivision(student.getGsdivision());
			studentDto.setHostelneed(student.isHostelneed());
			studentDto.setFormarschool(student.getFormarschool());
			studentDto.setFormerclass(student.getFormerclass());
			studentDto.setRace(student.getRace());
			studentDto.setReligion(student.getReligion());
			studentDto.setStartDate(student.getStartDate());
			studentDto.setContactno(student.getContactno());
			studentDto.setAchievementsport(student.getAchievementsport());
			studentDto.setAchievementstudy(student.getAchievementstudy());
			studentDto.setGradeId(student.getGrade().getGradeId());
			studentDto.setGradeName(student.getGrade().getGradeName());
			return studentDto;
		}
		return null;
	}


}

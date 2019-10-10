package com.invicta.member.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.invicta.member.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	public Student findBysId(Long sId);

	@Query(value = "from Student where lastname = :lastname")
	List<Student> findBylastname(String lastname);

	@Query(value = "from Student where firstname = :firstname")
	List<Student>findByfirstname(String firstname);
	
	@Query(value ="from Student where religion= :religion")
	List<Student> findbyreligion(String religion);
	
	@Query(value = "from Student where gender = :gender")
	List<Student> findbygender(String gender);
	
	@Query(value ="from Student where hostelneed = :hostelneed")
	List<Student> findtbyhostelstudent(Boolean hostelneed);
	
	@Query(value = "from Student where grade_id = :gradeId")
	List<Student> findStudentByClass(Long gradeId);
	

}

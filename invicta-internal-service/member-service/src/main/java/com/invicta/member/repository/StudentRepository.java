package com.invicta.member.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.invicta.member.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	public Student findBysId (Long sId);
	
	@Query(value = "from Student where lastname = :lastname")
	List<Student> findByfirstname(String lastname);

	
	



}

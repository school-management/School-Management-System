package com.invicta.member.Service;

import java.util.List;

import com.invicta.member.entity.Student;

public interface StudentService {

	public Student saveStudent(Student student);

	public List<Student> getAllStudent();
	
	public Student getBysId(Long sId);
	
	public Student deleteBysId(Long sId);
	
	public Student updatestudent(Student student);
	
	public List<Student> getByName(String lastname);

}

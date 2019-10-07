package com.invicta.member.Service;

import java.util.List;

import com.invicta.member.entity.Student;

public interface StudentService {

	public Student saveStudent(Student student);

	public List<Student> getAllStudent();

}

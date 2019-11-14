package com.invicta.member.Service;

import java.util.List;

import com.invicta.member.entity.Student;

public interface StudentService {

	public Student saveStudent(Student student);

	public List<Student> getAllStudent();
	
	public Student getBysId(Long sId);
	
	public Student deleteBysId(Long sId);
	
	public Student updatestudent(Student student);
	
	public List<Student>getByfirstname(String firstname);
	
	public List<Student> findBylastname(String lastname);
	
	public List<Student> findbyreligion(String religion);
	
	public 	List<Student> findbygender(String gender);
	
	public List<Student> findtbyhostelstudent(Boolean hostelneed);
	
	
	public List<Student> findbyfullname(String searchString);
	
	public 	List<Student> findStudentByClass(Long gradeId);
	
	public List<Student>findBystuId(String stuId);
	
//	public List<Student>findfullname(String )


}

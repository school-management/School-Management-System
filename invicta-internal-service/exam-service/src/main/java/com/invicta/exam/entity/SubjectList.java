package com.invicta.exam.entity;


public class SubjectList {
	
	private Long subjectId;
	private String subjectName;
	private Long sId;
	
	private Student studentobj;
	
	public Student getStudentobj() {
		return studentobj;
	}
	public void setStudentobj(Student studentobj) {
		this.studentobj = studentobj;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Long getsId() {
		return sId;
	}
	public void setsId(Long sId) {
		this.sId = sId;
	}
	
	

}

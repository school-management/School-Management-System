package com.invicta.member.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class LeavingCertificate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long leavingCertificateId;
	
	@OneToOne
	@JoinColumn(name = "studentId", nullable = false)
	private Student student;

	public Long getLeavingCertificateId() {
		return leavingCertificateId;
	}

	public void setLeavingCertificateId(Long leavingCertificateId) {
		this.leavingCertificateId = leavingCertificateId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}

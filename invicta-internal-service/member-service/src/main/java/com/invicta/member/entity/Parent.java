package com.invicta.member.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
@Entity
@Table(schema = "memberservice", name = "parent")
public class Parent implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long parId;
	private String pId;
	private String fathersName;
	private String fathersOccupation;
	private String fathersOfficialAddress;
	private Integer fathersMobile;
	private String fathersEmail;
	private boolean ifFatherOb;
	private Integer fatherFrom;
	private Integer fatherTo;
	private String mothersName;
	private String mothersOccupation;
	private Integer mothersMobile;
	private boolean ifMotherOb;
	private String maidenName;
	private Integer motherFrom;
	private Integer motherTo;
	private String guardian;
	private String guardianName;
	private String guardianOccupation;
	private Integer guardianMobileNo;
	private String guardianEmail;
	private String sibilingsFullName;
	private Integer sibilingsGrade;
	private String sililingsAdmission;
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy = "prent", fetch = FetchType.EAGER)
	private List<Student> student;
	
	public Long getParId() {
		return parId;
	}
	public void setParId(Long parId) {
		this.parId = parId;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	public String getFathersOccupation() {
		return fathersOccupation;
	}
	public void setFathersOccupation(String fathersOccupation) {
		this.fathersOccupation = fathersOccupation;
	}
	public String getFathersOfficialAddress() {
		return fathersOfficialAddress;
	}
	public void setFathersOfficialAddress(String fathersOfficialAddress) {
		this.fathersOfficialAddress = fathersOfficialAddress;
	}
	public Integer getFathersMobile() {
		return fathersMobile;
	}
	public void setFathersMobile(Integer fathersMobile) {
		this.fathersMobile = fathersMobile;
	}
	public String getFathersEmail() {
		return fathersEmail;
	}
	public void setFathersEmail(String fathersEmail) {
		this.fathersEmail = fathersEmail;
	}
	public boolean isIfFatherOb() {
		return ifFatherOb;
	}
	public void setIfFatherOb(boolean ifFatherOb) {
		this.ifFatherOb = ifFatherOb;
	}
	public Integer getFatherFrom() {
		return fatherFrom;
	}
	public void setFatherFrom(Integer fatherFrom) {
		this.fatherFrom = fatherFrom;
	}
	public Integer getFatherTo() {
		return fatherTo;
	}
	public void setFatherTo(Integer fatherTo) {
		this.fatherTo = fatherTo;
	}
	public String getMothersName() {
		return mothersName;
	}
	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}
	public String getMothersOccupation() {
		return mothersOccupation;
	}
	public void setMothersOccupation(String mothersOccupation) {
		this.mothersOccupation = mothersOccupation;
	}
	public Integer getMothersMobile() {
		return mothersMobile;
	}
	public void setMothersMobile(Integer mothersMobile) {
		this.mothersMobile = mothersMobile;
	}
	public boolean isIfMotherOb() {
		return ifMotherOb;
	}
	public void setIfMotherOb(boolean ifMotherOb) {
		this.ifMotherOb = ifMotherOb;
	}
	public String getMaidenName() {
		return maidenName;
	}
	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}
	public Integer getMotherFrom() {
		return motherFrom;
	}
	public void setMotherFrom(Integer motherFrom) {
		this.motherFrom = motherFrom;
	}
	public Integer getMotherTo() {
		return motherTo;
	}
	public void setMotherTo(Integer motherTo) {
		this.motherTo = motherTo;
	}
	public String getGuardian() {
		return guardian;
	}
	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getGuardianOccupation() {
		return guardianOccupation;
	}
	public void setGuardianOccupation(String guardianOccupation) {
		this.guardianOccupation = guardianOccupation;
	}
	public Integer getGuardianMobileNo() {
		return guardianMobileNo;
	}
	public void setGuardianMobileNo(Integer guardianMobileNo) {
		this.guardianMobileNo = guardianMobileNo;
	}
	public String getGuardianEmail() {
		return guardianEmail;
	}
	public void setGuardianEmail(String guardianEmail) {
		this.guardianEmail = guardianEmail;
	}
	
	public String getSibilingsFullName() {
		return sibilingsFullName;
	}
	public void setSibilingsFullName(String sibilingsFullName) {
		this.sibilingsFullName = sibilingsFullName;
	}
	public Integer getSibilingsGrade() {
		return sibilingsGrade;
	}
	public void setSibilingsGrade(Integer sibilingsGrade) {
		this.sibilingsGrade = sibilingsGrade;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public String getSililingsAdmission() {
		return sililingsAdmission;
	}
	public void setSililingsAdmission(String sililingsAdmission) {
		this.sililingsAdmission = sililingsAdmission;
	}
	

	

}

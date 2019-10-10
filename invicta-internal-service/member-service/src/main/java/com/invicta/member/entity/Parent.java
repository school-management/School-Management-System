package com.invicta.member.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(schema = "memberservice", name = "parent")
public class Parent implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long parId;
	private String pId;
	private String sId;
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
	private Integer sibilingsFullName;
	private String sibilingsGrade;
	private String sililingsAdmission;
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
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
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
	public Integer getSibilingsFullName() {
		return sibilingsFullName;
	}
	public void setSibilingsFullName(Integer sibilingsFullName) {
		this.sibilingsFullName = sibilingsFullName;
	}
	public String getSibilingsGrade() {
		return sibilingsGrade;
	}
	public void setSibilingsGrade(String sibilingsGrade) {
		this.sibilingsGrade = sibilingsGrade;
	}
	public String getSililingsAdmission() {
		return sililingsAdmission;
	}
	public void setSililingsAdmission(String sililingsAdmission) {
		this.sililingsAdmission = sililingsAdmission;
	}
	
	
}

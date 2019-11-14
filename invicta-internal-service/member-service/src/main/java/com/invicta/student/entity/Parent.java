package com.invicta.student.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(schema = "studentservice", name = "parent")
public class Parent implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	StudentAdmissionNo(fk)
	private String FathersOccupation;
	private String fathersOfficialAddress;
	private String fathersOfficialNo;
	private boolean IsFatherOldStudent;
	private String FathersAdmissionDate;
	private Date  FathersLeavingDate;
	private String MothersName;
	private Integer MothersMobileNo;
	private String MothersOccupation;
	private String MothersOfficialAddress;
	private Integer MothersOfficialNo;
	private String MothersEmail;
	private boolean IsMotherOldStudent;
	private String MothersMaidenName;
	private String HouseName;
	private Date MothersAdmissionDate;
	private Date MotherssLeavingDate;
	private String Gurdian;
	private String Relationship;
	private String GurdiansName;
	private String GurdiansOccupation;
	private String GurdiansOfficialAddress;
	private Integer GurdiansMobileNo;
	private Integer GurdiansOfficialNo;
	private String GurdiansEmail;
	public String getFathersOccupation() {
		return FathersOccupation;
	}
	public void setFathersOccupation(String fathersOccupation) {
		FathersOccupation = fathersOccupation;
	}
	public String getFathersOfficialAddress() {
		return fathersOfficialAddress;
	}
	public void setFathersOfficialAddress(String fathersOfficialAddress) {
		this.fathersOfficialAddress = fathersOfficialAddress;
	}
	public String getFathersOfficialNo() {
		return fathersOfficialNo;
	}
	public void setFathersOfficialNo(String fathersOfficialNo) {
		this.fathersOfficialNo = fathersOfficialNo;
	}
	public boolean isIsFatherOldStudent() {
		return IsFatherOldStudent;
	}
	public void setIsFatherOldStudent(boolean isFatherOldStudent) {
		IsFatherOldStudent = isFatherOldStudent;
	}
	public String getFathersAdmissionDate() {
		return FathersAdmissionDate;
	}
	public void setFathersAdmissionDate(String fathersAdmissionDate) {
		FathersAdmissionDate = fathersAdmissionDate;
	}
	public Date getFathersLeavingDate() {
		return FathersLeavingDate;
	}
	public void setFathersLeavingDate(Date fathersLeavingDate) {
		FathersLeavingDate = fathersLeavingDate;
	}
	public String getMothersName() {
		return MothersName;
	}
	public void setMothersName(String mothersName) {
		MothersName = mothersName;
	}
	public Integer getMothersMobileNo() {
		return MothersMobileNo;
	}
	public void setMothersMobileNo(Integer mothersMobileNo) {
		MothersMobileNo = mothersMobileNo;
	}
	public String getMothersOccupation() {
		return MothersOccupation;
	}
	public void setMothersOccupation(String mothersOccupation) {
		MothersOccupation = mothersOccupation;
	}
	public String getMothersOfficialAddress() {
		return MothersOfficialAddress;
	}
	public void setMothersOfficialAddress(String mothersOfficialAddress) {
		MothersOfficialAddress = mothersOfficialAddress;
	}
	public Integer getMothersOfficialNo() {
		return MothersOfficialNo;
	}
	public void setMothersOfficialNo(Integer mothersOfficialNo) {
		MothersOfficialNo = mothersOfficialNo;
	}
	public String getMothersEmail() {
		return MothersEmail;
	}
	public void setMothersEmail(String mothersEmail) {
		MothersEmail = mothersEmail;
	}
	public boolean isIsMotherOldStudent() {
		return IsMotherOldStudent;
	}
	public void setIsMotherOldStudent(boolean isMotherOldStudent) {
		IsMotherOldStudent = isMotherOldStudent;
	}
	public String getMothersMaidenName() {
		return MothersMaidenName;
	}
	public void setMothersMaidenName(String mothersMaidenName) {
		MothersMaidenName = mothersMaidenName;
	}
	public String getHouseName() {
		return HouseName;
	}
	public void setHouseName(String houseName) {
		HouseName = houseName;
	}
	public Date getMothersAdmissionDate() {
		return MothersAdmissionDate;
	}
	public void setMothersAdmissionDate(Date mothersAdmissionDate) {
		MothersAdmissionDate = mothersAdmissionDate;
	}
	public Date getMotherssLeavingDate() {
		return MotherssLeavingDate;
	}
	public void setMotherssLeavingDate(Date motherssLeavingDate) {
		MotherssLeavingDate = motherssLeavingDate;
	}
	public String getGurdian() {
		return Gurdian;
	}
	public void setGurdian(String gurdian) {
		Gurdian = gurdian;
	}
	public String getRelationship() {
		return Relationship;
	}
	public void setRelationship(String relationship) {
		Relationship = relationship;
	}
	public String getGurdiansName() {
		return GurdiansName;
	}
	public void setGurdiansName(String gurdiansName) {
		GurdiansName = gurdiansName;
	}
	public String getGurdiansOccupation() {
		return GurdiansOccupation;
	}
	public void setGurdiansOccupation(String gurdiansOccupation) {
		GurdiansOccupation = gurdiansOccupation;
	}
	public String getGurdiansOfficialAddress() {
		return GurdiansOfficialAddress;
	}
	public void setGurdiansOfficialAddress(String gurdiansOfficialAddress) {
		GurdiansOfficialAddress = gurdiansOfficialAddress;
	}
	public Integer getGurdiansMobileNo() {
		return GurdiansMobileNo;
	}
	public void setGurdiansMobileNo(Integer gurdiansMobileNo) {
		GurdiansMobileNo = gurdiansMobileNo;
	}
	public Integer getGurdiansOfficialNo() {
		return GurdiansOfficialNo;
	}
	public void setGurdiansOfficialNo(Integer gurdiansOfficialNo) {
		GurdiansOfficialNo = gurdiansOfficialNo;
	}
	public String getGurdiansEmail() {
		return GurdiansEmail;
	}
	public void setGurdiansEmail(String gurdiansEmail) {
		GurdiansEmail = gurdiansEmail;
	}
	
	
}

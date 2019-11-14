package com.invicta.staff.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@SuppressWarnings("serial")
@Entity
@Table(schema = "studentservice", name = "staff")
public class Staff implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long staffId;
	
	private String empId;
	
	private String tittle;
	
	@Column(name = "firstname", nullable = false)
	private String firstname;

	@Column(name = "middlename", nullable = false)
	private String middlename;

	@Column(name = "lastname", nullable = false)
	private String lastname;
	
	@Column(name = "gender", nullable = false)
	private String gender;
	
	@Column(name = "status", nullable = false)
	private String status;
	
	@Column(name = "nicNo", nullable = false)
	private String nicNo;
	
	@Column(name = "dob", nullable = false)
	private Date dob;
	
	@Column(name = "postAddress", nullable = false)
	private String postAddress;
	
	@Column(name = "contactAddress", nullable = false)
	private String contactAddress;

	@Column(name = "mobileNo", nullable = false)
	private Integer mobileNo;
		
	@Column(name = "residencialNo", nullable = false)
	private Integer residencialNo;
		
	@Email
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "designation", nullable = false)
	private String designation;
	
	@Column(name = "firstAppointmentGrade", nullable = false)
	private String firstAppointmentGrade;
	
	@Column(name = "appointmentDate", nullable = false)
	private Date appointmentDate;
	
	@Column(name = "appointmentCategory", nullable = false)
	private String appointmentCategory;
	
	@Column(name = "educationQualification", nullable = false)
	private String educationQualification;
		
	@Column(name = "workExperience", nullable = false)
	private String workExperience;
		
	@Column(name = "presentGrade", nullable = false)
	private String presentGrade;
	
	@Column(name = "basicSalary", nullable = false)
	private Double basicSalary;
	
	@Column(name = "crossSalary", nullable = false)
	private Double crossSalary;
	
	@Column(name = "salaryIncrement", nullable = false)
	private Double salaryIncrement;
	
	@Column(name = "nextIncrementDate", nullable = false)
	private Date nextIncrementDate;
	
	@Column(name = "lastIncrementDate", nullable = false)
	private Date lastIncrementDate;

	public Long getStaffId() {
		return staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNicNo() {
		return nicNo;
	}

	public void setNicNo(String nicNo) {
		this.nicNo = nicNo;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPostAddress() {
		return postAddress;
	}

	public void setPostAddress(String postAddress) {
		this.postAddress = postAddress;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public Integer getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Integer getResidencialNo() {
		return residencialNo;
	}

	public void setResidencialNo(Integer residencialNo) {
		this.residencialNo = residencialNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getFirstAppointmentGrade() {
		return firstAppointmentGrade;
	}

	public void setFirstAppointmentGrade(String firstAppointmentGrade) {
		this.firstAppointmentGrade = firstAppointmentGrade;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getAppointmentCategory() {
		return appointmentCategory;
	}

	public void setAppointmentCategory(String appointmentCategory) {
		this.appointmentCategory = appointmentCategory;
	}

	public String getEducationQualification() {
		return educationQualification;
	}

	public void setEducationQualification(String educationQualification) {
		this.educationQualification = educationQualification;
	}

	public String getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}

	public String getPresentGrade() {
		return presentGrade;
	}

	public void setPresentGrade(String presentGrade) {
		this.presentGrade = presentGrade;
	}

	public Double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Double getCrossSalary() {
		return crossSalary;
	}

	public void setCrossSalary(Double crossSalary) {
		this.crossSalary = crossSalary;
	}

	public Double getSalaryIncrement() {
		return salaryIncrement;
	}

	public void setSalaryIncrement(Double salaryIncrement) {
		this.salaryIncrement = salaryIncrement;
	}

	public Date getNextIncrementDate() {
		return nextIncrementDate;
	}

	public void setNextIncrementDate(Date nextIncrementDate) {
		this.nextIncrementDate = nextIncrementDate;
	}

	public Date getLastIncrementDate() {
		return lastIncrementDate;
	}

	public void setLastIncrementDate(Date lastIncrementDate) {
		this.lastIncrementDate = lastIncrementDate;
	}

	
		
	
	
	
	
	
	

}

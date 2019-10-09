package com.invicta.member.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import java.sql.Date;

@SuppressWarnings("serial")
@Entity
@Table(schema = "memberservice", name = "student")
public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sId;

	private String stuId;

	
	@Column(name = "firstname", nullable = false)
	private String firstname;

	@Column(name = "middlename", nullable = false)
	private String middlename;

	@Column(name = "lastname", nullable = false)
	private String lastname;

	@Column(name = "startDate", nullable = false)
	private Date startDate;

	@Column(name = "address", nullable = false)
	private String address;

	@Column(name = "contactno", nullable = false)
	private Integer contactno;
	
	@Column(name = "religion", nullable = false)
	private String religion;
	
	@Column(name = "race", nullable = false)
	private String race;
	
	@Column(name = "dob", nullable = false)
	private Date dob;
	
	@Column(name = "gsdivision", nullable = false)
	private String gsdivision;
	
	@Column(name = "gender", nullable = false)
	private String gender;
	
	@Column(name = "formarschool", nullable = false)
	private String formarschool;
	
	@Column(name = "formerclass", nullable = false)
	private Integer formerclass;
	
	@Column(name = "hostelneed", nullable = false)
	private boolean hostelneed;
	
	@Column(name = "distance", nullable = false)
	private String distance;
	
	@Column(name = "achievementstudy", nullable = false)
	private String achievementstudy;
	
	@Column(name = "achievementsport", nullable = false)
	private String achievementsport;

	public Long getsId() {
		return sId;
	}

	public void setsId(Long sId) {
		this.sId = sId;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getContactno() {
		return contactno;
	}

	public void setContactno(Integer contactno) {
		this.contactno = contactno;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGsdivision() {
		return gsdivision;
	}

	public void setGsdivision(String gsdivision) {
		this.gsdivision = gsdivision;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFormarschool() {
		return formarschool;
	}

	public void setFormarschool(String formarschool) {
		this.formarschool = formarschool;
	}

	public Integer getFormerclass() {
		return formerclass;
	}

	public void setFormerclass(Integer formerclass) {
		this.formerclass = formerclass;
	}

	public boolean isHostelneed() {
		return hostelneed;
	}

	public void setHostelneed(boolean hostelneed) {
		this.hostelneed = hostelneed;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getAchievementstudy() {
		return achievementstudy;
	}

	public void setAchievementstudy(String achievementstudy) {
		this.achievementstudy = achievementstudy;
	}

	public String getAchievementsport() {
		return achievementsport;
	}

	public void setAchievementsport(String achievementsport) {
		this.achievementsport = achievementsport;
	}

}

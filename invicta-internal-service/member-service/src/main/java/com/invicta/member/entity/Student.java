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
@Table(schema = "memberservice", name = "member")
public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sId;

	private String stuId;

	
	@Column(name = "firstname", nullable = false)
	private String firstname;

	private String middlename;

	private String lastname;

	private Date startDate;

	private String address;

	private Integer contactno;

	private String religion;
	private String race;
	private Date dob;

	private String gsdivision;

	private String gender;

	private String formarschool;

	private Integer formerclass;

	private boolean hostelneed;

	private String distance;

	private String achievementstudy;

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

package com.invicta.member.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(schema = "memberservice", name = "member")
public class Student implements Serializable {

	LocalDate todayDate = LocalDate.now();
	java.sql.Date currentDay = java.sql.Date.valueOf(todayDate);
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mId;
	private String stuId;
	private String first_name;
	private String middle_name;
	private String last_name;
	private Date startDate;
	private String address;
	private Integer contact_no;
	private String religion;
	private String race;
	private Date dob;
	private String gs_division;
	private String gender;
	private String formar_school;
	private Integer former_class;
	private boolean hostel_need;
	private String distance;
	private String achievement_study;
	private String achievement_sport;

	public java.sql.Date getCurrentDay() {
		return currentDay;
	}

	public void setCurrentDay(java.sql.Date currentDay) {
		this.currentDay = currentDay;
	}

	public Integer getmId() {
		return mId;
	}

	public void setmId(Integer mId) {
		this.mId = mId;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
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

	public Integer getContact_no() {
		return contact_no;
	}

	public void setContact_no(Integer contact_no) {
		this.contact_no = contact_no;
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

	public String getGs_division() {
		return gs_division;
	}

	public void setGs_division(String gs_division) {
		this.gs_division = gs_division;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFormar_school() {
		return formar_school;
	}

	public void setFormar_school(String formar_school) {
		this.formar_school = formar_school;
	}

	public Integer getFormer_class() {
		return former_class;
	}

	public void setFormer_class(Integer former_class) {
		this.former_class = former_class;
	}

	public boolean isHostel_need() {
		return hostel_need;
	}

	public void setHostel_need(boolean hostel_need) {
		this.hostel_need = hostel_need;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getAchievement_study() {
		return achievement_study;
	}

	public void setAchievement_study(String achievement_study) {
		this.achievement_study = achievement_study;
	}

	public String getAchievement_sport() {
		return achievement_sport;
	}

	public void setAchievement_sport(String achievement_sport) {
		this.achievement_sport = achievement_sport;
	}

}

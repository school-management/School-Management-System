package com.invicta.member.dto;

import java.sql.Date;

public class StudentDto {

	private Long sId;
	private String stuId;
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
	private Long divisionId;
	private String divisionName;
	private Long gradeId;
	private int gradeName;
	private Long parId;
	private String parentId;
	private String fathername;
	private String fatherOccupation;
	private String fathersofficialaddress;
	private Integer fathermobile;
	private String fatheremail;
	private boolean fatheroldstudent;
	private Integer fstudystart;
	private Integer fstudyend;
	private String mothername;
	private String motheroccupation;
	private Integer mothermobile;
	private boolean motheroldstudent;
	private String mothermaidenname;
	private Integer motherstudystart;
	private Integer motherstudyend;
	private String guardian;
	private String guardianname;
	private String guardianoccupation;
	private Integer guardianmobileNo;
	private String guardianemail;
	private String sibilingsfullname;
	private Integer sibilingsGrade;
	private String sililingsadmission;
	private String fullName;
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Long getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(Long divisionId) {
		this.divisionId = divisionId;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

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

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public int getGradeName() {
		return gradeName;
	}

	public void setGradeName(int gradeName) {
		this.gradeName = gradeName;
	}

	public Long getParId() {
		return parId;
	}

	public void setParId(Long parId) {
		this.parId = parId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getFatherOccupation() {
		return fatherOccupation;
	}

	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}

	public String getFathersofficialaddress() {
		return fathersofficialaddress;
	}

	public void setFathersofficialaddress(String fathersofficialaddress) {
		this.fathersofficialaddress = fathersofficialaddress;
	}

	public Integer getFathermobile() {
		return fathermobile;
	}

	public void setFathermobile(Integer fathermobile) {
		this.fathermobile = fathermobile;
	}

	public String getFatheremail() {
		return fatheremail;
	}

	public void setFatheremail(String fatheremail) {
		this.fatheremail = fatheremail;
	}

	public boolean isFatheroldstudent() {
		return fatheroldstudent;
	}

	public void setFatheroldstudent(boolean fatheroldstudent) {
		this.fatheroldstudent = fatheroldstudent;
	}

	public Integer getFstudystart() {
		return fstudystart;
	}

	public void setFstudystart(Integer fstudystart) {
		this.fstudystart = fstudystart;
	}

	public Integer getFstudyend() {
		return fstudyend;
	}

	public void setFstudyend(Integer fstudyend) {
		this.fstudyend = fstudyend;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public String getMotheroccupation() {
		return motheroccupation;
	}

	public void setMotheroccupation(String motheroccupation) {
		this.motheroccupation = motheroccupation;
	}

	public Integer getMothermobile() {
		return mothermobile;
	}

	public void setMothermobile(Integer mothermobile) {
		this.mothermobile = mothermobile;
	}

	public boolean isMotheroldstudent() {
		return motheroldstudent;
	}

	public void setMotheroldstudent(boolean motheroldstudent) {
		this.motheroldstudent = motheroldstudent;
	}

	public String getMothermaidenname() {
		return mothermaidenname;
	}

	public void setMothermaidenname(String mothermaidenname) {
		this.mothermaidenname = mothermaidenname;
	}

	public Integer getMotherstudystart() {
		return motherstudystart;
	}

	public void setMotherstudystart(Integer motherstudystart) {
		this.motherstudystart = motherstudystart;
	}

	public Integer getMotherstudyend() {
		return motherstudyend;
	}

	public void setMotherstudyend(Integer motherstudyend) {
		this.motherstudyend = motherstudyend;
	}

	public String getGuardian() {
		return guardian;
	}

	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}

	public String getGuardianname() {
		return guardianname;
	}

	public void setGuardianname(String guardianname) {
		this.guardianname = guardianname;
	}

	public String getGuardianoccupation() {
		return guardianoccupation;
	}

	public void setGuardianoccupation(String guardianoccupation) {
		this.guardianoccupation = guardianoccupation;
	}

	public Integer getGuardianmobileNo() {
		return guardianmobileNo;
	}

	public void setGuardianmobileNo(Integer guardianmobileNo) {
		this.guardianmobileNo = guardianmobileNo;
	}

	public String getGuardianemail() {
		return guardianemail;
	}

	public void setGuardianemail(String guardianemail) {
		this.guardianemail = guardianemail;
	}

	public String getSibilingsfullname() {
		return sibilingsfullname;
	}

	public void setSibilingsfullname(String sibilingsfullname) {
		this.sibilingsfullname = sibilingsfullname;
	}

	public Integer getSibilingsGrade() {
		return sibilingsGrade;
	}

	public void setSibilingsGrade(Integer sibilingsGrade) {
		this.sibilingsGrade = sibilingsGrade;
	}

	public String getSililingsadmission() {
		return sililingsadmission;
	}

	public void setSililingsadmission(String sililingsadmission) {
		this.sililingsadmission = sililingsadmission;
	}
	
	
}

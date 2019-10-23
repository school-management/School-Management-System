package com.invicta.member.Converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.invicta.member.dto.StaffDto;
import com.invicta.member.entity.Staff;

@Service
public class StaffDtoConverter {

	public static Staff StaffDtoToStaff(StaffDto staffDto) {

		Staff staff = new Staff();
		if (staffDto != null) {
			staff.setStaffId(staffDto.getStaffId());
			staff.setEmpId(staffDto.getEmpId());
			staff.setTittle(staffDto.getTittle());
			staff.setFirstname(staffDto.getFirstname());
			staff.setMiddlename(staffDto.getMiddlename());
			staff.setLastname(staffDto.getLastname());
			staff.setGender(staffDto.getGender());
			staff.setStatus(staffDto.getStatus());
			staff.setNicNo(staffDto.getNicNo());
			staff.setDob(staffDto.getDob());
			staff.setPostAddress(staffDto.getPostAddress());
			staff.setContactAddress(staffDto.getContactAddress());
			staff.setMobileNo(staffDto.getMobileNo());
			staff.setResidencialNo(staffDto.getResidencialNo());
			staff.setEmail(staffDto.getEmail());
			staff.setDesignation(staffDto.getDesignation());
			staff.setFirstAppointmentGrade(staffDto.getFirstAppointmentGrade());
			staff.setAppointmentDate(staffDto.getAppointmentDate());
			staff.setAppointmentCategory(staffDto.getAppointmentCategory());
			staff.setEducationQualification(staffDto.getEducationQualification());
			staff.setWorkExperience(staffDto.getWorkExperience());
			staff.setPresentGrade(staffDto.getPresentGrade());
			staff.setBasicSalary(staffDto.getBasicSalary());
			staff.setCrossSalary(staffDto.getCrossSalary());
			staff.setSalaryIncrement(staffDto.getSalaryIncrement());
			staff.setNextIncrementDate(staffDto.getNextIncrementDate());
			staff.setLastIncrementDate(staffDto.getLastIncrementDate());
			return staff;

		}

		return null;
	}

	public static List<StaffDto> StaffToStaffDTO(List<Staff> stafflist) {

		if (stafflist != null) {

			List<StaffDto> listStaffDto = new ArrayList<>();
			for (Staff staff : stafflist) {
				StaffDto staffDto = new StaffDto();
				staffDto.setStaffId(staff.getStaffId());
				staffDto.setEmpId(staff.getEmpId());
				staffDto.setTittle(staff.getTittle());
				staffDto.setFirstname(staff.getFirstname());
				staffDto.setMiddlename(staff.getMiddlename());
				staffDto.setLastname(staff.getLastname());
				staffDto.setGender(staff.getGender());
				staffDto.setStatus(staff.getStatus());
				staffDto.setNicNo(staff.getNicNo());
				staffDto.setDob(staff.getDob());
				staffDto.setPostAddress(staff.getPostAddress());
				staffDto.setContactAddress(staff.getContactAddress());
				staffDto.setMobileNo(staff.getMobileNo());
				staffDto.setResidencialNo(staff.getResidencialNo());
				staffDto.setEmail(staff.getEmail());
				staffDto.setDesignation(staff.getDesignation());
				staffDto.setFirstAppointmentGrade(staff.getFirstAppointmentGrade());
				staffDto.setAppointmentDate(staff.getAppointmentDate());
				staffDto.setAppointmentCategory(staff.getAppointmentCategory());
				staffDto.setEducationQualification(staff.getEducationQualification());
				staffDto.setWorkExperience(staff.getWorkExperience());
				staffDto.setPresentGrade(staff.getPresentGrade());
				staffDto.setBasicSalary(staff.getBasicSalary());
				staffDto.setCrossSalary(staff.getCrossSalary());
				staffDto.setSalaryIncrement(staff.getSalaryIncrement());
				staffDto.setNextIncrementDate(staff.getNextIncrementDate());
				staffDto.setLastIncrementDate(staff.getLastIncrementDate());
				listStaffDto.add(staffDto);
			}
			return listStaffDto;
		}
		return null;
	}

	public static StaffDto StaffEntityToStaffDTO(Staff staff) {
		StaffDto staffDto = new StaffDto();
		if (staff != null) {

			staffDto.setStaffId(staff.getStaffId());
			staffDto.setEmpId(staff.getEmpId());
			staffDto.setTittle(staff.getTittle());
			staffDto.setFirstname(staff.getFirstname());
			staffDto.setMiddlename(staff.getMiddlename());
			staffDto.setLastname(staff.getLastname());
			staffDto.setGender(staff.getGender());
			staffDto.setStatus(staff.getStatus());
			staffDto.setNicNo(staff.getNicNo());
			staffDto.setDob(staff.getDob());
			staffDto.setPostAddress(staff.getPostAddress());
			staffDto.setContactAddress(staff.getContactAddress());
			staffDto.setMobileNo(staff.getMobileNo());
			staffDto.setResidencialNo(staff.getResidencialNo());
			staffDto.setEmail(staff.getEmail());
			staffDto.setDesignation(staff.getDesignation());
			staffDto.setFirstAppointmentGrade(staff.getFirstAppointmentGrade());
			staffDto.setAppointmentDate(staff.getAppointmentDate());
			staffDto.setAppointmentCategory(staff.getAppointmentCategory());
			staffDto.setEducationQualification(staff.getEducationQualification());
			staffDto.setWorkExperience(staff.getWorkExperience());
			staffDto.setPresentGrade(staff.getPresentGrade());
			staffDto.setBasicSalary(staff.getBasicSalary());
			staffDto.setCrossSalary(staff.getCrossSalary());
			staffDto.setSalaryIncrement(staff.getSalaryIncrement());
			staffDto.setNextIncrementDate(staff.getNextIncrementDate());
			staffDto.setLastIncrementDate(staff.getLastIncrementDate());
			return staffDto;

		}
		return null;
	}
}

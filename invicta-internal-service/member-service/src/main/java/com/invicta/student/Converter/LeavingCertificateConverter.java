package com.invicta.student.Converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.invicta.student.dto.LeavingCertificateDto;
import com.invicta.student.entity.LeavingCertificate;
import com.invicta.student.entity.Student;

@Service
public class LeavingCertificateConverter {
	
	private static Logger logger = LogManager.getLogger(LeavingCertificateDto.class);
	
	public static LeavingCertificate LeavingCertificateDtoToEntity(LeavingCertificateDto leavingCertificateDto ) {
		LeavingCertificate leavingCertificate=new LeavingCertificate();
		if(leavingCertificate !=null) {
			logger.info("leavingCertificate converter---> DTO To Entity");
			
			leavingCertificate.setLeavingCertificateId(leavingCertificateDto.getLeavingCertificateId());
			
			Student student=new Student();
			student.setsId(leavingCertificateDto.getStudentId());
			leavingCertificate.setStudent(student);
			
			return leavingCertificate;
			
		}
		return null;
	}
	
	public static List<LeavingCertificateDto> LeavingCertificateToDtoList(List<LeavingCertificate> listLeavingCertificate){
		
		if(listLeavingCertificate != null) {
			logger.info("LeavingCertificate converter---> Entity To Dto list");
			
		List<LeavingCertificateDto> listLeavingCertificateDto=new ArrayList<>();
		for(LeavingCertificate leavingCertificate:listLeavingCertificate) {
			logger.info("LeavingCertificate Converter--> LeavingCertificate List converte");
			LeavingCertificateDto leavingCertificateDto=new LeavingCertificateDto();
			leavingCertificateDto.setLeavingCertificateId(leavingCertificate.getLeavingCertificateId());
			leavingCertificateDto.setStudentId(leavingCertificate.getStudent().getsId());
			listLeavingCertificateDto.add(leavingCertificateDto);
		}
		return listLeavingCertificateDto;
			
		}
		return null;
	}
	
	public static LeavingCertificateDto LeavingCertificateToDto(LeavingCertificate leavingCertificate){
		LeavingCertificateDto leavingCertificateDto=new LeavingCertificateDto();
		if(leavingCertificate != null) {
			leavingCertificateDto.setLeavingCertificateId(leavingCertificate.getLeavingCertificateId());
			leavingCertificateDto.setStudentId(leavingCertificate.getStudent().getsId());
			return leavingCertificateDto;
		}
			return null;
		}

}

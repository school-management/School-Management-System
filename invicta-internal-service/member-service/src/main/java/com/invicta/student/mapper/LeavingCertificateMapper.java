package com.invicta.student.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.student.Converter.LeavingCertificateConverter;
import com.invicta.student.Service.LeavingCertificateService;
import com.invicta.student.dto.LeavingCertificateDto;
import com.invicta.student.entity.LeavingCertificate;

@Service
public class LeavingCertificateMapper {
	
	@Autowired
	private LeavingCertificateService leavingCertificateService;
	
	private LeavingCertificateConverter leavingCertificateConverter;
	
	
	private static Logger logger = LogManager.getLogger(LeavingCertificateConverter.class);
	
	@SuppressWarnings("static-access")
	public LeavingCertificate saveLeavingCertificate(LeavingCertificateDto leavingCertificateDto) {
		logger.info("LeavingCertificate Mapper -> LeavingCertificate Saved");
		return leavingCertificateService.saveLeavingCertificate(leavingCertificateConverter.LeavingCertificateDtoToEntity(leavingCertificateDto));
	}
	
	@SuppressWarnings("static-access")
	public List<LeavingCertificateDto> listLeavingCertificate(){
		List<LeavingCertificate> list=leavingCertificateService.listLeavingCertificate();
		return leavingCertificateConverter.LeavingCertificateToDtoList(list);
	}
}

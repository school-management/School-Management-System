package com.invicta.member.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Converter.LeavingCertificateConverter;
import com.invicta.member.Service.LeavingCertificateService;
import com.invicta.member.dto.LeavingCertificateDto;
import com.invicta.member.entity.LeavingCertificate;

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

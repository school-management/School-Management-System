package com.invicta.member.ServiceImp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Service.LeavingCertificateService;
import com.invicta.member.entity.LeavingCertificate;
import com.invicta.member.repository.LeavingCertificateRepository;

@Service
public class LeavingCertificateServiceImpl implements LeavingCertificateService{
	
	@Autowired
	private LeavingCertificateRepository leavingCertificateRepository;
	
	@Override
	public LeavingCertificate saveLeavingCertificate(LeavingCertificate leavingCertificate) {
		
		return leavingCertificateRepository.save(leavingCertificate);
	}

	@Override
	public List<LeavingCertificate> listLeavingCertificate() {
		
		return leavingCertificateRepository.findAll();
	}

}

package com.invicta.member.Service;

import java.util.List;

import com.invicta.member.entity.LeavingCertificate;

public interface LeavingCertificateService {
	
	public LeavingCertificate saveLeavingCertificate(LeavingCertificate leavingCertificate);
	
	public List<LeavingCertificate> listLeavingCertificate();
}

package com.invicta.student.Service;

import java.util.List;

import com.invicta.student.entity.LeavingCertificate;

public interface LeavingCertificateService {
	
	public LeavingCertificate saveLeavingCertificate(LeavingCertificate leavingCertificate);
	
	public List<LeavingCertificate> listLeavingCertificate();
}

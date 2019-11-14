package com.invicta.student.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invicta.student.dto.LeavingCertificateDto;
import com.invicta.student.entity.LeavingCertificate;
import com.invicta.student.mapper.LeavingCertificateMapper;

@RestController
@RequestMapping("/Api/")
public class LeavingCertificateController {
	@Autowired 
	private LeavingCertificateMapper leavingCertificateMapper;
	
	private static Logger logger = LogManager.getLogger(LeavingCertificateMapper.class);
	
	
	@PostMapping("/saveleavingCertificate")
	public LeavingCertificate saveLeavingCertificate(@RequestBody LeavingCertificateDto leavingCertificateDto) {
		return leavingCertificateMapper.saveLeavingCertificate(leavingCertificateDto);
	}
	
	
	@GetMapping("/listleavingCertificate")
	public List<LeavingCertificateDto> getLeavingCertificate(){
		return leavingCertificateMapper.listLeavingCertificate();
	}

}

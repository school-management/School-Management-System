package com.invicta.member.ServiceImp;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Service.ParentService;
import com.invicta.member.entity.Parent;
import com.invicta.member.repository.ParentRepository;

@Service
public class ParentServicelmp implements ParentService{

	@Autowired
	private ParentRepository parentRepository;
	
	private static Logger logger = LogManager.getLogger(ParentRepository.class);
	
	@Override
	public Parent saveParent(Parent parent) {
		try {
			return parentRepository.save(parent);
		} catch (Exception e) {
			logger.info("Parent Service Implementation -->", e.getMessage());
		}
		return null;
	}

	
	

}

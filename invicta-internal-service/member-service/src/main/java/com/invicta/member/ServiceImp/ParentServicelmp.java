package com.invicta.member.ServiceImp;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.invicta.member.Service.ParentService;
import com.invicta.member.entity.Parent;
import com.invicta.member.repository.ParentRepository;


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

	@Override
	public List<Parent> getAllParent() {
		try {
			return parentRepository.findAll();
		} catch (Exception e) {
			logger.info("Parent Service Implementation -->", e.getMessage());
		}		return null;
	}

	@Override
	public Parent getByParentID(Long par_id) {
		try {
			return parentRepository.findByParentID(par_id);
		} catch (Exception e) {
			logger.info("Parent Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public Parent DeleteByParentID(Long par_id) {
		try {
			parentRepository.deleteById(par_id);
		} catch (Exception e) {
			logger.info("Parent Service Implementation -->", e.getMessage());
		}		return null;
	}

	@Override
	public Parent EditParentID(Parent parent) {
		try {
			return parentRepository.save(parent);
		} catch (Exception e) {
			logger.info("Parent Service Implementation -->", e.getMessage());
		}
		return null;
	}
	
	

}

package com.invicta.member.ServiceImp;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Service.ParentService;
import com.invicta.member.entity.Parent;
import com.invicta.member.repository.ParentRepository;

@Service
public class ParentServicelmp implements ParentService {

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
		}
		return null;
	}

	@Override
	public Parent getByParID(Long parId) {
		try {
			return parentRepository.findByparId(parId);
		} catch (Exception e) {
			logger.info("Parent Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public Parent updateParent(Parent parent) {
		return parentRepository.save(parent);
			
	}

	@Override
	public Parent deleteByParId(Long parId) {
		try {
			parentRepository.deleteById(parId);
		} catch (Exception e) {
			logger.info("Parent Service Implementation -->", e.getMessage());
		}
		return null;
	}

}

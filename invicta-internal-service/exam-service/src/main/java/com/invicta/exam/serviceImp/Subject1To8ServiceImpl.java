package com.invicta.exam.serviceImp;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.exam.entity.Subject1To8;
import com.invicta.exam.repository.Subject1To8Repository;
import com.invicta.exam.service.Subject1To8Service;

@Service
public class Subject1To8ServiceImpl implements Subject1To8Service {

	@Autowired
	private Subject1To8Repository subject1To8Repository;

	private static Logger logger = LogManager.getLogger(Subject1To8Repository.class);

	@Override
	public Subject1To8 createSubject(Subject1To8 subject1To8) {
		try {
			return subject1To8Repository.save(subject1To8);
		} catch (Exception e) {
			logger.info("Subject1To8 Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public List<Subject1To8> getAllSubjects() {
		try {
			return subject1To8Repository.findAll();
		} catch (Exception e) {
			logger.info("Subject1To8 Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public Subject1To8 getBySubjectId(Long subjectId) {
		try {
			return subject1To8Repository.findBySubjectId(subjectId);
		} catch (Exception e) {
			logger.info("Subject1To8 Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public Subject1To8 deleteBySubjectId(Long subjectId) {
		try {
			 subject1To8Repository.deleteById(subjectId);
		} catch (Exception e) {
			logger.info("Subject1To8 Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public Subject1To8 updateSubject(Subject1To8 subject1To8) {
		Long subId = subject1To8.getSubjectId();
		boolean isExist = subject1To8Repository.findBySubjectId(subId) != null;
		if (isExist) {
			logger.info("Subject1To8 updates Successfully");
			return subject1To8Repository.save(subject1To8);
		} else {
			logger.info("Subject1To8 Id is Not Found");
		}

		return null;
	}

}

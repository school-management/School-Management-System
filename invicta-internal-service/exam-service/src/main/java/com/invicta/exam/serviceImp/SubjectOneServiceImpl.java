package com.invicta.exam.serviceImp;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.exam.entity.Grade;
import com.invicta.exam.entity.SubjectOne;
import com.invicta.exam.repository.SubjectOneRepository;
import com.invicta.exam.service.SubjectOneService;

@Service
public class SubjectOneServiceImpl implements SubjectOneService {

	@Autowired
	private SubjectOneRepository subjectOneRepository;

	private static Logger logger = LogManager.getLogger(SubjectOneRepository.class);

	@Override
	public SubjectOne createSubject(SubjectOne subject1To8) {
		try {
			return subjectOneRepository.save(subject1To8);
		} catch (Exception e) {
			logger.info("Subject1To8 Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public List<SubjectOne> getAllSubjects() {
		try {
			return subjectOneRepository.findAll();
		} catch (Exception e) {
			logger.info("Subject1To8 Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public SubjectOne getBySubjectId(Long subjectId) {
		try {
			return subjectOneRepository.findBySubjectId(subjectId);
		} catch (Exception e) {
			logger.info("Subject1To8 Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public SubjectOne deleteBySubjectId(Long subjectId) {
		try {
			subjectOneRepository.deleteById(subjectId);
		} catch (Exception e) {
			logger.info("Subject1To8 Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public SubjectOne updateSubject(SubjectOne subject1To8) {
		Long subId = subject1To8.getSubjectId();
		boolean isExist = subjectOneRepository.findBySubjectId(subId) != null;
		if (isExist) {
			logger.info("Subject1To8 updates Successfully");
			return subjectOneRepository.save(subject1To8);
		} else {
			logger.info("Subject1To8 Id is Not Found");
		}

		return null;
	}

	@Override
	public List<SubjectOne> getsubjectById() {
		return subjectOneRepository.getAllsubjectId();
	}

	@Override
	public List<SubjectOne> getallgradebyId() {
		return subjectOneRepository.getAllgradeId();
	}

	@Override
	public List<Grade> getAllGradeId() {
		return subjectOneRepository.getAllgradeId();
	}

}
package com.invicta.exam.serviceImp;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.exam.entity.Grade;
import com.invicta.exam.entity.Subject;
import com.invicta.exam.repository.SubjectRepository;
import com.invicta.exam.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;

	private static Logger logger = LogManager.getLogger(SubjectRepository.class);

	@Override
	public Subject createSubject(Subject subject) {
		try {
			return subjectRepository.save(subject);
		} catch (Exception e) {
			logger.info("Subject Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public List<Subject> getAllSubjects() {
		try {
			return subjectRepository.findAll();
		} catch (Exception e) {
			logger.info("Subject Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public Subject getBySubjectId(Long SubjectId) {
		try {
			return subjectRepository.findBySubjectId(SubjectId);
		} catch (Exception e) {
			logger.info("Subject Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public Subject deleteBySubjectId(Long SubjectId) {
		try {
			subjectRepository.deleteById(SubjectId);
		} catch (Exception e) {
			logger.info("Subject Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public Subject updateSubject(Subject subject) {
		Long subId = subject.getSubjectId();
		boolean isExist = subjectRepository.findBySubjectId(subId) != null;
		if (isExist) {
			logger.info("Subject updates Successfully");
			return subjectRepository.save(subject);
		} else {
			logger.info("Subject Id is Not Found");
		}
		return null;
	}

	@Override
	public List<Subject> getAllSubjectId() {
		return subjectRepository.getAllSubjectId();
	}

	@Override
	public List<Grade> getAllGradeId() {
		return subjectRepository.getAllgradeId();
	}

}


package com.invicta.exam.serviceImp;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.exam.entity.ScholarshipResults;
import com.invicta.exam.repository.ScholarshipResultsRepository;
import com.invicta.exam.service.ScholarshipResultsService;

@Service
public class ScholarshipResultsServiceImpl implements ScholarshipResultsService{

	@Autowired
	private ScholarshipResultsRepository scholarshipResultsRepository;
	
	private static Logger logger = LogManager.getLogger(ScholarshipResultsRepository.class);
	
	@Override
	public ScholarshipResults createScholarshipResult(ScholarshipResults scholarshipResults) {
		try {
			return scholarshipResultsRepository.save(scholarshipResults);
		} catch (Exception e) {
			logger.info("Scholarship Results Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public List<ScholarshipResults> getAllScholarshipResults() {
		try {
			return scholarshipResultsRepository.findAll();
		} catch (Exception e) {
			logger.info("Scholarship Results Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public ScholarshipResults getByScholarshipResultId(Long scholarshipResultId) {
		try {
			return scholarshipResultsRepository.findByScholarshipResultId(scholarshipResultId);
		} catch (Exception e) {
			logger.info("Scholarship Results Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public ScholarshipResults deleteByScholarshipResultId(Long scholarshipResultId) {
		try {
			scholarshipResultsRepository.deleteById(scholarshipResultId);
		} catch (Exception e) {
			logger.info("Scholarship Results Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public ScholarshipResults updateSubject(ScholarshipResults scholarshipResults) {
		Long schId = scholarshipResults.getScholarshipResultId();
		boolean isExist = scholarshipResultsRepository.findByScholarshipResultId(schId) != null;
		if (isExist) {
			logger.info("Scholarship Results updates Successfully");
			return scholarshipResultsRepository.save(scholarshipResults);
		} else {
			logger.info("Scholarship Results Id is Not Found");
		}
		return null;
	}

	@Override
	public List<ScholarshipResults> getAllScholarshipResultId() {
		return scholarshipResultsRepository.getAllScholarshipId();
	}

}

package com.invicta.exam.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.exam.entity.Student;
import com.invicta.exam.entity.SubjectList;
import com.invicta.exam.entity.SubjectOne;
import com.invicta.exam.repository.SubjectOneRepository;
import com.invicta.exam.service.SubjectOneService;

@Service
public class SubjectOneServiceImpl implements SubjectOneService {

	@Autowired
	private SubjectOneRepository subject1To8Repository;

	private static Logger logger = LogManager.getLogger(SubjectOneRepository.class);

	@Override
	public SubjectOne createSubject(SubjectOne subject1To8) {
		try {
			return subject1To8Repository.save(subject1To8);
		} catch (Exception e) {
			logger.info("Subject1To8 Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public List<SubjectOne> getAllSubjects() {
		try {
			return subject1To8Repository.findAll();
		} catch (Exception e) {
			logger.info("Subject1To8 Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public SubjectOne getBySubjectId(Long subjectId) {
		try {
			return subject1To8Repository.findBySubjectId(subjectId);
		} catch (Exception e) {
			logger.info("Subject1To8 Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public SubjectOne deleteBySubjectId(Long subjectId) {
		try {
			subject1To8Repository.deleteById(subjectId);
		} catch (Exception e) {
			logger.info("Subject1To8 Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public SubjectOne updateSubject(SubjectOne subject1To8) {
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

	public void saveResourceTable(List<SubjectOne> resourceAllocation) {

		try {
			int size = resourceAllocation.size();
			int counter = 0;
			List<SubjectOne> temp = new ArrayList<>();

			for (SubjectOne emp : resourceAllocation) {
				temp.add(emp);

				if ((counter + 1) % 500 == 0 || (counter + 1) == size) {
//					resourceAllocationRepository.saveAll(resourceAllocation);
					subject1To8Repository.saveAll(resourceAllocation);
					temp.clear();
				}
				counter++;
			}
		} catch (Exception ex) {
			logger.error("Resource Allocation Imp Error :-> " + ex.getMessage());
		}

	}

	@Override
	public List<SubjectOne> getsubjectById() {

		return subject1To8Repository.getAllsubjectId();
	}

	@Override
	public List<SubjectOne> getAllstudentId() {

		return subject1To8Repository.getAllstudentId();
	}

	@Override
	public List<SubjectOne> getAllsubjectId() {

		return subject1To8Repository.getAllsubjectId();
	}


}

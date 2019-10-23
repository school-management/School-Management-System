package com.invicta.exam.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.invicta.exam.entity.Student;
import com.invicta.exam.entity.SubjectList;
=======
import com.invicta.exam.entity.Grade;
>>>>>>> aeb3b123ea345ab321014a602c063654eac9d1ff
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
<<<<<<< HEAD
			subject1To8Repository.deleteById(subjectId);
=======
			subjectOneRepository.deleteById(subjectId);
>>>>>>> aeb3b123ea345ab321014a602c063654eac9d1ff
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
<<<<<<< HEAD

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
=======
>>>>>>> aeb3b123ea345ab321014a602c063654eac9d1ff

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
	


	@Override
	public List<SubjectOne> getAllstudentId() {

		return subject1To8Repository.getAllstudentId();
	}

	@Override
	public List<SubjectOne> getAllsubjectId() {

		return subject1To8Repository.getAllsubjectId();
	}


}


	

	


	



//	@Override
//	public SubjectOne getBySubjectId() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public List<SubjectOne> getsubjectById() {
//
//		return subjectOneRepository.findBySubjectId(subjectId);
//	}

//public void saveResourceTable(List<SubjectOne> resourceAllocation) {
//
//	try {
//		int size = resourceAllocation.size();
//		int counter = 0;
//		List<SubjectOne> temp = new ArrayList<>();
//
//		for (SubjectOne emp : resourceAllocation) {
//			temp.add(emp);
//
//			if ((counter + 1) % 500 == 0 || (counter + 1) == size) {
////				resourceAllocationRepository.saveAll(resourceAllocation);
//				subjectOneRepository.saveAll(resourceAllocation);
//				temp.clear();
//			}
//			counter++;
//		}
//	} catch (Exception ex) {
//		logger.error("Resource Allocation Imp Error :-> " + ex.getMessage());
//	}
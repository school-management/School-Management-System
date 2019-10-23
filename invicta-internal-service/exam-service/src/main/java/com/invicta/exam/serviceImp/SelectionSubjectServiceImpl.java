package com.invicta.exam.serviceImp;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.exam.entity.SelectionSubject;
import com.invicta.exam.repository.SelectionSubjectRepository;
import com.invicta.exam.service.SelectionSubjectService;

@Service
public class SelectionSubjectServiceImpl implements SelectionSubjectService{

	@Autowired
	private SelectionSubjectRepository selectionSubjectRepository;
	
	private static Logger logger = LogManager.getLogger(SelectionSubjectRepository.class);
	
	@Override
	public SelectionSubject createSelectionSubject(SelectionSubject selectionSubject) {
		try {
			return selectionSubjectRepository.save(selectionSubject);
		} catch (Exception e) {
			logger.info("Selection Subject Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public List<SelectionSubject> getAllSelectionSubjects() {
		try {
			return selectionSubjectRepository.findAll();
		} catch (Exception e) {
			logger.info("Selection Subject Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public SelectionSubject getBySelectionSubjectId(Long selectionSubjectId) {
		try {
			return selectionSubjectRepository.findBySelectionSubjectId(selectionSubjectId);
		} catch (Exception e) {
			logger.info("Selection Subject Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public SelectionSubject deleteBySelectionSubjectId(Long selectionSubjectId) {
		try {
			selectionSubjectRepository.deleteById(selectionSubjectId);
		} catch (Exception e) {
			logger.info("Selection Subject Service Implementation -->", e.getMessage());
		}
		return null;
	}

	@Override
	public SelectionSubject updateSubject(SelectionSubject selectionSubject) {
		Long selsubId = selectionSubject.getSelectionSubjectId();
		boolean isExist = selectionSubjectRepository.findBySelectionSubjectId(selsubId) != null;
		if (isExist) {
			logger.info("Selection Subject updates Successfully");
			return selectionSubjectRepository.save(selectionSubject);
		} else {
			logger.info("Selection Subject Id is Not Found");
		}
		return null;
	}

}

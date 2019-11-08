package com.invicta.exam.mapper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.exam.convertor.ScholarshipResultsConverter;
import com.invicta.exam.dto.ScholarshipResultsDto;
import com.invicta.exam.entity.ScholarshipResults;
import com.invicta.exam.service.ScholarshipResultsService;

@Service
public class ScholarshipResultsMapper {

	@Autowired
	private ScholarshipResultsService scholarshipResultsService;

	@Autowired
	private ScholarshipResultsConverter scholarshipResultsConverter;

	private static Logger logger = LogManager.getLogger(ScholarshipResultsConverter.class);

	@SuppressWarnings("static-access")
	public ScholarshipResults saveScholarshipResults(ScholarshipResultsDto scholarshipResultsDto) {
		logger.info("Scholarship Results Mapper -> Selection Subject Saved");
		return scholarshipResultsService.createScholarshipResult(
				scholarshipResultsConverter.ScholarshipResultsDtoToScholarshipResultsEntity(scholarshipResultsDto));

	}

	@SuppressWarnings("static-access")
	public List<ScholarshipResultsDto> getAllScholarshipResults() {
		logger.info(" All Scholarship Results Successfully Listed ");
		List<ScholarshipResults> scholarshipResultsList = scholarshipResultsService.getAllScholarshipResults();
		return scholarshipResultsConverter
				.ScholarshipResultsEntityToScholarshipResultsDtoforList(scholarshipResultsList);

	}

	@SuppressWarnings("static-access")
	public ScholarshipResultsDto getByScholarshipResultsId(Long scholarshipResultId) {
		logger.info("Successfully get Scholarship Results by Id");
		ScholarshipResults scholarshipResults = scholarshipResultsService.getByScholarshipResultId(scholarshipResultId);
		return scholarshipResultsConverter.ScholarshipResultsEntityToScholarshipResultsDto(scholarshipResults);
	}

	public ScholarshipResultsDto deleteScholarshipResultsById(Long scholarshipResultId) {
		logger.info("Scholarship Results Mapper ----> Scholarship Results Record Deleted");
		scholarshipResultsService.deleteByScholarshipResultId(scholarshipResultId);
		return null;
	}

	@SuppressWarnings("static-access")
	public ScholarshipResults UpdateScholarshipResults(ScholarshipResultsDto scholarshipResultsDto) {
		logger.info("Scholarship Results is Updated", scholarshipResultsDto.getScholarshipResultId());
		ScholarshipResults scholarshipResults = scholarshipResultsConverter.ScholarshipResultsDtoToScholarshipResultsEntity(scholarshipResultsDto);
		return scholarshipResultsService.updateSubject(scholarshipResults);

	}
}

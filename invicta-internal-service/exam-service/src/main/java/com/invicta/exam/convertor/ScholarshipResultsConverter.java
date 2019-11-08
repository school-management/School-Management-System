package com.invicta.exam.convertor;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.invicta.exam.dto.ScholarshipResultsDto;
import com.invicta.exam.entity.ScholarshipResults;

@Service
public class ScholarshipResultsConverter {

	private static Logger logger = LogManager.getLogger(ScholarshipResultsDto.class);
	
	public static ScholarshipResults ScholarshipResultsDtoToScholarshipResultsEntity(ScholarshipResultsDto scholarshipResultsDto) {
		ScholarshipResults scholarshipResults = new ScholarshipResults();
		if (scholarshipResultsDto != null) {
			logger.info("Scholarship Results Converter ----> DTO To Entity");
			scholarshipResults.setScholarshipResultId(scholarshipResultsDto.getScholarshipResultId());
			scholarshipResults.setsId(scholarshipResultsDto.getsId());
			scholarshipResults.setYear(scholarshipResultsDto.getYear());
			scholarshipResults.setIndexNo(scholarshipResultsDto.getIndexNo());
			scholarshipResults.setMarks(scholarshipResultsDto.getMarks());
			scholarshipResults.setCutOffMarks(scholarshipResultsDto.getCutOffMarks());
			scholarshipResults.setResults(scholarshipResultsDto.getResults());
			scholarshipResults.setIncomeStatus(scholarshipResultsDto.getIncomeStatus());
			return scholarshipResults;
		}
		return null;

	}
	
	public static ScholarshipResultsDto ScholarshipResultsEntityToScholarshipResultsDto(ScholarshipResults scholarshipResults) {
		ScholarshipResultsDto scholarshipResultsDto = new ScholarshipResultsDto();
		if (scholarshipResults != null) {
			logger.info("Scholarship Results Converter ----> Entity To DTO ");
			scholarshipResultsDto.setScholarshipResultId(scholarshipResults.getScholarshipResultId());
			scholarshipResultsDto.setsId(scholarshipResults.getsId());
			scholarshipResultsDto.setYear(scholarshipResults.getYear());
			scholarshipResultsDto.setIndexNo(scholarshipResults.getIndexNo());
			scholarshipResultsDto.setMarks(scholarshipResults.getMarks());
			scholarshipResultsDto.setCutOffMarks(scholarshipResults.getCutOffMarks());
			scholarshipResultsDto.setResults(scholarshipResults.getResults());
			scholarshipResultsDto.setIncomeStatus(scholarshipResults.getIncomeStatus());
			return scholarshipResultsDto;
		}
		return null;

	}
	
	public static List<ScholarshipResultsDto> ScholarshipResultsEntityToScholarshipResultsDtoforList(List<ScholarshipResults> scholarshipResultsList){
		if(scholarshipResultsList !=null) {
			logger.info("Scholarship Results To DTO Converter for List");
			List<ScholarshipResultsDto> listScholarshipResultsDto = new ArrayList<>();
			for(ScholarshipResults scholarshipResults : scholarshipResultsList) {
				ScholarshipResultsDto scholarshipResultsDto = new ScholarshipResultsDto();
				scholarshipResultsDto.setScholarshipResultId(scholarshipResults.getScholarshipResultId());
				scholarshipResultsDto.setsId(scholarshipResults.getsId());
				scholarshipResultsDto.setYear(scholarshipResults.getYear());
				scholarshipResultsDto.setIndexNo(scholarshipResults.getIndexNo());
				scholarshipResultsDto.setMarks(scholarshipResults.getMarks());
				scholarshipResultsDto.setCutOffMarks(scholarshipResults.getCutOffMarks());
				scholarshipResultsDto.setResults(scholarshipResults.getResults());
				scholarshipResultsDto.setIncomeStatus(scholarshipResults.getIncomeStatus());
				listScholarshipResultsDto.add(scholarshipResultsDto);
			}
			return listScholarshipResultsDto;
		}
		return null;
	}
}

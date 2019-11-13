package com.invicta.exam.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.invicta.exam.dto.ScholarshipResultsDto;
import com.invicta.exam.entity.ScholarshipResults;
import com.invicta.exam.entity.ScholarshipResultsWithStudent;
import com.invicta.exam.entity.Student;
import com.invicta.exam.mapper.ScholarshipResultsMapper;
import com.invicta.exam.service.ScholarshipResultsService;

@RestController
@RequestMapping("/scholarshipresult")
public class ScholarshipResultsController {

	
	@Autowired
	private ScholarshipResultsMapper scholarshipResultsMapper;
	
	@Autowired
	private ScholarshipResultsService scholarshipResultsService;

	private static Logger logger = LogManager.getLogger(ScholarshipResultsMapper.class);
	
	@PostMapping("/scholarshipresults")
	public ScholarshipResults saveSelectionSubject(@RequestBody ScholarshipResultsDto scholarshipResultsDto) {
		try {
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<Student> response = restTemplate.exchange(
					"http://localhost:8083/memberservice/student/getonestudent/" + scholarshipResultsDto.getsId(), HttpMethod.GET,
					null, new ParameterizedTypeReference<Student>() {
					});
			System.out.println("gggggggggggggggggggg" + response.hasBody());
			if (response.hasBody()) {
				return scholarshipResultsMapper.saveScholarshipResults(scholarshipResultsDto);
			}
		} catch (Exception e) {
			logger.info("Scholarship Result Controller -> New Scholarship Result Created succesfully", e.getMessage());
		}
		return null;
	}
	
	@GetMapping("/scholarshipresults")
	public List<ScholarshipResultsWithStudent> getAllSchorlashipResults() {
		try {
			RestTemplate restTemplate = new RestTemplate();
			List<ScholarshipResults> schList = scholarshipResultsService.getAllScholarshipResultId();
			int length = schList.size();
			List<ScholarshipResultsWithStudent> retrivedScholarshipResults = new ArrayList<ScholarshipResultsWithStudent>();
			for (int i = 0; i < length; i++) {
				ScholarshipResultsWithStudent scholarshipList = new ScholarshipResultsWithStudent();
				Long scholarshipResultsId = Long.parseLong(String.valueOf(schList.get(i)));
				ScholarshipResults scholarshipResults = scholarshipResultsService.getByScholarshipResultId(scholarshipResultsId);
				
				scholarshipList.setScholarshipResultId(scholarshipResults.getScholarshipResultId());
				scholarshipList.setsId(scholarshipResults.getsId());
				scholarshipList.setYear(scholarshipResults.getYear());
				scholarshipList.setIndexNo(scholarshipResults.getIndexNo());
				scholarshipList.setMarks(scholarshipResults.getMarks());
				scholarshipList.setCutOffMarks(scholarshipResults.getCutOffMarks());
				scholarshipList.setResults(scholarshipResults.getResults());
				scholarshipList.setIncomeStatus(scholarshipResults.getIncomeStatus());

				ResponseEntity<Student> response = restTemplate.exchange(
						"http://localhost:8083/memberservice/student/getonestudent/" + scholarshipResults.getsId(),
						HttpMethod.GET, null, new ParameterizedTypeReference<Student>() {
						});

				Student student = response.getBody();
				//scholarshipList.setsId(student.getsId());
				scholarshipList.setStudentObj(student);
				retrivedScholarshipResults.add(scholarshipList);
				
				System.out.println(
						"StudentId" + scholarshipList.getStudentObj().getFirstname() + response.hasBody());

			}
			return retrivedScholarshipResults;
		} catch (Exception e) {
			logger.info("Scholarship Result Controller -> getAllScholarshipResults", e.getMessage());
		}
		return null;
	}
	
	@GetMapping("scholarshipresults/{scholarshipResultId}")
	public ScholarshipResultsWithStudent getScholarshipResultById(
			@PathVariable(name = "scholarshipResultId") Long scholarshipResultId) {
		try {
			ScholarshipResultsWithStudent scholarshpList = new ScholarshipResultsWithStudent();
			ScholarshipResults scholarshipResults = scholarshipResultsService.getByScholarshipResultId(scholarshipResultId);

			scholarshpList.setScholarshipResultId(scholarshipResults.getScholarshipResultId());
			scholarshpList.setsId(scholarshipResults.getsId());
			scholarshpList.setYear(scholarshipResults.getYear());
			scholarshpList.setIndexNo(scholarshipResults.getIndexNo());
			scholarshpList.setCutOffMarks(scholarshipResults.getCutOffMarks());
			scholarshpList.setMarks(scholarshipResults.getMarks());
			scholarshpList.setResults(scholarshipResults.getResults());
			scholarshpList.setIncomeStatus(scholarshipResults.getIncomeStatus());

			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<Student> response = restTemplate.exchange(
					"http://localhost:8083/memberservice/student/getonestudent/" + scholarshpList.getsId(),
					HttpMethod.GET, null, new ParameterizedTypeReference<Student>() {
					});

			Student student = response.getBody();
			// selectionSubjectList.setGradeId(grade.getGradeId());
			scholarshpList.setStudentObj(student);
			return scholarshpList;
		} catch (Exception e) {
			logger.info("Scholarship Results Controller -> getByScholarshipResultId", e.getMessage());
		}
		return null;
	}
	
	@DeleteMapping("scholarshipresults/{scholarshipResultId}")
	public ResponseEntity<String> deleteScholarshipResultById(@PathVariable Long scholarshipResultId) {
		try {
			if (scholarshipResultsMapper.getByScholarshipResultsId(scholarshipResultId) != null) {
				if (scholarshipResultsMapper.deleteScholarshipResultsById(scholarshipResultId) == null) {
					logger.info("Scholarship Result Controller -> Scholarship Result Deleted Successfully");
					return new ResponseEntity<>("Scholarship Result Sucessfully deleted", HttpStatus.OK);
				}
			} else {
				logger.info("Scholarship Result Controller -> Scholarship Result Id Not Found");
				return new ResponseEntity<>("Scholarship Result Id Not FOUND!!!", HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			logger.error("Scholarship Result Controller -> Scholarship Result Deleted Failed!!!");
			return new ResponseEntity<>("Delete FAILED!!!", HttpStatus.BAD_REQUEST);
		}
		return null;

	}

	@PutMapping("scholarshipresults/{scholarshipResultId}")
	public ResponseEntity<String> updateScholarshipResult(@RequestBody ScholarshipResultsDto scholarshipResultsDto) {
		try {
			logger.info("Scholarship Results Controller :-> Update");
			if (scholarshipResultsMapper.UpdateScholarshipResults(scholarshipResultsDto) != null) {
				return new ResponseEntity<>("Successfully Updated", HttpStatus.OK);
			}
			return new ResponseEntity<>("Failed To Update", HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Scholarship Results Controller :-> Error" + ex.getMessage());
		}

		return null;
	}
}

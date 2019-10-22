package com.invicta.exam.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import com.invicta.exam.dto.SubjectOneDto;
//import com.invicta.exam.entity.Student;
import com.invicta.exam.entity.SubjectOneList;
import com.invicta.exam.entity.Grade;
import com.invicta.exam.entity.SubjectOne;
import com.invicta.exam.mapper.SubjectOneDtoMapper;
import com.invicta.exam.service.SubjectOneService;

@RestController
//@RequestMapping("/Api/")
public class SubjectOneController {

	@Autowired
	private SubjectOneDtoMapper subject1To8DtoMapper;

	@Autowired
	private SubjectOneService subjectOneService;

	private static Logger logger = LogManager.getLogger(SubjectOneDtoMapper.class);

	@PostMapping("/subjects")
	public SubjectOne saveSubject(@RequestBody SubjectOneDto subject1To8Dto) {
		try {
			return subject1To8DtoMapper.saveSubjects(subject1To8Dto);
		} catch (Exception e) {
			logger.info("Subject8 Controller -> New Subject Created succesfully", e.getMessage());
		}

		return null;
	}

	@GetMapping("/subjects")
	public ResponseEntity<List<SubjectOneDto>> getAllSubjects() {
		try {
			return new ResponseEntity<>(subject1To8DtoMapper.getAllSubjects(), HttpStatus.OK);
		} catch (Exception e) {
			logger.info("Subject8 Controller -> GetAllSubjects", e.getMessage());
		}
		return null;

	}

	@GetMapping("subjects/{subjectId}")
	public ResponseEntity<SubjectOneDto> getSubjectbyId(@PathVariable Long subjectId) {
		try {
			return new ResponseEntity<>(subject1To8DtoMapper.getBySubjectId(subjectId), HttpStatus.OK);
		} catch (Exception e) {
			logger.info("Subject8 Controller -> GetSubjectById", e.getMessage());
		}
		return null;

	}

	@DeleteMapping("subjects/{subjectId}")
	public ResponseEntity<String> deleteSubjectsById(@PathVariable Long subjectId) {
		try {
			if (subject1To8DtoMapper.getBySubjectId(subjectId) != null) {
				if (subject1To8DtoMapper.deleteSubjectById(subjectId) == null) {
					logger.info("Subject8 Controller -> Subject Deleted Successfully");
					return new ResponseEntity<>("Subject Sucessfully deleted", HttpStatus.OK);
				}
			} else {
				logger.info("Subject8 Controller -> Student Id Not Found");
				return new ResponseEntity<>("Subject Id Not FOUND!!!", HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			logger.error("Subject8 Controller -> Subject8 Deleted Failed!!!");
			return new ResponseEntity<>("Delete FAILED!!!", HttpStatus.BAD_REQUEST);
		}
		return null;

	}

	@PutMapping("subjects/{subjectId}")
	public ResponseEntity<String> updateStudent(@RequestBody SubjectOneDto subject1To8Dto) {
		try {
			logger.info("Subject8 Controller :-> Update");
			if (subject1To8DtoMapper.UpdateSubjects(subject1To8Dto) != null) {
				return new ResponseEntity<>("Successfully Updated", HttpStatus.OK);
			}
			return new ResponseEntity<>("Failed To Update", HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Subject8 Controller :-> Error" + ex.getMessage());
		}

		return null;
	}

	@GetMapping("subjectObject/{subjectId}")
	public SubjectOneList getSubjectObjectUsingSubjectId(@PathVariable("subjectId") Long subjectId) {
		SubjectOneList subjectOneList = new SubjectOneList();
		SubjectOne subjectOne = subjectOneService.getBySubjectId(subjectId);
		
		subjectOneList.setSubjectId(subjectOne.getSubjectId());
		subjectOneList.setSubjectName(subjectOne.getSubjectName());
		subjectOneList.setGradeId(subjectOne.getGradeId());
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Grade> response = restTemplate.exchange("http://localhost:8083/member/grade/"+subjectOne.getSubjectId(), 
				HttpMethod.GET, null, new ParameterizedTypeReference<Grade>() {});
		
		Grade grade = response.getBody();
		//subjectOneList.setGradeName(grade.getGradeName());
		return subjectOneList;
		
	}

	
	
	@GetMapping("/GetAllSubjectsList")
	public List<SubjectOneList> getAllSubjectsUsingRestTemplate(){
		//try {
			RestTemplate restTemplate = new RestTemplate();
			List<SubjectOne> subList = subjectOneService.getAllSubjects();
			int length = subList.size();
			System.out.println(length);
			List<SubjectOneList> retrivedSubjects = new ArrayList<SubjectOneList>();
			for (int i = 0; i < length; i++) {
				SubjectOneList subjectsList = new SubjectOneList();
				System.out.println("hii da new idea");
				System.out.println(subList.get(i));
				Long subjectId =Long.parseLong(String.valueOf(subList.get(i)));
				SubjectOne subjectOne = subjectOneService.getBySubjectId(subjectId);
				
				subjectsList.setSubjectId(subjectOne.getSubjectId());
				subjectsList.setSubjectName(subjectOne.getSubjectName());
				subjectsList.setGradeId(subjectOne.getGradeId());
				System.out.println(subjectsList);
				ResponseEntity<Grade> response = restTemplate.exchange("http://localhost:8083/member/grade/", 
						HttpMethod.GET, null, new ParameterizedTypeReference<Grade>() {});
				
				Grade grade = response.getBody();
				subjectsList.setGradeObj(grade);
				retrivedSubjects.add(subjectsList);
			}
			return retrivedSubjects;
//		} catch (Exception e) {
//			logger.error("Subject Controller :--> error" + e.getMessage());
//		}
	}

}

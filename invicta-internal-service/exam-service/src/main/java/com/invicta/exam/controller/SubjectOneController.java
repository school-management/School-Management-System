package com.invicta.exam.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
<<<<<<< HEAD
	public  ResponseEntity<String> saveSubject(@RequestBody SubjectOne subject1To8) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Student> response = restTemplate.exchange(
				"http://localhost:8083/member/getonestudent/" + subject1To8.getSubjectId(),
				HttpMethod.GET, null, new ParameterizedTypeReference<Student>() {
				});
		if(response != null) {
			subjectOneService.createSubject(subject1To8);
=======
	public SubjectOne saveSubject(@RequestBody SubjectOneDto subject1To8Dto) {
		try {
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<Grade> response = restTemplate.exchange(
					"http://localhost:8083/member/grade/" + subject1To8Dto.getGradeId(), HttpMethod.GET, null,
					new ParameterizedTypeReference<Grade>() {
					});
			System.out.println("gggggggggggggggggggg"+response.hasBody());
			if(response.hasBody()) {
				return	subject1To8DtoMapper.saveSubjects(subject1To8Dto);
			}
		
//			return subject1To8DtoMapper.saveSubjects(subject1To8Dto);
		} catch (Exception e) {
			logger.info("Subject8 Controller -> New Subject Created succesfully", e.getMessage());
>>>>>>> aeb3b123ea345ab321014a602c063654eac9d1ff
		}
		return null;

	}
	
	@GetMapping("subjects/{subjectId}")
	public SubjectOneList getSubjectObjectUsingSubjectId(@PathVariable("subjectId") Long subjectId) {
		SubjectOneList subjectOneList = new SubjectOneList();
		SubjectOne subjectOne = subjectOneService.getBySubjectId(subjectId);

		subjectOneList.setSubjectId(subjectOne.getSubjectId());
		subjectOneList.setSubjectName(subjectOne.getSubjectName());
		subjectOneList.setGradeId(subjectOne.getGradeId());

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Grade> response = restTemplate.exchange(
				"http://localhost:8083/member/grade/" + subjectOneList.getGradeId(), HttpMethod.GET, null,
				new ParameterizedTypeReference<Grade>() {
				});

		Grade grade = response.getBody();
		subjectOneList.setGradeId(grade.getGradeId());
		subjectOneList.setGradeObj(grade);
		return subjectOneList;

	}

	@GetMapping("/subjects")
	public List<SubjectOneList> getAllSubClassList() {
		RestTemplate restTemplate = new RestTemplate();
		List<SubjectOne> subList = subjectOneService.getsubjectById();
		int length = subList.size();
		List<SubjectOneList> retrivedSubjects = new ArrayList<SubjectOneList>();
		for (int i = 0; i < length; i++) {
			SubjectOneList subjectsList = new SubjectOneList();
			Long subjectId = Long.parseLong(String.valueOf(subList.get(i)));
			SubjectOne subjectOne = subjectOneService.getBySubjectId(subjectId);

			subjectsList.setSubjectId(subjectOne.getSubjectId());
			subjectsList.setSubjectName(subjectOne.getSubjectName());
			subjectsList.setGradeId(subjectOne.getGradeId());
			ResponseEntity<Grade> response = restTemplate.exchange(
					"http://localhost:8083/member/grade/" + subjectOne.getGradeId(), HttpMethod.GET, null,
					new ParameterizedTypeReference<Grade>() {
					});

			Grade grade = response.getBody();
			subjectsList.setGradeObj(grade);
			retrivedSubjects.add(subjectsList);
			
			System.out.println("gggggggggggggggggggg"+subjectsList.getSubjectName()+response.hasBody());
			
			
//			SubjectOne sub=new SubjectOne();
//			sub.setSubjectId(subjectsList.getSubjectId());
//			sub.setSubjectName(subjectsList.getSubjectName());
//			sub.setGradeId(subjectsList.getGradeId());
//			
//			subjectOneService.createSubject(sub);
			
			
			
		}
		return retrivedSubjects;
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
<<<<<<< HEAD
	}	
	
	@SuppressWarnings("unused")
	@RequestMapping("subjectObj/{subjectId}")
	public SubjectList getResourceAllocationObj(@PathVariable("subjectId") Long subjectId) {
		SubjectList resourceAllocationList = new SubjectList();
		SubjectOne resourceAllocation = subjectOneService.getBySubjectId(subjectId);
	
		resourceAllocationList.setSubjectId(resourceAllocation.getSubjectId());
		resourceAllocationList.setSubjectName(resourceAllocation.getSubjectName());
		resourceAllocationList.setsId(resourceAllocation.getsId());
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Student> response = restTemplate.exchange(
				"http://localhost:8083/member/getonestudent/" + resourceAllocation.getSubjectId(),
				HttpMethod.GET, null, new ParameterizedTypeReference<Student>() {
				});

		Student employee = response.getBody();
//		resourceAllocationList.setGradeId(employee.getGradeId());
//		resourceAllocationList.setGradeName(employee.getGradeName());
//		resourceAllocationList.setDivisionId(employee.getDivisionId());
//		resourceAllocationList.setDivisionName(employee.getDivisionName());
//		resourceAllocationList.setFirstname(employee.getFirstname());
//		resourceAllocationList.setMiddlename(employee.getMiddlename());
//		resourceAllocationList.setLastname(employee.getLastname());
//		resourceAllocationList.setStuId(employee.getStuId());
		return resourceAllocationList;

	}
	
		
		
		@RequestMapping("SubjectListObj/{subjectId}")
		public SubjectList getsubjectObj(@PathVariable("subjectId") Long subjectId) {
			SubjectList subClassificationList = new SubjectList();
			SubjectOneDto subClassification = subject1To8DtoMapper.getBySubjectId(subjectId);
		
			subClassificationList.setSubjectId(subClassification.getSubjectId());
			subClassificationList.setSubjectName(subClassification.getSubjectName());
			subClassificationList.setsId(subClassification.getsId());

			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<Student> response = restTemplate.exchange(
					"http://localhost:8083/member/getonestudent/" + subClassification.getsId(),
					HttpMethod.GET, null, new ParameterizedTypeReference<Student>() {
					});

			Student mainClass = response.getBody();
			subClassificationList.setStudentobj(mainClass);
			return subClassificationList;
		}
		
		
		@GetMapping("/GetAllSubjectList")
		public List<SubjectList> getAllSubClassList() {
			RestTemplate restTemplate = new RestTemplate();
			List<SubjectOne> subClassList = subjectOneService.getAllsubjectId();
			int length = subClassList.size();
			System.out.println(length);
			
			
			List<SubjectList> retrievedSubClass = new ArrayList<SubjectList>();
			for (int i = 0; i < length; i++) {
				SubjectList subClassificationList = new SubjectList();
				Long subjectId = Long.parseLong(String.valueOf(subClassList.get(i)));
				SubjectOne subClassification = subjectOneService.getBySubjectId(subjectId);
			
				subClassificationList.setSubjectId(subClassification.getSubjectId());
				subClassificationList.setSubjectName(subClassification.getSubjectName());
				subClassificationList.setsId(subClassification.getsId()); 
				ResponseEntity<Student> response = restTemplate.exchange(
						"http://localhost:8083/member/getonestudent/"
								+ subClassification.getsId(),
						HttpMethod.GET, null, new ParameterizedTypeReference<Student>() {
						});
				Student mainClass = response.getBody();
				subClassificationList.setStudentobj(mainClass);
				retrievedSubClass.add(subClassificationList);
			}
			return retrievedSubClass;
		}
		
=======
	}


>>>>>>> aeb3b123ea345ab321014a602c063654eac9d1ff

}



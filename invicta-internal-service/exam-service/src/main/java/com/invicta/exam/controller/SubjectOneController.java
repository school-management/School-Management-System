package com.invicta.exam.controller;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpMethod;
import com.invicta.exam.dto.SubjectOneDto;
import com.invicta.exam.entity.Student;
import com.invicta.exam.entity.SubjectList;
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
	public SubjectOne saveSubject(@RequestBody SubjectOne subject1To8) {
		try {
//			return subject1To8DtoMapper.saveSubjects(subject1To8Dto);
			return subjectOneService.createSubject(subject1To8);
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
			} 
			else {
				logger.info("Subject8 Controller -> Student Id Not Found");
				return new ResponseEntity<>("Subject Id Not FOUND!!!", HttpStatus.BAD_REQUEST);
			}
		}
		catch (Exception e) {
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
		
		
		
//		@PostMapping("/SaveSubjectTable")
//		public ResponseEntity<Void> saveSubjectTable(@RequestBody List<SubjectOne> subjectOne) {
//			subjectOneService.createSubject(subject1To8)
//			return new ResponseEntity<Void>(HttpStatus.OK);
//		}

}

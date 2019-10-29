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

import com.invicta.exam.dto.SubjectDto;
import com.invicta.exam.entity.Grade;
import com.invicta.exam.entity.Subject;
import com.invicta.exam.entity.SubjectListWithGrade;
import com.invicta.exam.mapper.SubjectMapper;
import com.invicta.exam.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {

	@Autowired
	private SubjectMapper subjectMapper;

	@Autowired
	private SubjectService subjectService;

	private static Logger logger = LogManager.getLogger(SubjectMapper.class);

	@PostMapping("/subjects")
	public Subject saveSelectionSubject(@RequestBody SubjectDto subjectDto) {
		try {
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<Grade> response = restTemplate.exchange(
					"http://localhost:8083/memberservice/grade/grades/" + subjectDto.getGradeId(), HttpMethod.GET,
					null, new ParameterizedTypeReference<Grade>() {
					});
			System.out.println("gggggggggggggggggggg" + response.hasBody());
			if (response.hasBody()) {
				return subjectMapper.saveSubjects(subjectDto);
			}
		} catch (Exception e) {
			logger.info("Subject Controller -> New Subject Created succesfully", e.getMessage());
		}
		return null;
	}

	@GetMapping("/subjects")
	public List<SubjectListWithGrade> getAllSelectionSubjects() {
		try {
			RestTemplate restTemplate = new RestTemplate();
			List<Subject> subList = subjectService.getAllSubjectId();
			int length = subList.size();
			List<SubjectListWithGrade> retrivedSubjects = new ArrayList<SubjectListWithGrade>();
			for (int i = 0; i < length; i++) {
				SubjectListWithGrade subjectsList = new SubjectListWithGrade();
				Long subjectId = Long.parseLong(String.valueOf(subList.get(i)));
				Subject subject = subjectService.getBySubjectId(subjectId);

				subjectsList.setSubjectId(subject.getSubjectId());
				subjectsList.setSubjectName(subject.getSubjectName());
				subjectsList.setCategory(subject.getCategory());
				subjectsList.setGradeId(subject.getGradeId());

				ResponseEntity<Grade> response = restTemplate.exchange(
						"http://localhost:8083/memberservice/grade/grades/" + subject.getGradeId(),
						HttpMethod.GET, null, new ParameterizedTypeReference<Grade>() {
						});

				Grade grade = response.getBody();
				//subjectsList.setGradeId(grade.getGradeId());
				subjectsList.setGradeObj(grade);
				retrivedSubjects.add(subjectsList);

				System.out.println(
						"SubjectName" + subjectsList.getSubjectName() + response.hasBody());

			}
			return retrivedSubjects;
		} catch (Exception e) {
			logger.info("Subject Controller -> getAllSubjects", e.getMessage());
		}
		return null;
	}

	@GetMapping("subjects/{subjectId}")
	public SubjectListWithGrade getSubjectById(
			@PathVariable(name = "subjectId") Long subjectId) {
		try {
			SubjectListWithGrade subjectList = new SubjectListWithGrade();
			Subject subject = subjectService.getBySubjectId(subjectId);

			subjectList.setSubjectId(subject.getSubjectId());
			subjectList.setSubjectName(subject.getSubjectName());
			subjectList.setCategory(subject.getCategory());
			subjectList.setGradeId(subject.getGradeId());

			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<Grade> response = restTemplate.exchange(
					"http://localhost:8083/memberservice/grade/grades/" + subjectList.getGradeId(),
					HttpMethod.GET, null, new ParameterizedTypeReference<Grade>() {
					});

			Grade grade = response.getBody();
			// selectionSubjectList.setGradeId(grade.getGradeId());
			subjectList.setGradeObj(grade);
			return subjectList;
		} catch (Exception e) {
			logger.info("Subject Controller -> getBySubjectId", e.getMessage());
		}
		return null;
	}

	@DeleteMapping("subjects/{subjectId}")
	public ResponseEntity<String> deleteSelectionSubjectsById(@PathVariable Long subjectId) {
		try {
			if (subjectMapper.getBySubjectId(subjectId) != null) {
				if (subjectMapper.deleteSubjectById(subjectId) == null) {
					logger.info("Subject Controller -> Subject Deleted Successfully");
					return new ResponseEntity<>("Subject Sucessfully deleted", HttpStatus.OK);
				}
			} else {
				logger.info("Subject Controller -> Subject Id Not Found");
				return new ResponseEntity<>("Subject Id Not FOUND!!!", HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			logger.error("Subject Controller -> Subject Deleted Failed!!!");
			return new ResponseEntity<>("Delete FAILED!!!", HttpStatus.BAD_REQUEST);
		}
		return null;

	}

	@PutMapping("subjects/{subjectId}")
	public ResponseEntity<String> updateSubject(@RequestBody SubjectDto subjectDto) {
		try {
			logger.info("Subject Controller :-> Update");
			if (subjectMapper.UpdateSubjects(subjectDto) != null) {
				return new ResponseEntity<>("Successfully Updated", HttpStatus.OK);
			}
			return new ResponseEntity<>("Failed To Update", HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Selection Subject Controller :-> Error" + ex.getMessage());
		}

		return null;
	}
}

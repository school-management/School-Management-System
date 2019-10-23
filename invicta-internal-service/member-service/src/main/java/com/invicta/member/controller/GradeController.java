package com.invicta.member.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invicta.member.dto.GradeDto;
import com.invicta.member.entity.Grade;
import com.invicta.member.mapper.GradeMapper;

@RestController
@RequestMapping("/api/")
public class GradeController {
	
	@Autowired
	private GradeMapper gradeMapper;

	
	private static Logger logger = LogManager.getLogger(GradeMapper.class);
	
	@PostMapping("/gradesave")
	public Grade savedGrade(@RequestBody GradeDto gradeDto) {
		try {
			return gradeMapper.saveGrade(gradeDto);
		}catch(Exception e) {
			logger.info("Grade Controller -> New Grade Create succesfully",e.getMessage());
		}
		return null;
	}
	@GetMapping("/grade")
	public List<GradeDto> getGrade(){
		logger.info("Grade Controller ->  Grade listviewed ");
		return gradeMapper.listGrade();
		
	}
	
	@GetMapping("grade/{gradeId}")
	public GradeDto getGradeById(@PathVariable(name="gradeId") Long gradeId) {
		return gradeMapper.getGradeById(gradeId);
	}
	
	@DeleteMapping("/grade/{gradeId}")
	public ResponseEntity<String> deleteGrade(@PathVariable("gradeId") Long gradeId){
		if(gradeMapper.getGradeById(gradeId)!=null) {
			if(gradeMapper.deleteGrade(gradeId)==null) {
				return new ResponseEntity<>("successfully deleted",HttpStatus.OK);
			}else {
				return new ResponseEntity<String>("not deleted",HttpStatus.BAD_REQUEST);
			}
		}
		return new ResponseEntity<>("faild",HttpStatus.BAD_REQUEST);
		
	}
	

}


//@Autowired
//private RestTemplate restTemplate;

//Api for microservice connection
//@GetMapping("/saveGrade")
//public ResponseEntity<List<?>> getAllGrade() throws JsonParseException, JsonMappingException, IOException{
//		try {
//		
//		String url = "http://localhost:8083/member/grade";
//		String resp = restTemplate.getForObject(url, String.class);
//
//		System.out.println("resp" + resp);
//
//		ObjectMapper objectMapper = new ObjectMapper();
//		List<GradeDto> list = objectMapper.readValue(resp,
//				new TypeReference<List<GradeDto>>() {
//				});
//		System.out.println("list " + list);
//		
//		for (GradeDto entry : list) {
//			
//			Grade grade = new Grade();
//			grade.setGradeId(entry.getGradeId());
//			grade.setGradeName(entry.getGradeName());
//	
//					
//			System.out.println("gradeList " + grade);
//
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<Grade> entity = new HttpEntity<Grade>(grade, headers);
//		System.out.println("yes");
//		ResponseEntity<?> obj = restTemplate.exchange("http://localhost:8084/exam/subjects",
//				HttpMethod.POST, entity, Grade.class);
//
//		System.out.println("obj" + obj);
//		
//	}
//		return null;
//	} catch (Exception ex) {
//		logger.error("Check Your Error");
//		System.out.println("Something went Wrong" + ex.getCause());
//	}
//	return null;
//}
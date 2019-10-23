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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.invicta.member.dto.ParentDto;
import com.invicta.member.entity.Parent;
import com.invicta.member.mapper.ParentDtoMapper;
import com.invicta.member.repository.ParentRepository;

@RestController
@RequestMapping("/api/")
public class ParentController {

	@Autowired
	private ParentDtoMapper parentDtoMapper;

	@SuppressWarnings("unused")
	@Autowired
	private ParentRepository parentRepository;

	private static Logger logger = LogManager.getLogger(ParentDtoMapper.class);

	@PostMapping("/saveparent")
	public Parent savedparent(@RequestBody ParentDto parentDto) {
		try {
			return parentDtoMapper.saveParent(parentDto);
		} catch (Exception e) {
			logger.info("Parent Controller -> New Parent Created succesfully", e.getMessage());
		}

		return null;
	}

	@GetMapping("/GetAllParent")
	public ResponseEntity<List<ParentDto>> getAllParent() {
		try {
			return new ResponseEntity<>(parentDtoMapper.getAllParent(), HttpStatus.OK);
		} catch (Exception e) {
			logger.info("Parent Controller -> GetAllParents", e.getMessage());
		}
		return null;

	}

	@GetMapping("/GetByparId{parId}")
	public ResponseEntity<ParentDto> getParentById(@PathVariable Long parId) {
		try {
			return new ResponseEntity<>(parentDtoMapper.getByparentId(parId), HttpStatus.OK);
		} catch (Exception e) {
			logger.info("Parent Controller -> GetParentsById", e.getMessage());
		}
		return null;

	}

	@DeleteMapping("/DeleteByparId{parId}")
	public ResponseEntity<String> deleteParentparId(@PathVariable Long parId) {
		if (parentDtoMapper.getByparentId(parId) != null) {
			if (parentDtoMapper.deleteParentById(parId) == null) {
				logger.info("Parent Controller --> Parent Deleted Successful");
				return new ResponseEntity<>("Parent Successfull Deleted", HttpStatus.OK);
			}
		} else {
				logger.info("Parent Controller --> Parent Id Not Found");
				return new ResponseEntity<>("Parent Id Not Found!", HttpStatus.BAD_REQUEST);
			}
		logger.info("Parent Controller --> Parent Id Not Found");
		return new ResponseEntity<>("Parent Id Not Found!", HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("/update{parId}")
	public ResponseEntity<String> updateParent(@RequestBody ParentDto parentDto) {
		try {
			logger.info("Parent Controller --> Update");
			if (parentDtoMapper.UpdateParent(parentDto) != null) {
				return new ResponseEntity<>("Successfully updated", HttpStatus.OK);
			}
			return new ResponseEntity<>("Failed To Update", HttpStatus.OK);
		} catch (Exception ex) {
		logger.error("Parent Controller : --> Error" + ex.getMessage());
		}
		return null;
	}
	
	@GetMapping("/FatherName/{fathername}")
	public List<ParentDto> getByFathername(@PathVariable(name = "fathername") String fathername) {
		try {
			return parentDtoMapper.getParentByfathername(fathername);
		} catch (Exception e) {
			logger.error("Parent Controller: --> Error" + e.getMessage());
		}
		return null;
	}
	
	@GetMapping("/MotherName/{mothername}")
	public List<ParentDto> getByMothername(@PathVariable(name = "mothername") String mothername) {
		try {
			return parentDtoMapper.getParentBymothername(mothername);
		} catch (Exception e) {
			logger.error("Parent Controller: --> Error" + e.getMessage());
		}
		return null;
	}
	
	@GetMapping("/GuardianName/{guardianname}")
	public List<ParentDto> getByGuardianname(@PathVariable(name = "guardianname") String guardianname) {
		try {
			return parentDtoMapper.getParentByGuardianName(guardianname);
		} catch (Exception e) {
			logger.error("Parent Controller: --> Error" + e.getMessage());
		}
		return null;
	}
}

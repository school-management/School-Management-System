package com.invicta.exam.controller;

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

import com.invicta.exam.dto.SelectionSubjectDto;
import com.invicta.exam.entity.SelectionSubject;
import com.invicta.exam.mapper.SelectionSubjectMapper;

@RestController
@RequestMapping("Api/")
public class SelectionSubjectController {

	@Autowired
	private SelectionSubjectMapper selectionSubjectMapper;

	private static Logger logger = LogManager.getLogger(SelectionSubjectMapper.class);

	@PostMapping("/selectionsubjects")
	public SelectionSubject saveSelectionSubject(@RequestBody SelectionSubjectDto selectionSubjectDto) {
		try {
				return	selectionSubjectMapper.saveSelectionSubjects(selectionSubjectDto);
		} catch (Exception e) {
			logger.info("Selection Subject Controller -> New Selection Subject Created succesfully", e.getMessage());
		}

		return null;
	}
	
	@GetMapping("/selectionsubjects")
	public ResponseEntity<List<SelectionSubjectDto>> getAllSelectionSubjects() {
		try {
			return new ResponseEntity<>(selectionSubjectMapper.getAllSelectionSubjects(), HttpStatus.OK);
		} catch (Exception e) {
			logger.info("Selection Subject Controller -> GetALL", e.getMessage());
		}
		return null;
	}

	@GetMapping("selectionsubjects/{selectionSubjectId}")
	public ResponseEntity<SelectionSubjectDto> getBystaffId(@PathVariable(name = "selectionSubjectId") Long selectionSubjectId) {
		try {
			return new ResponseEntity<>(selectionSubjectMapper.getBySelectionSubjectId(selectionSubjectId), HttpStatus.OK);
		} catch (Exception e) {
			logger.info("Selection Subject Controller -> getBySelectionSubjectId", e.getMessage());
		}
		return null;
	}

	@DeleteMapping("selectionsubjects/{selectionSubjectId}")
	public ResponseEntity<String> deleteSelectionSubjectsById(@PathVariable Long selectionSubjectId) {
		try {
			if (selectionSubjectMapper.getBySelectionSubjectId(selectionSubjectId)!= null) {
				if (selectionSubjectMapper.deleteSelectionSubjectById(selectionSubjectId)== null) {
					logger.info("Selection Subject Controller -> Selection Subject Deleted Successfully");
					return new ResponseEntity<>("Selection Subject Sucessfully deleted", HttpStatus.OK);
				}
			} else {
				logger.info("Selection Subject Controller -> Selection Subject Id Not Found");
				return new ResponseEntity<>("Subject Id Not FOUND!!!", HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			logger.error("Selection Subject Controller -> Selection Subject Deleted Failed!!!");
			return new ResponseEntity<>("Delete FAILED!!!", HttpStatus.BAD_REQUEST);
		}
		return null;

	}

	@PutMapping("selectionsubjects/{selectionSubjectId}")
	public ResponseEntity<String> updateSelectionSubject(@RequestBody SelectionSubjectDto selectionSubjectDto) {
		try {
			logger.info("Selection Subject Controller :-> Update");
			if (selectionSubjectMapper.UpdateSelectionSubjects(selectionSubjectDto)!= null) {
				return new ResponseEntity<>("Successfully Updated", HttpStatus.OK);
			}
			return new ResponseEntity<>("Failed To Update", HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Selection Subject Controller :-> Error" + ex.getMessage());
		}

		return null;
	}
}

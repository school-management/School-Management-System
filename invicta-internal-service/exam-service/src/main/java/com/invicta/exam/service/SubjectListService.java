package com.invicta.exam.service;

import java.util.List;

import com.invicta.exam.entity.SubjectList;

public interface SubjectListService {
	
	public SubjectList findBysId(Long sId);
	public List<SubjectList> getAllresourceList();
}



package com.invicta.student.Service;

import java.util.List;

import com.invicta.student.entity.Parent;

public interface ParentService {
	
	public Parent saveParent(Parent parent);
	
	public List<Parent> getAllParent();
	
	public Parent getByParID(Long parId);
	
	public Parent updateParent(Parent parent);
	
	public Parent deleteByParId(Long parId);
	
	public List<Parent> getByFathername(String fathername);
	
	public List<Parent> getByMothername(String mothername);
	
	public List<Parent> getByGuardianname(String guardianname);
}

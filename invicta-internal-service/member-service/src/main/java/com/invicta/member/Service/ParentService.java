package com.invicta.member.Service;

import java.util.List;

import com.invicta.member.entity.Parent;

public interface ParentService {
	
	public Parent saveParent(Parent parent);
	
	public List<Parent> getAllParent();
	
	public Parent getByParID(Long parId);
	
	public Parent updateParent(Parent parent);
	
	public Parent deleteByParId(Long parId);
	
	
}

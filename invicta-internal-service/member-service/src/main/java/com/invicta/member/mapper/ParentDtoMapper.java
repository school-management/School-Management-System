package com.invicta.member.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invicta.member.Converter.ParentDtoConverter;
import com.invicta.member.ServiceImp.ParentServicelmp;
import com.invicta.member.dto.ParentDto;
import com.invicta.member.entity.Parent;

@Service
public class ParentDtoMapper {
	
	@Autowired
	private ParentDtoConverter parentDtoConverter;
	
	@Autowired
	private ParentServicelmp parentServicelmp;
	
	@SuppressWarnings("static-access")
	public Parent saveParent(ParentDto parentDto) {
		return parentServicelmp.saveParent(parentDtoConverter.ParentDtoToParent(parentDto));
		
	}
	

}

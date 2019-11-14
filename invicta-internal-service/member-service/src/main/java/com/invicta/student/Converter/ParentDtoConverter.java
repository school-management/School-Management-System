package com.invicta.student.Converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.invicta.student.dto.ParentDto;
import com.invicta.student.entity.Parent;

@Service
public class ParentDtoConverter {

	private static Logger logger = LogManager.getLogger(ParentDto.class);

	public static Parent ParentDtoToParent(ParentDto parentDto) {
		Parent parent = new Parent();
		if (parentDto != null) {
			logger.info("Parent Converter --> Dto To Entity");
//			parent.setParId(parentDto.getParId());
//			parent.setParentId(parentDto.getParentId());
//			parent.setFathername(parentDto.getFathername());
//			parent.setFatheremail(parentDto.getFatheremail());
//			parent.setFathermobile(parentDto.getFathermobile());
//			parent.setFatherOccupation(parentDto.getFatherOccupation());
//			parent.setFatheroldstudent(parentDto.isFatheroldstudent());
//			parent.setFathersofficialaddress(parentDto.getFathersofficialaddress());
//			parent.setFstudystart(parentDto.getFstudystart());
//			parent.setFstudyend(parentDto.getFstudyend());
//			parent.setMothername(parentDto.getMothername());
//			parent.setMothermaidenname(parentDto.getMothermaidenname());
//			parent.setMothermobile(parentDto.getFathermobile());
//			parent.setMotheroccupation(parentDto.getMotheroccupation());
//			parent.setMotheroldstudent(parentDto.isMotheroldstudent());
//			parent.setMotherstudystart(parentDto.getMotherstudystart());
//			parent.setMotherstudyend(parentDto.getMotherstudyend());
//			parent.setGuardian(parentDto.getGuardian());
//			parent.setGuardianname(parentDto.getGuardianname());
//			parent.setGuardianoccupation(parentDto.getGuardianoccupation());
//			parent.setGuardianmobileNo(parentDto.getGuardianmobileNo());
//			parent.setGuardianemail(parentDto.getGuardianemail());
//			parent.setSibilingsfullname(parentDto.getSibilingsfullname());
//			parent.setSibilingsGrade(parentDto.getSibilingsGrade());
//			parent.setSililingsadmission(parentDto.getSililingsadmission());
			return parent;
		}
		return null;

	}

	public static List<ParentDto> ParentToParentDto(List<Parent> parentlist) {
		
		if (parentlist != null) {
			logger.info("Parent Converter --> Entity To Dto");
			List<ParentDto> listParentDto = new ArrayList<>();
			for (Parent parent : parentlist) {
				logger.info("Parent Converter --> Parent List");
//				ParentDto parentDto = new ParentDto();
//				parentDto.setParId(parent.getParId());
//				parentDto.setParentId(parent.getParentId().toUpperCase());
//				parentDto.setFathername(parent.getFathername());
//				parentDto.setFatherOccupation(parentDto.getFatherOccupation());
//				parentDto.setFathersofficialaddress(parent.getFathersofficialaddress());
//				parentDto.setFathermobile(parent.getFathermobile());
//				parentDto.setFatheremail(parent.getFatheremail());
//				parentDto.setFatheroldstudent(parent.isFatheroldstudent());
//				parentDto.setFstudystart(parent.getFstudystart());
//				parentDto.setFstudyend(parent.getFstudyend());
//				parentDto.setMothername(parent.getMothername());
//				parentDto.setMotheroccupation(parent.getMotheroccupation());
//				parentDto.setMothermobile(parent.getMothermobile());
//				parentDto.setMotheroldstudent(parent.isMotheroldstudent());
//				parentDto.setMothermaidenname(parent.getMothermaidenname());
//				parentDto.setMotherstudystart(parent.getMotherstudystart());
//				parentDto.setMotherstudyend(parent.getMotherstudyend());
//				parentDto.setGuardian(parent.getGuardian());
//				parentDto.setGuardianname(parent.getGuardianname());
//				parentDto.setGuardianoccupation(parent.getGuardianoccupation());
//				parentDto.setGuardianmobileNo(parent.getGuardianmobileNo());
//				parentDto.setGuardianemail(parent.getGuardianemail());
//				parentDto.setSibilingsfullname(parent.getSibilingsfullname());
//				parentDto.setSibilingsGrade(parent.getSibilingsGrade());
//				parentDto.setSililingsadmission(parent.getSililingsadmission());
//				listParentDto.add(parentDto);
			}
			return listParentDto;
		}
		return null;
		
	}
	
	public static ParentDto ParentEntityToParentDto(Parent parent) {
		ParentDto parentDto = new ParentDto();
		if (parent != null) {
			logger.info("Parent Converter --> Convert object Entity To Dto");
//			parentDto.setParId(parent.getParId());
//			parentDto.setParentId(parent.getParentId().toUpperCase());
//			parentDto.setFathername(parent.getFathername());
//			parentDto.setFatherOccupation(parentDto.getFatherOccupation());
//			parentDto.setFathersofficialaddress(parent.getFathersofficialaddress());
//			parentDto.setFathermobile(parent.getFathermobile());
//			parentDto.setFatheremail(parent.getFatheremail());
//			parentDto.setFatheroldstudent(parent.isFatheroldstudent());
//			parentDto.setFstudystart(parent.getFstudystart());
//			parentDto.setFstudyend(parent.getFstudyend());
//			parentDto.setMothername(parent.getMothername());
//			parentDto.setMotheroccupation(parent.getMotheroccupation());
//			parentDto.setMothermobile(parent.getMothermobile());
//			parentDto.setMotheroldstudent(parent.isMotheroldstudent());
//			parentDto.setMothermaidenname(parent.getMothermaidenname());
//			parentDto.setMotherstudystart(parent.getMotherstudystart());
//			parentDto.setMotherstudyend(parent.getMotherstudyend());
//			parentDto.setGuardian(parent.getGuardian());
//			parentDto.setGuardianname(parent.getGuardianname());
//			parentDto.setGuardianoccupation(parent.getGuardianoccupation());
//			parentDto.setGuardianmobileNo(parent.getGuardianmobileNo());
//			parentDto.setGuardianemail(parent.getGuardianemail());
//			parentDto.setSibilingsfullname(parent.getSibilingsfullname());
//			parentDto.setSibilingsGrade(parent.getSibilingsGrade());
//			parentDto.setSililingsadmission(parent.getSililingsadmission());
		return parentDto;
		}
		return null;
	}
}

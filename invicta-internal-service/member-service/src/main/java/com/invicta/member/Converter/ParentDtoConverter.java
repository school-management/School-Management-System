package com.invicta.member.Converter;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.invicta.member.dto.ParentDto;
import com.invicta.member.entity.Parent;

@Service
public class ParentDtoConverter {

	private static Logger logger = LogManager.getLogger(ParentDto.class);

	public static Parent ParentDtoToParent(ParentDto parentDto) {
		Parent parent = new Parent();
		if (parentDto != null) {
			logger.info("Parent Converter --> Dto To Entity");
			parent.setParId(parentDto.getParId());
			parent.setpId(parentDto.getpId());
			parent.setsId(parentDto.getsId());
			parent.setFathersName(parentDto.getFathersName());
			parent.setFathersOccupation(parentDto.getFathersOccupation());
			parent.setFathersOfficialAddress(parentDto.getFathersOfficialAddress());
			parent.setFathersMobile(parentDto.getFathersMobile());
			parent.setFathersEmail(parentDto.getFathersEmail());
			parent.setIfFatherOb(parentDto.isIfFatherOb());
			parent.setFatherFrom(parentDto.getFatherFrom());
			parent.setFatherTo(parentDto.getFatherTo());
			parent.setMothersName(parentDto.getMothersName());
			parent.setMothersOccupation(parentDto.getMothersOccupation());
			parent.setMothersMobile(parentDto.getMothersMobile());
			parent.setIfMotherOb(parentDto.isIfMotherOb());
			parent.setMaidenName(parentDto.getMaidenName());
			parent.setMotherFrom(parentDto.getMotherFrom());
			parent.setMotherTo(parentDto.getMotherTo());
			parent.setGuardian(parentDto.getGuardian());
			parent.setGuardianName(parentDto.getGuardianName());
			parent.setGuardianOccupation(parentDto.getGuardianOccupation());
			parent.setGuardianMobileNo(parentDto.getGuardianMobileNo());
			parent.setGuardianEmail(parentDto.getGuardianEmail());
			parent.setSibilingsFullName(parentDto.getSibilingsFullName());
			parent.setSibilingsGrade(parentDto.getSibilingsGrade());
			parent.setSililingsAdmission(parentDto.getSililingsAdmission());
			return parent;
		}
		return null;

	}
	


}

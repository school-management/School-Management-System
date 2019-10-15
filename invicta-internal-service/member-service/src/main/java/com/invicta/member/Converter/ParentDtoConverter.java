package com.invicta.member.Converter;

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
			parent.setParentId(parentDto.getParentId());
			parent.setFathername(parentDto.getFathername());
			parent.setFatheremail(parentDto.getFatheremail());
			parent.setFathermobile(parentDto.getFathermobile());
			parent.setFatherOccupation(parentDto.getFatherOccupation());
			parent.setFatheroldstudent(parentDto.isFatheroldstudent());
			parent.setFathersofficialaddress(parentDto.getFathersofficialaddress());
			parent.setFstudystart(parentDto.getFstudystart());
			parent.setFstudyend(parentDto.getFstudyend());
			parent.setMothername(parentDto.getMothername());
			parent.setMothermaidenname(parentDto.getMothermaidenname());
			parent.setMothermobile(parentDto.getFathermobile());
			parent.setMotheroccupation(parentDto.getMotheroccupation());
			parent.setMotheroldstudent(parentDto.isMotheroldstudent());
			parent.setMotherstudystart(parentDto.getMotherstudystart());
			parent.setMotherstudyend(parentDto.getMotherstudyend());
			parent.setGuardian(parentDto.getGuardian());
			parent.setGuardianname(parentDto.getGuardianname());
			parent.setGuardianoccupation(parentDto.getGuardianoccupation());
			parent.setGuardianmobileNo(parentDto.getGuardianmobileNo());
			parent.setGuardianemail(parentDto.getGuardianemail());
			parent.setSibilingsfullname(parentDto.getSibilingsfullname());
			parent.setSibilingsGrade(parentDto.getSibilingsGrade());
			parent.setSililingsadmission(parentDto.getSililingsadmission());
			return parent;
		}
		return null;

	}

}

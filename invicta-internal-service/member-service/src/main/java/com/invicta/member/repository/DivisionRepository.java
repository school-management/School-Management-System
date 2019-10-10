package com.invicta.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invicta.member.entity.Division;

public interface DivisionRepository extends JpaRepository<Division, Long>{
	public Division findDivisionByDivisionId(long divisionId);

}


package com.invicta.member.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.invicta.member.entity.Division;

public interface DivisionRepository extends JpaRepository<Division, Long>{
	public Division findDivisionByDivisionId(long divisionId);
	
	String FINDNAME="SELECT * FROM division where division_name=?1";
	@Query(value = FINDNAME,nativeQuery = true)
	List<Division> findDivisionByName(String name);
	
	
	String FINDDIVISION="SELECT division_name FROM division where grade_id=?1";
	@Query(value = FINDDIVISION,nativeQuery = true)
	List<String> findDivisionByGradeId(Long id);
}

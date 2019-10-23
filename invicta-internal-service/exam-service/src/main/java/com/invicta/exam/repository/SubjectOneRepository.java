package com.invicta.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.invicta.exam.entity.SubjectOne;

public interface SubjectOneRepository extends JpaRepository<SubjectOne, Long>{

	public SubjectOne findBySubjectId(Long subjectId);
	
	List<SubjectOne> save(List<SubjectOne> subjectOne);
	
	String fetchAllsubjectId = "SELECT subject_id FROM subject1to8";
<<<<<<< HEAD

=======
>>>>>>> aeb3b123ea345ab321014a602c063654eac9d1ff
	@Query(value = fetchAllsubjectId, nativeQuery = true)
	<T> List<T> getAllsubjectId();
	
	
	String fetchAllstudentId = "SELECT s_id  FROM subject1to8";
	@Query(value = fetchAllstudentId, nativeQuery=true)
	<T> List<T> getAllstudentId();

	

	String fetchAllgradeId = "SELECT grade_id FROM grade";
	@Query(value = fetchAllsubjectId, nativeQuery = true)
	<T> List<T> getAllgradeId();

	
}

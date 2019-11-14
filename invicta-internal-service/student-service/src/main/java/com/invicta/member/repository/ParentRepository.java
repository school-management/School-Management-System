package com.invicta.member.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.invicta.member.entity.Parent;


public interface ParentRepository extends JpaRepository<Parent, Long> {

public Parent findByparId(Long parId);

@Query(value = "from Parent where fathername = :fathername")
List<Parent> findByFathername(String fathername);

@Query(value = "from Parent where mothername = :mothername")
List<Parent> findByMothername(String mothername);

@Query(value = "from Parent where guardianname = :guardianname")
List<Parent> findByGuardianname(String guardianname);
}

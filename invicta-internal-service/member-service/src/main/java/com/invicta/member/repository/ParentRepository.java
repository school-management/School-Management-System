package com.invicta.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invicta.member.entity.Parent;

public interface ParentRepository extends JpaRepository<Parent, Long> {

	public Parent findByParentID(Long par_id);
}

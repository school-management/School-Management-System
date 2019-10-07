package com.invicta.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invicta.member.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

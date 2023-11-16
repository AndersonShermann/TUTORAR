package com.tutorar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorar.model.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository <Professor, Long> {

}

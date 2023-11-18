package com.tutorar.servico;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tutorar.model.Professor;
import com.tutorar.repository.ProfessorRepository;

@Service
public class ProfessorServico {

	private ProfessorRepository repository;
	
	public void salvar(Professor professor) {
		repository.save(professor);
	}
	
	public List<Professor> getProfessor(){
		return repository.findAll();
	}
}

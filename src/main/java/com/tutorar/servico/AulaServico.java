package com.tutorar.servico;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tutorar.model.Aula;
import com.tutorar.repository.AulaRepository;

@Service
public class AulaServico {

	private AulaRepository repository;
	
	public void salvar(Aula aula) {
		repository.save(aula);
	}
	
	public List<Aula> getAula(){
		return repository.findAll();
	}
}

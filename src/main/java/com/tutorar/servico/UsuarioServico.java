package com.tutorar.servico;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tutorar.model.Usuario;
import com.tutorar.repository.UsuarioRepository;

@Service
public class UsuarioServico {

	private UsuarioRepository repository;
	
	public void salvar(Usuario usuario) {
		repository.save(usuario);
	}
	
	public List<Usuario> getUsuario(){
		return repository.findAll();
	}
}

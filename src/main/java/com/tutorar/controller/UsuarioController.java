package com.tutorar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tutorar.model.Usuario;
import com.tutorar.repository.UsuarioRepository;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping()
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("usuario/perfil");

        modelAndView.addObject("usuarios", usuarioRepository.findAll());

        return modelAndView;
    }

    @GetMapping("/cadastrar")
    public ModelAndView cadastrar() {
        ModelAndView modelAndView = new ModelAndView("usuario/cadastro");

        modelAndView.addObject("usuario", new Usuario());

        return modelAndView;
    }

    @GetMapping("/{id}/editar")
    public ModelAndView editar(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("usuario/formulario");

        modelAndView.addObject("usuario", usuarioRepository.getReferenceById(id));

        return modelAndView;
    }

    @PostMapping({"/cadastrar", "/{id}/editar"})
    public String salvar(Usuario usuario) {

        usuarioRepository.save(usuario);
        return "redirect:/home";
    }

    @GetMapping("/{id}/excluir")
    public String excluir(@PathVariable Long id) {
        usuarioRepository.deleteById(id);

        return "redirect:/usuarios";
    }
    
	@GetMapping("/{id}/perfil")
	public ModelAndView perfil(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("usuario/perfil");
 
		Usuario usuario = usuarioRepository.getReferenceById(id);
		modelAndView.addObject("usuario", usuario);
 
		return modelAndView;
	}
}

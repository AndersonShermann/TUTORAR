package com.tutorar.controller;


import java.sql.Time;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tutorar.model.Aula;
import com.tutorar.repository.AulaRepository;

@Controller
@RequestMapping("/")
public class AulaController {
	
	@Autowired
	private AulaRepository aulaRepository;

	/*//home - Aulas
	@GetMapping("/home")
	public String start() {
		return "caminho para a home";
	}*/
	
	//listar aulas
	@GetMapping("/listarAulas")
	public ModelAndView listarAulas() {
		ModelAndView modelAndView = new ModelAndView("aulas/listar.html");
		
		List<Aula> aulas = aulaRepository.findAll();
		modelAndView.addObject("aulas", aulas); //usado no thymeleaf (?)
		return modelAndView;
	}
	
	//cadastra aulas
	@GetMapping("/cadastroAulas")
	public ModelAndView cadastrarAulas() {
		ModelAndView modelAndView = new ModelAndView("aulas/cadastro.html");
		
		//objeto Aula vazio via constructor
		modelAndView.addObject("aula", new Aula());
		return modelAndView;
	}
	
	@PostMapping("/cadastrarAulas")
	public ModelAndView cadastrarAulas(Aula aula) {
		ModelAndView modelAndView = new ModelAndView("redirect:/listarAulas");
		aulaRepository.save(aula);
		return modelAndView;
	}
	
	//editar aulas
	@GetMapping("/{id}/editar")
	public ModelAndView editarAulas(@PathVariable Long id){
		ModelAndView modelAndView = new ModelAndView("aulas/editar.html");
		Aula aula = aulaRepository.getReferenceById(id);
		modelAndView.addObject("aula", aula);
		return modelAndView;
	}
	
	@PostMapping("/{id}/editar")
	public ModelAndView editarAulas(Aula aula) {
		aulaRepository.save(aula);
		ModelAndView modelAndView = new ModelAndView("redirect:/listarAulas");
		return modelAndView;
	}
	
	//excluir aula
	@GetMapping("/{id}/excluir")
	public ModelAndView excluir(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("redirect:/listarAulas");
		aulaRepository.deleteById(id);
		return modelAndView;
	}
	
	//detalhar aulas
	 @GetMapping("/aulas/{id}")
	 public ModelAndView detalharAula(@PathVariable Long id){
	 	ModelAndView modelAndView = new ModelAndView("aulas/detalhar.html");
	 	Aula aula = aulaRepository.getReferenceById(id);
	 	modelAndView.addObject("aula", aula);
	 	return modelAndView;
	 }
	 
}

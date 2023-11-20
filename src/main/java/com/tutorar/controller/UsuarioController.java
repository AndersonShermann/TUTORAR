package com.tutorar.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.tutorar.enums.UF;
import com.tutorar.model.Usuario;
import com.tutorar.repository.UsuarioRepository;

@Controller
@RequestMapping("/")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    
	@GetMapping("/listar-usuario")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("usuario/listarUsuario.html"); //necessario modificar o caminho
 
		List<Usuario> usuarios = usuarioRepository.findAll();
		modelAndView.addObject("usuario", usuarios);
 
		return modelAndView;
	}
	

    @GetMapping("/cadastrar-usuario")
    public ModelAndView cadastrar() {
        ModelAndView modelAndView = new ModelAndView("usuario/cadastroUsuario");

        modelAndView.addObject("usuario", new Usuario());
        modelAndView.addObject("sigla",UF.values());

        return modelAndView;
    }

    @GetMapping("/{id}/editar-usuario")
    public ModelAndView editar(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("usuario/editarUsuario.html"); //necessario modificar o caminho

        modelAndView.addObject("usuario", usuarioRepository.getReferenceById(id));
        modelAndView.addObject("sigla",UF.values());

        return modelAndView;
    }

    @PostMapping({"/cadastrar-usuario", "/{id}/editar-usuario"})
    public String salvar(Usuario usuario, @RequestParam("imagemUsuario") MultipartFile file) throws IOException {
    	
    	try {
    		usuario.setImagem(file.getBytes());
    	}catch(IOException e) {
    		e.printStackTrace();
    	}

        usuarioRepository.save(usuario);
        return "redirect:/listar-usuario";
    }
    
    @GetMapping("/imagem/{id}")
    @ResponseBody
    public byte[] exibirImagem(@PathVariable("id") Long id) {
    	Usuario usuario = this.usuarioRepository.getReferenceById(id);
    	return usuario.getImagem();
    }

    @GetMapping("/{id}/excluir-usuario")
    public String excluir(@PathVariable Long id) {
        usuarioRepository.deleteById(id);

        return "redirect:/listar-usuario";
    }
    
	@GetMapping("/{id}/perfil-usuario")
	public ModelAndView perfil(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("usuario/perfilUsuario"); //necessario modificar o caminho
 
		Usuario usuario = usuarioRepository.getReferenceById(id);
		modelAndView.addObject("usuario", usuario);
 
		return modelAndView;
	}
}

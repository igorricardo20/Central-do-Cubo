package com.central.centraldocubo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.central.centraldocubo.models.Usuario;
import com.central.centraldocubo.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@RequestMapping("/cadastro-usuario")
	public String cadastroUsuario() {
		return "usuario/cadastro-usuario";
	}
	
	@PostMapping("/cadastro-usuario")
	public String cadastrarUsuario(Usuario usuario) {
		
		if (!usuarioRepository.existsByUser(usuario.getUser())) {
			usuarioRepository.save(usuario);
			return "redirect:/login";
		}
		
		return "redirect:/cadastro-usuario";
	}
	
}

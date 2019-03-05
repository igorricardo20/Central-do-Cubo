package com.central.centraldocubo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.central.centraldocubo.models.Usuario;
import com.central.centraldocubo.repository.UsuarioRepository;

@Controller
public class LoginController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@RequestMapping("/login")
	public String login() {
		return "login/login";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute(name="usuario") Usuario usuario, Model model) {
		String user = usuario.getUser();
		String password = usuario.getPassword();
		
		if ("admin".equals(user) && "admin".equals(password)) {
			model.addAttribute("hidden", "hidden");
			return "redirect:/";
		}
		else {
			if (usuarioRepository.existsByUser(user)) {
				Usuario foundUser = usuarioRepository.findByUser(user);
				if (foundUser.getPassword().equals(password)) {
					model.addAttribute("hidden", "hidden");
					return "redirect:/";
				}
				else {
					model.addAttribute("Senha inválida", true);
				}
			}
			else {
				model.addAttribute("Usuário não cadastrado", true);
			}
			model.addAttribute("Credenciais inválidas", true);
			return "login/login";
		}
		

	}
}

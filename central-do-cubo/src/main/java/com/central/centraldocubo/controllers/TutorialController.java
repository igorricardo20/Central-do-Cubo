package com.central.centraldocubo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.central.centraldocubo.models.Tutorial;
import com.central.centraldocubo.repository.TutorialRepository;

@Controller
public class TutorialController {
	
	@Autowired
	private TutorialRepository tutorialRepository;

	@RequestMapping("/cadastro-tutorial")
	public String cadastroTutorial() {
		return "tutorial/cadastro-tutorial";
	}
	
	@PostMapping("/cadastro-tutorial")
	public String cadastrarTutorial(Tutorial tutorial) {
		tutorialRepository.save(tutorial);
		return "redirect:/tutoriais";
	}
	
	@RequestMapping("/tutoriais")
	public ModelAndView listaTutoriais() {
		ModelAndView mv = new ModelAndView("tutorial/consulta-tutorial");
		Iterable<Tutorial> tutoriais = tutorialRepository.findAll();
		mv.addObject("tutoriais", tutoriais);
		return mv;
	}
	
	@RequestMapping("/{codigo}")
	public String teste(@PathVariable("codigo") int codigo) {
		tutorialRepository.deleteById(codigo);
		return "redirect:/tutoriais";
	}
}

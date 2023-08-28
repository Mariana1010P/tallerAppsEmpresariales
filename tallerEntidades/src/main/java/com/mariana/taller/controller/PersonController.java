package com.mariana.taller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mariana.taller.models.Persona;
import com.mariana.taller.repository.IPersonaRepository;

@Controller
@RequestMapping("/persona")
public class PersonController {
	
	@Autowired
	private IPersonaRepository personaRepository;
	
	@GetMapping("/personas")
	public String listPersonas(Model model) {
		List<Persona> personas = personaRepository.findAll();
		
		model.addAttribute("personas", personas);
		return "persona";
	}
}

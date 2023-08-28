package com.mariana.taller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mariana.taller.models.Casa;
import com.mariana.taller.repository.ICasaRepository;

@Controller
@RequestMapping("/casa")
public class CasaController {

	@Autowired
	private ICasaRepository casaRepository;
	
	@GetMapping("/casas")
	public String listCasas(Model model) {
		List<Casa> casas = casaRepository.findAll();
		
		model.addAttribute("casas",casas);
		return "casa";
	}
}

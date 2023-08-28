package com.mariana.taller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mariana.taller.models.Avion;
import com.mariana.taller.repository.IAvionRepository;

@Controller
@RequestMapping("/avion")
public class AvionController {
	
	@Autowired
	private IAvionRepository avionRepository;
	
	@GetMapping("/aviones")
	public String listAviones(Model model) {
		List<Avion> aviones = avionRepository.findAll();
		model.addAttribute("aviones",aviones);
		
		return "avion";
	}
}

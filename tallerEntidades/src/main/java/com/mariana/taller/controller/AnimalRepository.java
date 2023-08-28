package com.mariana.taller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mariana.taller.models.Animal;
import com.mariana.taller.repository.IAnimalRepository;

@Controller
@RequestMapping("/animal")
public class AnimalRepository {

	@Autowired
	private IAnimalRepository animalRepository;
	
	@GetMapping("/animales")
	public String listAnimales(Model model) {
		List<Animal> animales = animalRepository.findAll();
		model.addAttribute("animales", animales);
		return "animal";
	}
}

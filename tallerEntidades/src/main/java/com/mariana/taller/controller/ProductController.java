package com.mariana.taller.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mariana.taller.models.Producto;
import com.mariana.taller.repository.IProductoRepository;

@Controller
@RequestMapping("/producto")
public class ProductController {

	@Autowired
	private IProductoRepository productRepository;
	
	@GetMapping("/productos")
	public String listProduct(Model model) {
		List<Producto> productos = productRepository.findAll();
		
		model.addAttribute("productos", productos);
		return "producto";
	}
}

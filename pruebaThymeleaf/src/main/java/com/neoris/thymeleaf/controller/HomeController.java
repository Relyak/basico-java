package com.neoris.thymeleaf.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.neoris.thymeleaf.model.Persona;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index(Model model) {
		List<Persona> persona = Arrays.asList(new Persona("Juan", 30), new Persona("María", 25),
				new Persona("Pedro", 40));
		model.addAttribute("persona", persona);
		return "index";
	}
}

package com.neoris.crud.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HtmlController {
	private HomeControl controlador;
	private Long id = 2L;
	private static final String var = "index2";

	@GetMapping("/persona/index/{id}")
	public ModelAndView index(@PathVariable Long id) {
		ModelAndView modelo = new ModelAndView(var);
		modelo.addObject(var, id);
		return modelo;

	}
}
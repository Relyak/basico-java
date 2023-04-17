package com.neoris.primer_proyecto.controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neoris.primer_proyecto.modelo.Persona;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/persona")
public class HomeControlador {
	// localhost:8080/personas/datos
	@RequestMapping(path = "/datos", method = RequestMethod.GET)
	public Persona mostrarPersona(HttpServletRequest request) {
		Persona per = new Persona();
		per.setNombre("juan");
		per.setEdad(23);
		per.setAficion("furbo");
		return per;
	}

}

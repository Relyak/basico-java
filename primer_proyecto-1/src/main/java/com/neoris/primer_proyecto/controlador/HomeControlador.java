package com.neoris.primer_proyecto.controlador;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeControlador {

	// aqui le pasamos el path
	@GetMapping("/")
	public String mostrar() {
		return "<h1> Hola neoris</h1>";
	}
}

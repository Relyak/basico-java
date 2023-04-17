package com.neoris.primer_proyecto.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neoris.primer_proyecto.modelo.Persona;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/persona")
public class HomeControlador {
	@RequestMapping(path = "/datos", method = RequestMethod.GET)
	public Persona mostrarPersona(HttpServletRequest request) {
		Persona per = new Persona();
		per.setNombre("juan");
		per.setEdad(23);
		per.setAficion("furbo");
		return per;
	}

	static List<Persona> personas = new ArrayList<Persona>();

	// aqui le pasamos el path
	@GetMapping("/")
	public String mostrar() {
		personas.removeAll(personas);
		llenar();
		String mostrar = "<h1>Personas</h1><br>";
		for (Persona a : personas) {
			mostrar += "<li>Nombre: " + a.getNombre() + " Edad: " + a.getEdad() + " Afición: " + a.getAficion()
					+ "</li>";
		}
		return mostrar;
	}

	public void llenar() {
		Persona persona1 = new Persona("Juan", 25, "Fútbol");
		Persona persona2 = new Persona("María", 30, "Arte");
		Persona persona3 = new Persona("Pedro", 22, "Música");
		personas.add(persona1);
		personas.add(persona2);
		personas.add(persona3);
	}
}

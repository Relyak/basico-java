package com.neoris.primer_proyecto.controlador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neoris.primer_proyecto.modelo.Direccion;
import com.neoris.primer_proyecto.modelo.Persona;

import jakarta.servlet.http.HttpServletRequest;

@RestController
//@RequestMapping("/datos") ESTO HACE QUE PARA ENTRAR USES LOCALHOST:8080/datos/persona||otros
public class HomeControlador {
	// localhost:8080/persona
	@RequestMapping(path = "/persona", method = RequestMethod.GET)
	public ResponseEntity mostrarPersona(HttpServletRequest request) {
		Persona per = new Persona();
		per.setNombre("juan");
		per.setEdad(23);
		per.setAficion("fuarbola");
		return new ResponseEntity(per.getNombre() + " " + per.getEdad() + " " + per.getAficion(), HttpStatus.OK);
		// return per; en el caso que el metodo sea public Persona
	}

	// localhost:8080/otros
	@RequestMapping(path = "/otros", method = RequestMethod.GET)
	public Direccion mostrarDireccion(HttpServletRequest request) {
		Direccion dir = new Direccion();
		dir.setDireccion("127.0.0.1");
		return dir;
	}

}

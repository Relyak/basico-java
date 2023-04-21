package com.neoris.crud.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neoris.crud.modelo.Persona;
import com.neoris.crud.service.ServicioPersona;

@RestController
@RequestMapping("/persona")
public class HomeControl {
	// para verlo en internet en swagger http://localhost:8080/swagger-ui/index.html
	// o con postman http://localhost:8080/persona
	@Autowired
	private ServicioPersona servicio;

	public static List<Persona> listP = new ArrayList<>();

	@PostMapping
	public ResponseEntity crearPersona(@RequestBody Persona persona) {
		Persona nueva = servicio.crearPersona(persona);

		listP.add(nueva);
		return new ResponseEntity(nueva, HttpStatus.CREATED);
	}

	@GetMapping("/busca/{id}")
	public ResponseEntity obtenerPersona(@PathVariable Long id) {

		return new ResponseEntity(servicio.obtenerPersona(id), HttpStatus.OK);
	}

	@GetMapping("/lista")
	public ResponseEntity listaPersonas() {
		List<Persona> personas = servicio.listaPersonas();
		return new ResponseEntity(personas, HttpStatus.OK);
	}

	@DeleteMapping("/borrar/{id}")
	public ResponseEntity eliminarPersona(@PathVariable Long id) {
		servicio.eliminarPersona(id);
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	// esto da error porque si tienen el mismo telefono no lo procesa
//	@GetMapping("/telefono/{tel}")
//	public ResponseEntity buscarTelefono(@PathVariable String tel) {
//		return new ResponseEntity(servicio.buscarTelefono(tel), HttpStatus.OK);
//	}

//	@GetMapping("/telefono/{tel}")
//	public ResponseEntity buscarTelefono(@PathVariable String tel) {
//		List<Persona> telefonos = servicio.buscarTelefono(tel);
//		return new ResponseEntity(telefonos, HttpStatus.OK);
//	}
	@GetMapping("/telefono")
	public ResponseEntity buscarTelefono(@RequestParam String tel) {
		// List<Persona> telefonos = servicio.buscarTelefono(tel);
		return new ResponseEntity(servicio.buscarTelefono(tel), HttpStatus.OK);
	}
	// por body pasando el id en el body

//	@PutMapping("/actualizar")
//	public ResponseEntity actualizarPersona(@RequestBody Persona p) {
//		Persona nueva = servicio.actualizarPersona(p.getId(), p);
//		return new ResponseEntity(nueva, HttpStatus.CREATED);
//	}

	// por url

	@PutMapping("/actualizar/{id}")
	public ResponseEntity actualizarPersona(@PathVariable Long id, @RequestBody Persona p) {
		Persona nueva = servicio.actualizarPersona(id, p);
		return new ResponseEntity(nueva, HttpStatus.CREATED);
	}

}
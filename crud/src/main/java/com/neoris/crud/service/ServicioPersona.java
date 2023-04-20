package com.neoris.crud.service;

import java.util.List;

import com.neoris.crud.modelo.Persona;

public interface ServicioPersona {
	// Post crear
	Persona crearPersona(Persona p);

	// Recuperar una
	Persona obtenerPersona(Long id);

	// Recuperar todos
	List<Persona> listaPersonas();

	// Borrar una
	void eliminarPersona(Long id);

	// Actualizar
	Persona actualizarPersona(Long id, Persona p);

	// Buscar telefono
	List<Persona> buscarTelefono(String tel);
}

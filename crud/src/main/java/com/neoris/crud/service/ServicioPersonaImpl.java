package com.neoris.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.neoris.crud.modelo.Persona;
import com.neoris.crud.repository.RepositorioPersona;

@Service
public class ServicioPersonaImpl implements ServicioPersona {
	private final RepositorioPersona REPOSITORIO;

	public ServicioPersonaImpl(RepositorioPersona repositorio) {
		this.REPOSITORIO = repositorio;
	}

	// crear
	@Override
	public Persona crearPersona(Persona p) {
		// TODO Auto-generated method stub
		return REPOSITORIO.save(p);
	}

	// buscar por id
	@Override
	public Persona obtenerPersona(Long id) {
		// TODO Auto-generated method stub
		return REPOSITORIO.findById(id).orElse(null);
	}

	@Override
	public List<Persona> buscarTelefono(String tel) {
		// TODO Auto-generated method stub
		return REPOSITORIO.findByTelefono(tel);
	}

	// mostrar todos
	@Override
	public List<Persona> listaPersonas() {
		// TODO Auto-generated method stub
		return REPOSITORIO.findAll();
	}

	@Override
	public void eliminarPersona(Long id) {
		// TODO Auto-generated method stub
		REPOSITORIO.deleteById(id);
	}

	/*
	 * @Override public Persona actualizarPersona(Long id, Persona p) { Persona mod
	 * = REPOSITORIO.findById(id).orElse(null); if (mod != null) { if (p.getNombre()
	 * != null) { mod.setNombre(p.getNombre()); } if (p.getApellidos() != null) {
	 * mod.setApellidos(p.getApellidos()); } if (p.getDireccion() != null) {
	 * mod.setDireccion(p.getDireccion()); } if (p.getTelefono() != null) {
	 * mod.setTelefono(p.getTelefono()); }
	 * 
	 * return REPOSITORIO.save(mod); } else { return null; }
	 * 
	 * }
	 */
	@Override
	public Persona actualizarPersona(Long id, Persona p) {
		Persona mod = REPOSITORIO.findById(id).orElse(null);
		if (mod != null) {
			mod.setDireccion(p.getDireccion());
			mod.setTelefono(p.getTelefono());

			return REPOSITORIO.save(mod);
		} else {
			return null;
		}

	}

}

package com.neoris.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neoris.crud.modelo.Persona;

public interface RepositorioPersona extends JpaRepository<Persona, Long> {
	List<Persona> findByTelefono(String tel);
}

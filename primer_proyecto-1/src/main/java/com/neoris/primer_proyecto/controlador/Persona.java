package com.neoris.primer_proyecto.controlador;

public class Persona {
	private String nombre;
	private int edad;
	private String aficion;

	/**
	 * @param nombre
	 * @param edad
	 * @param aficion
	 */
	public Persona(String nombre, int edad, String aficion) {
		this.nombre = nombre;
		this.edad = edad;
		this.aficion = aficion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @return the aficion
	 */
	public String getAficion() {
		return aficion;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @param aficion the aficion to set
	 */
	public void setAficion(String aficion) {
		this.aficion = aficion;
	}

}

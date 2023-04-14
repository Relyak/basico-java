package com.neoris.primer_proyecto.modelo;

public class Sucursales {
	private int numSu;
	private String direccion;
	private String ciudad;

	/**
	 * @param numSu
	 * @param direccion
	 * @param ciudad
	 * @param peso
	 * @param prioridad
	 * @param referencia
	 * @param dni
	 */
	public Sucursales(int numSu, String direccion, String ciudad) {
		this.numSu = numSu;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}
	/**
	 * @return the numSu
	 */
	public int getNumSu() {
		return numSu;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * @param numSu the numSu to set
	 */
	public void setNumSu(int numSu) {
		this.numSu = numSu;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
}

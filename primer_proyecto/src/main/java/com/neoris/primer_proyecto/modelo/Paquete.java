package com.neoris.primer_proyecto.modelo;

import java.util.HashSet;

import javax.swing.JOptionPane;

public class Paquete {
	private int numeroRef;
	private String dni;
	private String prioridad;
	private double peso;
	
	
	/**
	 * @return the numeroRef
	 */
	public int getNumeroRef() {
		return numeroRef;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @return the prioridad
	 */
	public String getPrioridad() {
		return prioridad;
	}
	/**
	 * @param numeroRef the numeroRef to set
	 */
	public void setNumeroRef(int numeroRef) {
		this.numeroRef = numeroRef;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @param prioridad the prioridad to set
	 */
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	/**
	 * @param numeroRef
	 * @param dni
	 * @param prioridad
	 */
	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/**
	 * @param numeroRef
	 * @param dni
	 * @param prioridad
	 * @param peso
	 */
	public Paquete(int numeroRef, String dni, String prioridad, double peso) {
		super();
		this.numeroRef = numeroRef;
		this.dni = dni;
		this.prioridad = prioridad;
		this.peso = peso;
	}
	
}

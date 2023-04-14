package EjercicioTodo;

import java.util.ArrayList;
public abstract class Persona {
	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param experiencia
	 */
	public Persona(String nombre, String apellido, int edad, int experiencia) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.experiencia = experiencia;
	}
	//VARIABLES COMUNES A TODAS LAS CLASES
	protected  String nombre;
	protected  String apellido;
	protected  int edad;
	protected  int experiencia;
	//METODOS COMUNES
	public abstract void viaje();
	public abstract void entrenamiento();
	public abstract void partido();
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @return the experiencia
	 */
	public int getExperiencia() {
		return experiencia;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @param experiencia the experiencia to set
	 */
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	
}

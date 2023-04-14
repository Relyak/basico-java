package EjercicioTodo;

public class Doctor extends Persona{
	//VARIABLES UNICAS
	private String titulacion;

	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param experiencia
	 * @param titulacion
	 */
	public Doctor(String nombre, String apellido, int edad, int experiencia, String titulacion) {
		super(nombre, apellido, edad, experiencia);
		this.titulacion = titulacion;
	}
	
	//METODO UNICO
	public void curar() {
		System.out.println("He aplicado crema en los tobillos de Ronaldinho");
	}
	
	//METODOS DE LA SUPERCLASE
	@Override
	public void entrenamiento() {
		// TODO Auto-generated method stub
		System.out.println("He de leer muchos libros sobre lesiones, así podré hacer algo más que aplicar cremas.");	
	}
	
	@Override
	public void partido() {
		// TODO Auto-generated method stub
		System.out.println("He de mirar si algún jugador necesita crema.");
	}
	@Override
	public void viaje() {
		System.out.printf("NOMBRE: %S APELLIDO: %S EDAD: %d EXPERIENCIA: %d TITULACION: %S%n",nombre,apellido,edad,experiencia,titulacion);
	}
	//GETTERS Y SETTERS
	/**
	 * @return the titulacion
	 */
	public String getTitulacion() {
		return titulacion;
	}
	/**
	 * @param titulacion the titulacion to set
	 */
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
}

package EjercicioTodo;

public class Futbolista extends Persona {
	// VARIABLES UNICAS
	private String posicion;
	private int dorsal;

	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param experiencia
	 * @param posicion
	 * @param dorsal
	 */
	public Futbolista(String nombre, String apellido, int edad, int experiencia, String posicion, int dorsal) {
		super(nombre, apellido, edad, experiencia);
		this.posicion = posicion;
		this.dorsal = dorsal;
	}

	// METODO UNICO DE FUTBOLISTA
	public void entrevista() {
		System.out.println("O partido foi difícil, pero com nossa equipa podemos ganhar al final.");
	}

	// METODOS DE LA SUPERCLASE QUE SON DIFERENTES PARA CADA PERSONA

	@Override
	public void entrenamiento() {
		System.out.println("25 abdominales diarios, 30 flexiones, 3km de carrera continua.");
	}

	@Override
	public void partido() {
		System.out.println("He de marcar la mayor cantidad de goles posibles, soy el mejor.");
	}
	@Override
	public void viaje() {
		System.out.printf("NOMBRE: %S APELLIDO: %S EDAD: %d EXPERIENCIA: %d POSICION: %S DORSAL: %d%n",nombre,apellido,edad,experiencia,posicion,dorsal);
	}

	// GETTERS Y SETTERS
	/**
	 * @return the posicion
	 */
	public String getPosicion() {
		return posicion;
	}

	/**
	 * @return the dorsal
	 */
	public int getDorsal() {
		return dorsal;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	/**
	 * @param dorsal the dorsal to set
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

}

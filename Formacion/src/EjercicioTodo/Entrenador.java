package EjercicioTodo;

public class Entrenador extends Persona{
	//VARIABLES UNICAS
	private String estrategia;
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param experiencia
	 * @param estrategia
	 */
	public Entrenador(String nombre, String apellido, int edad, int experiencia, String estrategia) {
		super(nombre, apellido, edad, experiencia);
		this.estrategia = estrategia;
	}
	//METODO UNICO
	public void planificar() {
		System.out.println("El plan es atacar y defender, cuando tengas el balon marcas gol, si lo tienen ellos defiende.");
	}
	//METODOS DE LA SUPERCLASE
	@Override
	public void entrenamiento() {
		// TODO Auto-generated method stub
		System.out.println("He de mirar el chiringuito para aprender más estrategias.");
		
	}
	@Override
	public void partido() {
		// TODO Auto-generated method stub
		System.out.println("Para los futbolistas marcar goles, para el portero evitar que entren los goles.");
		
	}
	@Override
	public void viaje() {
		System.out.printf("NOMBRE: %S APELLIDO: %S EDAD: %d EXPERIENCIA: %d ESTRATEGIA: %S%n",nombre,apellido,edad,experiencia,estrategia);
	}
	/**
	 * @return the estrategia
	 */
	public String getEstrategia() {
		return estrategia;
	}
	/**
	 * @param estrategia the estrategia to set
	 */
	public void setEstrategia(String estrategia) {
		this.estrategia = estrategia;
	}
	
	
	
	
	
	
}

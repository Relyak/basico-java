package EjercicioTodo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	// VARIABLES DE MI MAIN
	static ArrayList<Persona> equipo = new ArrayList();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.cargarDatos();
		main.menu();

	}

	// MOSTRAR LOS DATOS
	public void mostrarDatos() {
		for (Persona persona : equipo) {
			persona.viaje();
		}
	}

	// MOSTRAR ENTRENAMIENTO
	public void mostrarEntrenamiento() {
		for (Persona persona : equipo) {
			if (persona instanceof Futbolista) {
				System.out.println(persona.nombre + ":");
				persona.entrenamiento();
			}
			if (persona instanceof Entrenador) {
				System.out.println(persona.nombre + ":");
				persona.entrenamiento();
			}
			if (persona instanceof Doctor) {
				System.out.println(persona.nombre + ":");
				persona.entrenamiento();
			}
		}
	}

	// MOSTRAR QUE HACE CADA UNO EN UN PARTIDO
	public void mostrarPartido() {
		for (Persona persona : equipo) {
			if (persona instanceof Futbolista) {
				System.out.println(persona.nombre + ":");
				persona.partido();
			}
			if (persona instanceof Entrenador) {
				System.out.println(persona.nombre + ":");
				persona.partido();
			}
			if (persona instanceof Doctor) {
				System.out.println(persona.nombre + ":");
				persona.partido();
			}
		}
	}

	// MOSTRAR PLANIFICACION DEL ENTRENADOR
	public void mostrarPlanificacion() {
		// Buscar la instancia de Entrenador
		for (Persona persona : equipo) {
			if (persona instanceof Entrenador) {
				// Cast a Entrenador
				Entrenador entrenador = (Entrenador) persona;
				System.out.println(persona.nombre + ":");
				entrenador.planificar();
			}
		}
	}

	// MOSTRAR ENTREVISTAS DE LOS FUTBOLISTAS
	public void mostrarEntrevistas() {
		// BUSCO A LOS FUTBOLISTAS
		for (Persona persona : equipo) {
			if (persona instanceof Futbolista) {
				// CAST A FUTBOLISTA
				Futbolista fut = (Futbolista) persona;
				System.out.println(persona.nombre + ":");
				fut.entrevista();
			}
		}
	}

	// MOSTRAR CURAS DEL DOCTOR
	public void mostrarCuras() {
		// BUSCO A LOS DOCTORES
		for (Persona persona : equipo) {
			if (persona instanceof Doctor) {
				// CAST A DOCTOR
				//persona.curar();
				Doctor doc = (Doctor) persona;
				System.out.println(persona.nombre + ":");
				doc.curar();
			}
		}
	}

	// LLENAR DATOS
	public void cargarDatos() {
		// FUT
		Persona kayler = new Futbolista("Kayler", "Borges", 22, 3, "delantero", 10);
		Persona kaylord = new Futbolista("Kaylord", "Siquiera", 32, 8, "centro", 14);
		Persona relyak = new Futbolista("Relyak", "Segrob", 42, 22, "defensa", 23);
		equipo.add(kayler);
		equipo.add(kaylord);
		equipo.add(relyak);
		// ENT
		Persona julian = new Entrenador("Julian", "Costa", 19, 1, "Ofensiva siempre");
		Persona segismundo = new Entrenador("Segismundo", "Rey de Luxemburgo", 45, 25,
				"La mejor defensa es un buen ataque.");
		equipo.add(julian);
		equipo.add(segismundo);
		// DOC
		Persona carlosPrim = new Doctor("Carlos I", "de Austria", 52, 20, "Cremólogo");
		Persona felipeSe = new Doctor("Felipe II", "de España y Portugal", 32, 12, "Experto en cremas");
		equipo.add(carlosPrim);
		equipo.add(felipeSe);
	}

	// MENU
	public void menu() {

		int opcion = -1;

		while (opcion != 0) {
			try {
				System.out.println(
						"Ingrese una opción\n-----------------\n0- Salir\n1- Viaje\n2- Entrenamiento\n3- Partido\n4- Planificación\n5- Entrevistas\n6- Curar\n-----------------");
				opcion = sc.nextInt();

				switch (opcion) {
				case 1:
					System.out.println("Viaje");
					mostrarDatos();
					break;
				case 2:
					System.out.println("Entrenamiento");
					mostrarEntrenamiento();
					break;
				case 3:
					System.out.println("Partido");
					mostrarPartido();
					break;
				case 4:
					System.out.println("Planificación");
					mostrarPlanificacion();
					break;
				case 5:
					System.out.println("Entrevistas");
					mostrarEntrevistas();
					break;
				case 6:
					System.out.println("Curar");
					mostrarCuras();
					break;
				case 0:
					System.out.println("Hasta pronto!");
					break;
				default:
					System.out.println("Opción inválida. Intente nuevamente.");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Error: Ingrese un número válido.");
				// LIMPIEZA DE BUFFER POR SI ALGUIEN ESCRIBIO LETRAS
				sc.nextLine();
			}
		}
		sc.close();
	}

}

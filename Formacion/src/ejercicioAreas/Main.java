package ejercicioAreas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	//Static para usarlos en todos los métodos
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Poligono> poligonos = new ArrayList();

	public static void main(String[] args) {
		agregar();
		
	}
	
	//Método para agregar poligonos
	public static void agregar() {
		String respuesta = "";
		String poli = "";
		do {
			System.out.println("Qué desea añadir:\ntriangulo\nrectangulo\nn para salir");
			poli = sc.nextLine();
			switch (poli) {
			case "triangulo":
				aTriangulo();
				break;
			case "rectangulo":
				aRectangulo();
				break;
			case "n":
				respuesta="n";
				break;
			default:
				System.out.println("Solo está disponible triangulo||rectangulo");
			}
		} while (!respuesta.equalsIgnoreCase("n"));
		mostrarPoligonos();
	}

	public static void aTriangulo() {
		System.out.println("Dime la base:");
		double base = sc.nextDouble();
		System.out.println("Dime la altura:");
		double altura = sc.nextDouble();
		poligonos.add(new Triangulo(base, altura));
		sc.nextLine();// limpio el buffer

	}

	public static void aRectangulo() {
		System.out.println("Dime la base:");
		double base = sc.nextDouble();
		System.out.println("Dime la altura:");
		double altura = sc.nextDouble();
		poligonos.add(new Rectangulo(base, altura));
		sc.nextLine();// limpio el buffer
	}

	public static void mostrarPoligonos() {
		System.out.println("POLIGONOS:\n---------------------");
		for (Poligono poligono : poligonos) {
			if (poligono instanceof Triangulo) {
				System.out.println("Triangulo:" + poligono.calcularArea()+" area||"+poligono.base+" base||"+poligono.altura+" altura");
			} else if (poligono instanceof Rectangulo) {
				System.out.println("Rectangulo:"+ poligono.calcularArea()+" area||"+poligono.base+" base||"+poligono.altura+" altura");
			}
		}
	}

}

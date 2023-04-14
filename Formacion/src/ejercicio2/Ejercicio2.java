package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
			String fraseSinEspacio=sacarEspacio();
	}
	public static String sacarEspacio() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Dime la frase");
		String frase= sc.nextLine();
		String sinEspacio=frase.replaceAll(" ","");
		System.out.println(sinEspacio);
		return sinEspacio;
	}
}

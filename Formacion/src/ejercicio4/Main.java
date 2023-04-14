package ejercicio4;

import java.util.Scanner;

public class Main {
	final static int VAL1=3,VAL2=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.tablas();
	}

	public void tablas() {
		// VARIABLES
		Scanner sc=new Scanner(System.in);

		int[] tablaA = new int[VAL1];
		int[] tablaB = new int[VAL2];
		
		int[] tablaC = new int[tablaA.length + tablaB.length];
		String [] tablaPalabras= new String[tablaA.length];
		int val;
		for (int i = 0; i < tablaA.length; i++) {
			System.out.println("Dime los valores para la primera tabla:");
			val=sc.nextInt();
			tablaA[i]=val;
			System.out.println("Dime los valores para la segunda tabla:");
			val=sc.nextInt();
			tablaB[i]=val;
		}
		// FOR PARA LLENAR EL ARRAY
		System.out.println("Tabla con numeros:");
		/*
		 * it0= C=1 A=1
		 * it1= C=2 B=1
		 * it2= C=3 A=2
		 * it3= C=4 B=2*/
		for (int i = 0; i < tablaC.length; i++) {
			if (i % 2 == 0) { // si es par el indice
				tablaC[i] = tablaA[i/2];//divido entre 2 porque el tamaño de tablaC es el doble del tamaño de tablaA
			} else { // si es impar el indice
				tablaC[i] = tablaB[i/2];//divido entre 2 porque el tamaño de tablaC es el doble del tamaño de tablaB
			}
			System.out.print(tablaC[i] + " ");
		}
		// FOR PARA LLENAR EL ARRAY CON PALABRAS
		System.out.println("\nTabla con palabras:");
		for (int i = 0; i < tablaPalabras.length; i++) {
			tablaPalabras[i]=tablaA[i]+" "+tablaB[i];
			System.out.print(tablaPalabras[i] + " ");
		}
		sc.close();
	}
}

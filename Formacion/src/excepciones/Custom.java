package excepciones;

import java.util.Scanner;

public class Custom {
	public static void main(String[] args) {
		Custom cs= new Custom();
		try {
			cs.introducirNumero();
		} catch (Excepcion0 e) {
			// TODO Auto-generated catch block
			System.out.println("Mensaje personalizado");
		}
		System.out.println("FIN");
	}

	private int numero;
	private Scanner entrada;

	public void introducirNumero() throws Excepcion0 {
		entrada = new Scanner(System.in);
		do {
			System.out.println("Añade un numero");
			numero = entrada.nextInt();
			if (numero == 0) {
				throw new Excepcion0();
			}

		} while (numero != 0);
	}

	class Excepcion0 extends Exception {
		public Excepcion0() {
			super("Se produjo un error");
		}
	}
}

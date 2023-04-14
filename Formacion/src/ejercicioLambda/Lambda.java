package ejercicioLambda;

import java.util.Arrays;

public class Lambda {

	final int TAMANO = 3;
	int valor1 = 5;
	int valor2 = -3;

	// DEVUELVE SIEMPRE 5
	public Constante dev() {

		return () -> 5;
	}

	// DEVUELVE DOS ENTEROS
	public Operador ob() {
		return (a, b) -> a + b;
	}

	// DEVUELVE array de string, recibe array todas las posiciones obtienen el valor
	// del parametro
	public IniArr obIni() {
		return (array, valor) -> {
			Arrays.fill(array, valor);
		};
	}

	public static void main(String[] args) {
		Lambda l = new Lambda();
		l.mostrar();
	}

	public void mostrar() {
		System.out.println(dev().valor());
		System.out.println(ob().ope(valor1, valor2));
		String array[] = new String[TAMANO];
		obIni().ini(array, "*");
		for (String a : array) {
			System.out.print(a);
		}

	}
}

interface Constante {
	int valor();
}

interface Operador {
	int ope(int a, int b);
}

interface IniArr {
	void ini(String[] array, String valor);
}
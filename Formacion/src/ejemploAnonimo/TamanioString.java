package ejemploAnonimo;

import java.util.function.Function;

public class TamanioString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> y = String::length;
		Function<String,Integer>z = (x)-> x.length();
		Integer tamano = y.apply(cad);
		System.out.printf("El tamaño de la cadena es de: %d",tamano);
	}

}
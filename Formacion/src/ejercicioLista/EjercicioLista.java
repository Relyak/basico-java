package ejercicioLista;
import java.util.LinkedList;
import java.util.ListIterator;

public class EjercicioLista {
	//LISTAS
	LinkedList<String> listaImpar = new LinkedList<String>();
	LinkedList<String> listaPar = new LinkedList<String>();
	//VARIABLES
	String letra;
	
	public static void main(String[] args) {
		EjercicioLista m = new EjercicioLista();
		m.listas();
	}
	
	public void listas() {
		llenar();	
		// ITERADORES
		ListIterator<String> it1 = listaImpar.listIterator();
		ListIterator<String> it2 = listaPar.listIterator();
		// LISTA1
		System.out.println("\nLista 1: ");
		mostrar(it1);
		// LISTA2
		System.out.println("\nLista 2: ");
		mostrar(it2);
		// REINICIO
		it1 = listaImpar.listIterator();
		it2 = listaPar.listIterator();
		// MOSTRAR LISTA
		System.out.println("\nLista mezclada:");
		mostrar(it1,it2);
		// BORRADO y RESETEO de la lista 2
		it2 = listaPar.listIterator();
		System.out.println("\nLista 2 borrada por pares:");
		borrado(it2);
		// REINICIAR Y MOSTRAR
		it2 = listaPar.listIterator();
		mostrar(it2);
		// REINICIAR Y MOSTRAR
		System.out.println("\nNueva lista mezclada sin los elementos de la lista 2: ");
		it1 = listaImpar.listIterator();
		it2 = listaPar.listIterator();
		mostrar(it1,it2);
	}
	
	public void llenar() {

		listaImpar.add("A");
		listaImpar.add("C");
		listaImpar.add("E");
		listaImpar.add("G");
		listaImpar.add("Z");
		listaImpar.add("X");
		listaPar.add("B");
		listaPar.add("D");
		listaPar.add("F");
		listaPar.add("H");
	}
	
	public void mostrar(ListIterator<String> it) {
		while (it.hasNext()) {
			letra = it.next();
			System.out.print(letra + " ");
		}
	}
	
	public void mostrar(ListIterator<String> it1, ListIterator<String> it2) {
		while (it1.hasNext() || it2.hasNext()) {
			if (it1.hasNext()) {
				System.out.print(it1.next()+" ");
			}
			if (it2.hasNext()) {
				System.out.print(it2.next()+" ");
			}
		}
	}
	
	public void borrado(ListIterator<String> it) {
	    int ind = 0;
	    while (it.hasNext()) {
	        letra = it.next();
	        if (ind % 2 == 0) {
	            it.remove();
	        }
	        ind++;
	    }
	}

}
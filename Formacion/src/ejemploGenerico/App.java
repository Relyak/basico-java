package ejemploGenerico;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generica <Integer>prueba =new Generica<Integer>();
		ArrayList <Integer> pruebaList= new ArrayList<Integer>();
		
		prueba.setPrimera(2);
		//System.out.println(prueba.getPrimera());
		String a[]= new String[10];
		System.out.println(Matriz.getElement(a));
		
	}

}
class Generica <T>{
	private T primera;
	
	
	public Generica() {
		this.primera=null;
	}
	
	public T getPrimera() {
		return this.primera;
	}
	public void setPrimera(T valor) {
		this.primera=valor;
	}	
}

class Matriz{
	public static <T> String getElement(T []elemento){
		return "El valor es: "+elemento.length;
	}
}


class Prueba{
	public static <T> String getElement(T elemento){
		return "El valor es: ";
	}
}
package ejercicio1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio1 {
	public static final double FINAL=-1.0;
	public static void main(String[] args){
		//VARIABLES
		ArrayList<Double> lista = new ArrayList<Double>();
		double numero=0;
		double mayor=0;//lista.size()-1;
		double menor=0;//lista.get(0);
		double mayorNeg=0;
		double sumaPos=0;
		double sumaNeg=0;
		int contadorPos=0;
		double mediaPos=0;
		double sumaTotal=0;
		Scanner sc= new Scanner(System.in);
		//CALCULO
		while(true) {
			System.out.println("Dime el numero");
			numero=sc.nextDouble();
			if(numero==FINAL) {
				break;
			}
			
			if(numero>0) {
				sumaPos+=numero;
				contadorPos++;
			}
			if(numero<0) {
				sumaNeg+=numero;
			}
			sumaTotal+=numero;
			lista.add(numero);
			
			
		}
		Collections.sort(lista);
		mayor=lista.get(lista.size()-1);
		menor=lista.get(0);
		mediaPos=sumaPos/contadorPos;
		System.out.println("MAYOR:"+mayor+ " MENOR:"+menor+" TOTAL:"+sumaTotal+" SUMA POSITIVOS:"+sumaPos+" SUMANEG:"+sumaNeg+" MEDIA:"+mediaPos);	
		sc.close();
	}
	

}

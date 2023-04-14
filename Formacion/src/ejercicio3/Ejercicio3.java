package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lineas();
	}
	public static void lineas() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime el numero de lineas");
		int lineas=sc.nextInt();
		for (int i = 1; i <= lineas; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		sc.close();
	}

}

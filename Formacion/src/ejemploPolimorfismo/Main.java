package ejemploPolimorfismo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo=new Vehiculo("123","Renal");
		Vehiculo vehiculo1=new Coche("421","Renos",23);
		Vehiculo vehiculo2=new Camion("512","Renull",394);
		vehiculo.mostrarDatos();
		vehiculo1.mostrarDatos();
		vehiculo2.mostrarDatos();
	}

}

package ejemploPolimorfismo;

public class Camion extends Vehiculo {
	private int numPuertas;

	public Camion(String matricula, String modelo, int numPuertas) {
		super(matricula, modelo);
		this.numPuertas = numPuertas;
	}
	

}

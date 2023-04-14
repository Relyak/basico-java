package ejemploPolimorfismo;

public class Coche extends Vehiculo {
	private int carga;

	public Coche(String matricula, String modelo, int carga) {
		super(matricula, modelo);
		this.carga = carga;
	}
	
}

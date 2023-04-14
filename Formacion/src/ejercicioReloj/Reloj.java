package ejercicioReloj;
public class Reloj {
	final int SEXAGESIMAL = 59;
	final int HORASDIA = 23;
	final int SEGUNDOS = 1000;
	int segundos = 55, minutos = 59, horas = 23;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reloj r = new Reloj();
		r.reloj();
	}
	public void reloj() {
		while (true) {
			try {
				segundos++;
				Thread.sleep(SEGUNDOS);
				if (segundos > SEXAGESIMAL) {
					segundos = 0;
					minutos++;
				}
				if (minutos > SEXAGESIMAL) {
					minutos = 0;
					horas++;
				}
				if (horas > HORASDIA) {
					horas = 0;
					minutos = 0;
					segundos = 0;
				}
				System.out.println(" --------");
				System.out.printf("|%02d:%02d:%02d|", horas, minutos, segundos);
				System.out.println("\n --------");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

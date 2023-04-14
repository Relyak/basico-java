package ejercicioLista;


public class EjemploList {
	public static void main(String[] args) {

//		ArrayList<String> lista = new ArrayList<String>();
//		lista.add("n1");
//		lista.add("n2");
//		for (String a : lista) {
//			System.out.println(a);
//		}
//		lista.trimToSize();// Esto cierra el tamaño, pero si usas un add lo vuelves a abrir cuestion
//							// interna basicamente
//		lista.add("aa");
//		for (String a : lista) {
//			System.out.println(a);
//		}

		// LINKEDLIST e ITERADOR

//		LinkedList<Personita> lista = new LinkedList<Personita>();
//		lista.add(new Personita("Juan", "Garcias"));
//		lista.add(new Personita("Maria", "Gracias"));
//		ListIterator<Personita> it = lista.listIterator();
//		String nombre;
//		while (it.hasNext()) {
//			nombre = it.next().getNom();
//			System.out.println(nombre);
//		}

		// HASHSET TE LO ORDENA POR SU HASH INTERNO

		// no deja hacer esto: Collections.sort(hs);
//		HashSet<Integer> hs = new HashSet<Integer>();
//		for (int i = 1; i < 10000; i++) {
//			hs.add(i);
//		}
//		for (int a : hs) {
//			System.out.println(a);
//		}

		// TreeSet

		// TE ORDENA ALFABETICAMENTE

//		Set<String> ts = new TreeSet<String>();
//		ts.add("zawaaaaa");// 3
//		ts.add("zzbbbb");// 4
//		ts.add("cacccc");// 2
//		ts.add("aaa");// 1
//		for (String i : ts) {
//			System.out.println(i);
//		}

		// HASHMAP

//		HashMap<String, Personita> mapa = new HashMap<String, Personita>();
//		mapa.put("persona1", new Personita("jaun", "migue"));
//		// si ponemos la mismaclave, sobrescribimos, sin la siguiente linea mostraría
//		// jaun, usando la misma clave
//		mapa.put("persona1", new Personita("Nombremigue", "apellidoMigue"));
//		mapa.put("persona2", new Personita("xxx", "2222"));
//		mapa.put("persona4", new Personita("131", "xaxs"));
//		String clave;
//		Personita valor;
//		// para recorrer la clave y el valor
//		for (HashMap.Entry<String, Personita> entrada : mapa.entrySet()) {
//			clave = entrada.getKey();
//			valor = entrada.getValue();
//			System.out.println(clave + ": " + valor.getNom() + " " + valor.getAp());
//		}

	}

}

class Personita {
	private String nom;
	private String ap;

	public Personita(String nom, String ap) {
		this.nom = nom;
		this.ap = ap;
	}

	public String getNom() {
		return nom;
	}

	public String getAp() {
		return ap;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setAp(String ap) {
		this.ap = ap;
	}

}

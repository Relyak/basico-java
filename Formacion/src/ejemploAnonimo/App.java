package ejemploAnonimo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;


public class App implements Operacion{

	public void ordenar() {
		List<String> lis = new ArrayList<String>();
		
		lis.add("Kayler");
		lis.add("Kaylord");
		lis.add("Relyak");
		/*
		Collections.sort(lis,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		});*/
		//Collections.sort(lis, (o1, o2) -> o1.compareTo(o2));

		/*for(String a : lis) {
			System.out.println(a);
		}*/
		//lambda2
		//lis.forEach(l->System.out.println(l));
		//lambda ::
		//lis.forEach(System.out::println);
		//stream
		//lis.stream().sorted(Comparator.reverseOrder()).forEach(l->System.out.println(l));
		//lis.stream().limit(2).forEach(l->System.out.println(l));
		//lis.stream().filter(null);
	}
	public static void main(String[] args) {
		//ejemplo lambda
		/*
		//entera
		Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
            	System.out.println("a");
            }
        });
        thread.start();
        //Lambda
	    new Thread(() -> {
           System.out.println("a");
        }).start();
	*/
		App a=new App();
		a.ordenar();
		a.calcular(1, 2);
		a.calcular();
		Function<String,Integer>s = (String x)->{
			return x.length();
		};
		Integer b = s.apply("Palabra super larga");
		System.out.println(b);
		
		
		
	}
	public void calcular() {
		Operacion op = new Operacion(){
	
			@Override
			public int calcular(int a, int b) {
				// TODO Auto-generated method stub
				
				return a+b;
			
			}
	
			
		};
		System.out.println(op.calcular(2, 3));
		//en lambda
		Operacion op2 = (a,b)->(a+b);
		System.out.println(op.calcular(2, 2));
	}

	@Override
	public int calcular(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}

package singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton b=Singleton.getInstance();
		Singleton x=Singleton.getInstance();
		boolean val;
		b.setMgs("aaaaaaaaaaa");
		
		System.out.println(x.getMgs());
		
		val=b instanceof Singleton;
		System.out.println(val);
		
		
	}

}

package singleton;

public class Singleton {
	private String mgs;
	
	public String getMgs() {
		return mgs;
	}

	public void setMgs(String mgs) {
		this.mgs = mgs;
	}

	private Singleton() {
	}
	
	public static Singleton instance;

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();

		}
		return instance;
	}
	
}

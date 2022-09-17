package week2.lap5.prog1;


public class MySingleton {

	public static int count = 0;
	private static MySingleton instance = new MySingleton();
	private MySingleton() {
		count++;
	}
	
	synchronized public static MySingleton getInstance() {
		return instance;
		
	}

}

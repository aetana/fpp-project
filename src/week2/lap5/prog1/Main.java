package week2.lap5.prog1;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i < 10; ++i) {
			MySingleton.getInstance();
		}
		System.out.println(MySingleton.count);

	}

}

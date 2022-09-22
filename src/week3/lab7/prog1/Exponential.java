package week3.lab7.prog1;

public class Exponential {
	
	double power(double x, int n) {
		if( n > 0 ) return x * power(x, n-1);
		return 1;
	}
	
	public static void main(String[] args) {
		Exponential e = new Exponential();
		System.out.println(e.power(2, 0));
	}

}

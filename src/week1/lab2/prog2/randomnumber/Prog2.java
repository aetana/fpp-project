package week1.lab2.prog2.randomnumber;


public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. get a random number x in the range 1 .. 9 and compute πx.
		int x = RandomNumbers.getRandomInt(0, 9) ;
		double pipowx = Math.pow(Math.PI, x);
		
		System.out.println("PI power of "+ x +" = "+ pipowx);
		//2. get a random number y in the range 3 .. 14 and compute yπ.
		int y = RandomNumbers.getRandomInt(3, 14) ;
		double ypowpi = Math.pow(y , Math.PI);
		System.out.println( y + " power of PI  = "+ ypowpi);
	}

}

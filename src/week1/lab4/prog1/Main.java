package week1.lab4.prog1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor prof1 = new Professor("Ankhtuya Ochirbat", 15_000);
		Professor prof2 = new Professor("Paul Corazza", 12_000);
		Professor prof3 = new Professor("Gregory Guthrie", 10_000);

		Secretary secr1 = new Secretary("Amanuel Etana", 8_000);
		Secretary secr2 = new Secretary("Samuel John", 8_000);

		DeptEmployee[] department = new DeptEmployee[5];

		department[0] = prof1;
		department[1] = prof2;
		department[2] = prof3;
		department[3] = secr1;
		department[4] = secr2;

		String input;
		System.out.println("Would like to see how much the combined SUM of all department employee make?");
		System.out.println("Pres Y for YES!");

		Scanner c = new Scanner(System.in);
		input = c.next();
		if (input.equalsIgnoreCase("y")) {
			double sum = 0;
			for (DeptEmployee e : department) {
				sum += e.computeSalary();
			}
			System.out.println("SUM of all the salaaries in this departmetnis : " + sum);
		}

	}

}

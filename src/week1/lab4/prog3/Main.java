package week1.lab4.prog3;

import java.util.Scanner;

import week1.lab4.prog3.employeeinfo.Employee;

public class Main {
	Employee[] emps = null;

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		emps = new Employee[4];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);
		emps[3] = new Employee("Amanuel Abebe", 1989, 11, 18);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);
		emps[3].createNewSavings(12500);
		emps[3].createNewRetirement(12500);
				
		Scanner sc = new Scanner(System.in);
		System.out.println("A. See a report of all accounts.");
		System.out.println("B. Make a deposit.");
		System.out.println("C. Make a withdrawal.");
		System.out.println("Make a selection (A/B/C):");

		String choice = sc.next();
		Employee selectedEmployee;
		String employeeAccList;

		if (choice.equalsIgnoreCase("a")) {
			String info = getFormattedAccountInfo();
			System.out.println(info);
		} else if (choice.equalsIgnoreCase("b")) {
			// code to Make a deposit.
			int index = 0;
			for (Employee e : emps) {
				System.out.println(index + ". " + e.getName());
				index++;
			}

			System.out.println("Select an employee: (type a number)");
			int inputIndex = sc.nextInt();
			checkInput(inputIndex);
			
			selectedEmployee = emps[inputIndex];
			employeeAccList = formatEmployeeAccountList(selectedEmployee.getNamesOfAccounts());
			System.out.print(employeeAccList);
			System.out.println("Select account type: (type a number)");

			inputIndex = sc.nextInt();
			checkInput(inputIndex);
			
			System.out.println("Deposit amount:");
			double depositAmount = sc.nextDouble();
			selectedEmployee.deposit(inputIndex, depositAmount);
			System.out.println(depositAmount 	+ " has been deposited in the\r\n"
								+ "Savings Account of " + selectedEmployee.getName() );
			
		} else if (choice.equalsIgnoreCase("c")) {
			// code to Make a Withdrawal.
			int index = 0;
			for (Employee e : emps) {
				System.out.println(index + ". " + e.getName());
				index++;
			}

			System.out.println("Select an employee: (type a number)");
			int inputIndex = sc.nextInt();
			checkInput(inputIndex);
			selectedEmployee = emps[inputIndex];
			employeeAccList = formatEmployeeAccountList(selectedEmployee.getNamesOfAccounts());
			System.out.print(employeeAccList);
			System.out.println("Select account type: (type a number)");

			inputIndex = sc.nextInt();
			checkInput(inputIndex);
			System.out.println("Withdrawal amount:");
			double depositAmount = sc.nextDouble();
			selectedEmployee.withdraw(inputIndex, depositAmount);
			System.out.println(depositAmount + " has been deposited in the\r\n" 
							+ "Savings Account of "	+ selectedEmployee.getName());
			

		}

		sc.close();
	}

	String formatEmployeeAccountList(MyStringList list) {
		String display = "";
		for(int i = 0; i < list.size(); i++) {
			display += i + ". " + list.get(i) + "\n";
		}
		return display;
	}
	
	String getFormattedAccountInfo() {

		String display = "";
		for (int i = 0; i < emps.length; i++) {
			display += "Account Info For: " + emps[i].getName() + "\n";
			display += emps[i].getFormatedAccounts() + "\n \n";
		}
		return display;
	}
	
	void checkInput(int input) {
		if(input < 0 || input > 2) {
			System.out.println("The Input is Invalid! Please try other value!");
		}
	}
	
}

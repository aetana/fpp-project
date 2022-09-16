package week1.lab4.prog3.employeeinfo;

public class  Account {

	private final static double INITIAL_BALANCE = 0.0;
	private double balance;
	//private AccountType accountType;
	private Employee employee;

	public Account(Employee emp, double bal) {
		employee = emp;
		//accountType = acctType;
		balance = bal;
	}

	public Account(Employee emp) {
		this(emp, INITIAL_BALANCE);
	}
	
	public Account() {
	}

	// updates the balance field
	public void makeDeposit(double val) {
		this.balance += val;
	};

	// updates the balance field and returns true, unless
	// withdrawal amount is too large; in that case,
	// it does not modify the balance field, and returns false
	public boolean makeWithdrawal(double amount) {
		if(this.balance > amount ) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public String toString() {
		String output = "Account type: " + this.getClass().getSimpleName() + "\nCurrent bal: " + balance + "\n";
		return output;
	}
	
	public AccountType getAccountType() {
		return null;
	};
	
	public double getBalance() {
		return this.balance;
	};

}

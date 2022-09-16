package week1.lab3.prog1;

class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		this.employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	// updates the balance field
	public void makeDeposit(double val) {
		this.balance += val;
	};

	// updates the balance field and returns true, unless
	// withdrawal amount is too large; in that case,
	// it does not modify the balance field, and returns false
	public boolean makeWithdrawal(double amount) {
		if(amount < this.balance) {
			this.balance -= amount;
			return true;
		}
		return false;
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}
	
	public AccountType getAccountType() {
		return this.acctType;
	};
	
	public double getBalance() {
		return this.balance;
	};

}

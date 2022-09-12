package day4.prog2;

class Account {

	private final static double INITIAL_BALANCE = 0.0;
	private double balance;
	private AccountType accountType;
	private Employee employee;

	public Account(Employee emp, AccountType acctType, double bal) {
		employee = emp;
		accountType = acctType;
		balance = bal;
	}

	public Account(Employee emp, AccountType accountType) {
		this(emp, accountType, INITIAL_BALANCE);
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
			balance -= amount;
			return true;
		}
		return false;
	}

	public String toString() {
		String output = "Account type: " + accountType + "\n Current bal: " + balance + "\n";
		return output;
	}
	
	public AccountType getAccountType() {
		return this.accountType;
	};
	
	public double getBalance() {
		return this.balance;
	};

}

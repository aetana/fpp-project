package week1.lab4.prog3.employeeinfo;

public class SavingsAccount extends Account {

	private final double INTEREST_RATE = 0.25;
	public SavingsAccount(Employee employee, double startAmount) {
		// TODO Auto-generated constructor stub
		super(employee, startAmount);
	}

	public AccountType getAccountType() {
		return AccountType.SAVINGS;
	}

	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (INTEREST_RATE / 100) * baseBalance;
		super.makeDeposit(interest);
		return super.getBalance();
	}
	
	public String toString() {
		String output = "Account type: " + getAccountType() + "\nCurrent bal: " + getBalance() + "\n";
		return output;
	}

}

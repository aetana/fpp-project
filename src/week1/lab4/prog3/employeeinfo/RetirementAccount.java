package week1.lab4.prog3.employeeinfo;

public class RetirementAccount extends Account {

	private final double PENALITY_RATE = 0.25;
	
	public RetirementAccount(Employee employee, double startAmount) {
		// TODO Auto-generated constructor stub
		super(employee,startAmount);
	}

	public AccountType getAccountType() {
		return AccountType.RETIREMENT;
	}

	public boolean makeWithdrawal(double amount) {
		double penality = super.getBalance() - super.getBalance() * PENALITY_RATE;
		return super.makeWithdrawal(penality + amount);
	}
	
	public String toString() {
		String output = "Account type: " + getAccountType() + "\nCurrent bal: " + getBalance() + "\n";
		return output;
	}
	
}

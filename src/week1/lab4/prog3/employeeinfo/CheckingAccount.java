package week1.lab4.prog3.employeeinfo;

public class CheckingAccount extends Account {
	
	private static final int SERVIC_ECHARGE = 5;
	public CheckingAccount(Employee employee, double startAmount) {
		// TODO Auto-generated constructor stub
		super(employee,startAmount);
	}

	public AccountType getAccountType() {
		return AccountType.CHECKING;
	}
	
	public double getBalance() {
		super.makeDeposit(SERVIC_ECHARGE);
		return super.getBalance();
	};
	
	public String toString() {
		String output = "Account type: " + getAccountType() + "\nCurrent bal: " + getBalance() + "\n";
		return output;
	}

}

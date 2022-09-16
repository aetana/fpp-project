package week1.lab3.prog2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Employee {
	// instance fields
	private String name;
	private Account checkingAcct;
	private Account savingAcct;
	private Account retirementAcct;
	private LocalDate hireDay;

	public static final String DATE_PATTERN = "MM/dd/yyyy";

	// constructor
	public Employee(String name, int yearOfHire, int montOfHire, int dayOfHire) {
		this.name = name;
		this.hireDay = LocalDate.of(yearOfHire, montOfHire, dayOfHire);

	}

	public void createNewChecking(double startAmount) {
		this.checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		this.savingAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		this.retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public void deposit(AccountType acctType, double amt) {
		if(acctType == AccountType.CHECKING) {
			this.checkingAcct.makeDeposit(amt);
		}else if(acctType == AccountType.SAVINGS) {
			this.savingAcct.makeDeposit(amt);
		} else if(acctType == AccountType.RETIREMENT) {
			this.retirementAcct.makeDeposit(amt);
		}
	}

	public boolean withdraw(AccountType acctType, double amt) {
		if(acctType == AccountType.CHECKING) {
			return this.checkingAcct.makeWithdrawal(amt);
		}else if(acctType == AccountType.SAVINGS) {
			return this.savingAcct.makeWithdrawal(amt);
		} else if(acctType == AccountType.RETIREMENT) {
			return this.retirementAcct.makeWithdrawal(amt);
		}else {
			return false;
		}

	}

	public String getFormattedAcctInfo() {
		String output = "";
		
		if(this.checkingAcct != null) {
			output += this.checkingAcct.toString();
		}
		if(this.savingAcct != null) {
			output += this.savingAcct.toString();
		}
		if(this.retirementAcct != null) {
			output += this.retirementAcct.toString();
		}
		return output;
	}

	public String getName() {
		return this.name;
	}
	public String getHireDate() {
		return this.hireDay.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
	}

	public String toString() {
		return this.name;
	}
	
	
}

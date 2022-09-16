package week1.lab4.prog3.employeeinfo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import week1.lab4.prog3.AccountList;
import week1.lab4.prog3.MyStringList;

public class Employee {
	// instance fields
	private String name;
	// private Account checkingAcct;
	// private Account savingAcct;
	// private Account retirementAcct;
	private AccountList accounts;
	private LocalDate hireDay;

	public static final String DATE_PATTERN = "MM/dd/yyyy";

	// constructor
	public Employee(String name, int yearOfHire, int montOfHire, int dayOfHire) {
		this.name = name;
		this.accounts = new AccountList();
		this.hireDay = LocalDate.of(yearOfHire, montOfHire, dayOfHire);

	}

	public void createNewChecking(double startAmount) {
		// this.checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
		Account acct = new CheckingAccount(this, startAmount);
		// accounts is the name of the AccountList variable
		accounts.add(acct);
	}

	public void createNewSavings(double startAmount) {
		// this.savingAcct = new Account(this, AccountType.SAVINGS, startAmount);
		Account acct = new SavingsAccount(this, startAmount);
		// accounts is the name of the AccountList variable
		accounts.add(acct);
	}

	public void createNewRetirement(double startAmount) {
		// this.retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
		// this.checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
		Account acct = new RetirementAccount(this, startAmount);
		// accounts is the name of the AccountList variable
		accounts.add(acct);
	}

	public void deposit(int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex);
		if (selected == null)
			System.out.println("You entered invalid choise Plese try again.");
		selected.makeDeposit(amt);
	}

	public boolean withdraw(int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex);
		if (selected == null) {
			System.out.println("You entered invalid choise Plese try again.");
			return false;
		}
		return selected.makeWithdrawal(amt);

	}

	public MyStringList getNamesOfAccounts(){
		MyStringList namesAcc = new MyStringList();
		for(int i = 0; i < accounts.size(); ++i){
			namesAcc.add(accounts.get(i).getAccountType().toString().toLowerCase());
		}
		return namesAcc;
	}
	
	public String getFormatedAccounts() {
		String output = "";
		for (int i = 0; i < accounts.size(); i++) {
			output += i + ". " + accounts.get(i).getAccountType()
						+ "\tCurrent bal: " + accounts.get(i).getBalance() 
						+ "\n"; 
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
		return accounts.toString();
	}

}

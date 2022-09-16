package week1.lab3.prog1;


public class Main {

	public static void main(String[] args) {
		Employee sampleEmp = new Employee("Amanuel Etana", "emanuel", 120_000D, 2022, 9, 9);
		Account checkingAccount = new Account(sampleEmp, AccountType.CHECKING, 300);
		Account savingAccount = new Account(sampleEmp, AccountType.SAVINGS, 300);
		Account retirementAccount = new Account(sampleEmp, AccountType.RETIREMENT, 300);
		
		Account[] sampleEmpAccounts = new Account[]{checkingAccount, savingAccount, retirementAccount};
		
		for(Account act: sampleEmpAccounts) {
			System.out.println(act.toString());
		}

	}

}

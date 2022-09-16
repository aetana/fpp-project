package week1.lab4.prog3;

import java.util.Arrays;
import week1.lab4.prog3.employeeinfo.*;

public class AccountList {
	
	private final int INITIAL_LENGTH = 3;
	private Account[] accounts;
	private int size;

	public AccountList() {
		accounts = new Account[INITIAL_LENGTH];
		size = 0;
	}

	public void add(Account s) {
		// implement
		if (accounts.length <= size())
			resize();
		accounts[size()] = s;
		size++;
	}

	public Account get(int i) {
		// implement
		if (i < 0 || i > size)
			return null;
		return accounts[i];
	}

	public boolean find(Account s) {
		// implement
		for (Account str : accounts) {
			if (str.equals(s))
				return true;
		}
		return false;
	}

	public void insert(Account s, int pos) {
		// implement
		if (pos < 0 || pos > accounts.length) {
			System.out.println("Invald Pos! Can not Insert!");
			return ;
		}
			
		if (accounts.length < size()+1)
			resize();

		if (pos >= size()) {
			accounts[pos] = s;
			size++;
		} else {
			System.arraycopy(accounts, pos, accounts, pos + 1, size() - pos);
			size++;
		}

	}

	public boolean remove(Account s) {
		// implement
		Account accountNew[] = new Account[accounts.length];
		int newIndex = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].equals(s)) {
				for (int j = 0; j < accounts.length; j++) {
					if (j != i) {
						accountNew[newIndex] = accounts[j];
						newIndex++;
					}
				}
				accounts = accountNew;
				size--;
				return true;
			}
		}
		return false;

	}

	private void resize() {
		// implement
		Account accountNew[] = new Account[accounts.length * 2];
		System.arraycopy(accounts, 0, accountNew, 0, size());
		accounts = accountNew;
	}

	public String toString() {
		String output = "";
		output += "[" + accounts[0];
		for (int i = 1; i < size() ; i++) {
			output += ", " + accounts[i];
		}
		output += "]";
		return output;
	}

	public int size() {
		return size;
	}

}

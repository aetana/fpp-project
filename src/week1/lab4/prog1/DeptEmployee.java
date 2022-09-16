package week1.lab4.prog1;

import java.time.LocalDate;


public class DeptEmployee {
	String name;
	double salary;
	LocalDate hireDate;

	public static final String DATE_PATTERN = "MM/dd/yyyy";
	public DeptEmployee() {
	}

	public DeptEmployee(String name) {
		this.name = name;
		this.hireDate = LocalDate.now();
	}
	
	public DeptEmployee(String name, float salary) {
		this.name = name;
		this.salary = salary;
		this.hireDate = LocalDate.now();
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHigherDate() {
		return hireDate;
	}

	public void setHigherDate(LocalDate higherDate) {
		this.hireDate = higherDate;
	}

	public double computeSalary() {
		return salary;
	}
}

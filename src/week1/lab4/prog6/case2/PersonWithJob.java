package week1.lab4.prog6.case2;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	@Override
	public boolean equals(Object withJob) {
		if(withJob == null) return false;
		if(!(withJob instanceof Person)) return false;
		PersonWithJob pwj = (PersonWithJob)withJob;
		return pwj.getName().equals(this.getName()) && ( pwj.getDateOfBirth().equals(this.getDateOfBirth()) ) && (pwj.salary == salary);
	}
	
}

package week1.lab4.prog6.case3;

import java.util.GregorianCalendar;

public class PersonWithJob {
	private double salary;
	public Person person;
	
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		person = new Person(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	@Override
	public boolean equals(Object ob) {
		if (ob == null) return false;
		if (ob.getClass() != getClass()) return false;
		PersonWithJob pwj = (PersonWithJob) ob;
		return (pwj.person.equals(person) && pwj.salary == this.salary);	
	}
	
	
}

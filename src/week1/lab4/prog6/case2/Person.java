package week1.lab4.prog6.case2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar)dateOfBirth.clone();
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Person)) return false;
		Person p = (Person)ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}
	
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}
	
	public static void main(String[] args) {
		
		GregorianCalendar pDob1 = new GregorianCalendar(1999, Calendar.DECEMBER, 31);
		GregorianCalendar pDob2 = new GregorianCalendar(1999, Calendar.DECEMBER, 31);
		
		Person p1 = new PersonWithJob("Joe", pDob1, 12500);
		Person p2 = new PersonWithJob("Joe", pDob2, 10500);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		//System.out.println(p1.this.equals(p2)); //Question for Ankutia

	}

}

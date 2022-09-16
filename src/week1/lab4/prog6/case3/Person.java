package week1.lab4.prog6.case3;

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
		// TODO Auto-generated method stub
		GregorianCalendar pDob1 = new GregorianCalendar(1999, Calendar.DECEMBER, 31);
		GregorianCalendar pDob2 = new GregorianCalendar(1999, Calendar.DECEMBER, 31);
		
		PersonWithJob pwj1 = new PersonWithJob("Joe", pDob1, 12500);
		PersonWithJob pwj2 = new PersonWithJob("Joe", pDob2, 12500);
		
		Person p1 = new Person("Joe", pDob1);
		Person p2 = new Person("Joe", pDob2);
		
		//System.out.println(pwj1 == pwj2);
		System.out.println(pwj1.equals(pwj2));	// equal() of PersonWithJob is executed
		System.out.println(p1.equals(p2)); 		// equal() of Person is executed

	}

}

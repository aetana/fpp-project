package week4.lab11.prog1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap salaryRecord;
	
	public void addEntry(String date, double salary) {
		//implement
		if(salaryRecord == null) {
			salaryRecord = new HashMap<String, Double>();
		}
		salaryRecord.put(date, salary);
	}
	public void printPaymentAmount(String date) {
		//implement
		System.out.println(salaryRecord.get(date));
		
	}
	public void printAveragePaycheck() {
		//implement
		double sum = 0;
		Iterator sRIterator = salaryRecord.entrySet().iterator();
		while(sRIterator.hasNext()) {
			Map.Entry mapEle = (Map.Entry)sRIterator.next();
			sum += (double)mapEle.getValue();
			//double salary = (double)mapEle.getValue();
			//String date = (String)mapEle.getKey();
			//System.out.println(date +" : "+salary);
		}
		System.out.println("Avarage : "+ sum/salaryRecord.size());
	}
	
		
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 1; i <= 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

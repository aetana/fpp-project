package day2.prog1;

/**
 * @author Amanuel Etana 
 * Sep 2022
 * 
 *
 */
public class Customer {
	
	private String firstName;
	private String lastName;
	private String socSecurityNum;
	private Address billingAddress;
	private Address shippingAddress;
	
	public Customer(String fName, String lName, String sSNum) {
		firstName = fName;
		lastName = lName;
		socSecurityNum = sSNum;
	}
	
	public Customer() { //default constructor
	}
	
	/** Provides a string representation of this Customer */
	public String toString() {
		return "[" + firstName + ", " + lastName + ", ssn: " + socSecurityNum + "]";
	}
	
	
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address home) {
		this.billingAddress = home;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address work) {
		this.shippingAddress = work;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getSocSecurityNum() {
		return socSecurityNum;
	}
	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}
	
}

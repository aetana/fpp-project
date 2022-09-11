package day2.prog1;



/**
 * @author Amanuel Etana 
 * Sep 2022
 * 
 *
 */
public class Main {

	public static void main(String[] args) {
		Address add1A = new Address("10 Adams", "Fairfield", "IA", "52556");
		Address add1B = new Address("110 Burlington", "Fairfield", "IA", "52556");
		Address add2A = new Address("3018 W North Ave", "Chicago", "IL", "60647");
		Address add2B = new Address("298 N Orchard Dr", "Chicago", "IL", "60440"); 
		Address add3A = new Address("322 Harrison", "Fairfield", "IA", "52556");
		Address add3B = new Address("2210 Burlington", "Fairfield", "IA", "52556");
		
		Customer cust1 = new Customer("Amanuel", "Etana", "123-456-7890");
		Customer cust2 = new Customer("Gedeon", "Tona", "456-123-7890");
		Customer cust3 = new Customer("Hana", "Belachewu", "789-123-4560");
		
		cust1.setBillingAddress(add1A);
		cust1.setShippingAddress(add1B);
		cust2.setBillingAddress(add2A);
		cust2.setShippingAddress(add2B);
		cust3.setBillingAddress(add3A);
		cust3.setShippingAddress(add3B);
		
		Customer list [] = {cust1,cust2,cust3};
		
		for(int i = 0; i < list.length; i++) {
			if(list[i].getBillingAddress().getCity().equals("Chicago")){
				System.out.println(list[i].toString());
			}
		}	
		
	}

}

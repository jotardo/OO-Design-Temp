package lab2;

import java.util.LinkedList;

public class EVNComDivision {
	
	private String divisionName;
	private LinkedList<Customer> customers;
	
	public EVNComDivision(String name) {
		this.divisionName = name;
		this.customers = new LinkedList<Customer>();
	}
	
	public void register(Customer c) {
		this.customers.add(c);
	}
	
	public String printAllInvoice() {
		String result = "";
		return result;
	}
}

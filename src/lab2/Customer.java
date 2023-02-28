package lab2;

import java.util.List;

public abstract class Customer {
	
	protected String customerID;
	protected String customerName;
	protected String customerAddress;
	
	public Customer(String id, String fullName, String address) {
		this.customerID = id;
		this.customerName = fullName;
		this.customerAddress = address;
	}
	
	public String toString() {
		return customerID + "\t\t" + customerName + "\t\t" + customerAddress;
	}
	
	public abstract List<? extends Reading> getReading();
	
	public abstract int calculatePrice();
	
	public abstract String printBills();

}

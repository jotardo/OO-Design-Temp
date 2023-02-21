package lab2;

import java.util.ArrayList;

public abstract class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerAddress;

	protected Customer(int customerID, String customerName, String customerAddress) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}

	public abstract int charge();

	public abstract void statement();

	public abstract ArrayList<? extends Reading> getReadings();

	public Reading getNewReading() {
		return getReadings().get(getReadings().size() - 1);
	}

	public Reading getOldReading() {
		return getReadings().get(getReadings().size() - 2);
	}
}

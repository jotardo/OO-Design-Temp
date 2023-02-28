package lab2;

import java.util.LinkedList;
import java.util.List;

public class BusinessCustomer extends Customer {
	
	private String bankAccount;
	private List<ThreeReading> readingList;
	
	public BusinessCustomer(String id, String fullName, String address, String bankAccount, LinkedList<ThreeReading> readingList) {
		super(id, fullName, address);
		this.bankAccount = bankAccount;
		this.readingList = readingList;
	}

	public BusinessCustomer(String id, String fullName, String address, String bankAccount) {
		this(id, fullName, address, bankAccount, new LinkedList<ThreeReading>());
	}

	public List<ThreeReading> getReading() {
		return readingList;
	}
	
	public void addReading(ThreeReading reading) {
		this.readingList.add(reading);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t\t" + this.bankAccount;
	}

	@Override
	public int calculatePrice() {
		int newRead = readingList.get(readingList.size() - 1).normalValue;
		int oldRead = readingList.get(readingList.size() - 2).normalValue;
		int amount = newRead - oldRead;
		int p1 = amount > 100 ? 100 : amount;
		int p2 = amount > 150 ? 150 : amount - p1;
		int p3 = amount > 200 ? 200 : amount - p1 - p2 ;
		int p4 = amount > 300 ? 300 : amount - p1 - p2 - p3;
		int p5 = amount - p1 - p2 - p3 - p4;
		return p1 * 550 + p2 * 900 + p3 * 1210 + p4 * 1340 + p5 * 1400;
	}

	@Override
	public String printBills() {
		// TODO Auto-generated method stub
		return null;
	}

}

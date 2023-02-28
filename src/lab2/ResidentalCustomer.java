package lab2;

import java.util.LinkedList;
import java.util.List;

public class ResidentalCustomer extends Customer {

	private List<OneReading> readingList;

	public ResidentalCustomer(String id, String fullName, String address, LinkedList<OneReading> readingList) {
		super(id, fullName, address);
		this.readingList = readingList;
	}

	public ResidentalCustomer(String id, String fullName, String address) {
		this(id, fullName, address, new LinkedList<OneReading>());
	}

	public List<OneReading> getReading() {
		return readingList;
	}
	
	public void addReading(OneReading reading) {
		this.readingList.add(reading);
	}

	@Override
	public int calculatePrice() {
		int newRead = readingList.get(readingList.size() - 1).normalValue;
		int oldRead = readingList.get(readingList.size() - 2).normalValue;
		int amount = newRead - oldRead;
		int p1 = amount > 100 ? 100 : amount;
		int p2 = amount > 150 ? 150 : amount - p1;
		int p3 = amount > 200 ? 200 : amount - p1 - p2;
		int p4 = amount > 300 ? 300 : amount - p1 - p2 - p3;
		int p5 = amount - p1 - p2 - p3 - p4;
		return p1 * 550 + p2 * 900 + p3 * 1210 + p4 * 1340 + p5 * 1400;
	}

	@Override
	public String printBills() {
		return "Ma KH : " + this.customerID + " - Ten KH : " + this.customerName + " - Dia Chi " + this.customerAddress
				+ "\n\t Chi so moi : " + readingList.get(readingList.size() - 1).normalValue + " - Chi so cu : "
				+ readingList.get(readingList.size() - 2).normalValue + " - Tien dien : " + calculatePrice();
	}

}

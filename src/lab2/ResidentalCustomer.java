package lab2;

import java.util.ArrayList;
import java.util.List;

public class ResidentalCustomer extends Customer {

	private ArrayList<OneReading> readingList;

	public ResidentalCustomer(int customerID, String customerName, String customerAddress) {
		super(customerID, customerName, customerAddress);
		this.readingList = new ArrayList<OneReading>();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResidentalCustomer [customerName=").append(customerName).append(", customerAddress=")
				.append(customerAddress).append("]");
		return builder.toString();
	}

	@Override
	public int charge() {
		int elecIndex = getNewReading().electricityIndex - getOldReading().electricityIndex;
		int s1 = (elecIndex < 100) ? elecIndex : 100;
		int s2 = (elecIndex < 150) ? elecIndex - s1 : 50;
		int s3 = (elecIndex < 200) ? elecIndex - s1 - s2 : 50;
		int s4 = (elecIndex < 300) ? elecIndex - s1 - s2 - s3 : 100;
		int s5 = elecIndex - s1 - s2 - s3 - s4;
		return s1 * 550 + s2 * 900 + s3 * 1210 + s4 * 1340 + s5 * 1400;
	}

	@Override
	public void statement() {
		System.out.println();

	}

	@Override
	public ArrayList<? extends Reading> getReadings() {
		return this.readingList;
	}

	public void addReading(OneReading r) {
		if (r == null)
			return;
		this.readingList.add(r);
	}

}

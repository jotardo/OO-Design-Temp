package lab2;

import java.util.ArrayList;
import java.util.List;

public class BusinessCustomer extends Customer{
	
	private long accountID;
	private ArrayList<ThreeReading> readingList;

	public BusinessCustomer(int customerID, String customerName, String customerAddress, long accountID) {
		super(customerID, customerName, customerAddress);
		this.accountID = accountID;
		this.readingList = new ArrayList<ThreeReading>();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BusinessCustomer [accountID=").append(accountID).append(", customerName=").append(customerName)
				.append(", customerAddress=").append(customerAddress).append("]");
		return builder.toString();
	}

	@Override
	public int charge() {
		ThreeReading newReading = this.readingList.get(this.readingList.size() - 1);
		ThreeReading oldReading = this.readingList.get(this.readingList.size() - 2);
		int usageNormal = newReading.electricityIndex - oldReading.electricityIndex;
		int usageHigh = newReading.getHighIndex() - oldReading.getHighIndex();
		int usageLow = newReading.getLowIndex() - oldReading.getLowIndex();
		return usageNormal * 895 + usageHigh * 1480 + usageLow * 505;
	}

	@Override
	public void statement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<? extends Reading> getReadings() {
		return this.readingList;
	}
	
	public void addReading(ThreeReading r) {
		if (r == null)
			return;
		this.readingList.add(r);
	}
}

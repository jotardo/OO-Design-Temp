package lab2;

public class OneReading extends Reading{

	public OneReading(Date dayOfReading, int electricityIndex) {
		super(dayOfReading, electricityIndex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OneReading [dayOfReading=").append(dayOfReading).append(", electricityIndex=")
				.append(electricityIndex).append("]");
		return builder.toString();
	}

}

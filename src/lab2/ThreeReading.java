package lab2;

public class ThreeReading extends Reading {

	private int highIndex; //rush time elec index
	
	public int getHighIndex() {
		return highIndex;
	}

	public int getLowIndex() {
		return lowIndex;
	}

	private int lowIndex; //inactive time elec index
	
	public ThreeReading(Date dayOfReading, int electricityIndex, int highIndex, int lowIndex) {
		super(dayOfReading, electricityIndex);
		this.highIndex = highIndex;
		this.lowIndex = lowIndex;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ThreeReading [highIndex=").append(highIndex).append(", lowIndex=").append(lowIndex)
				.append(", dayOfReading=").append(dayOfReading).append(", electricityIndex=").append(electricityIndex)
				.append("]");
		return builder.toString();
	}


}

package lab2;

public abstract class Reading {
	protected Date dayOfReading;
	protected int electricityIndex;
	protected Reading(Date dayOfReading, int electricityIndex) {
		super();
		this.dayOfReading = dayOfReading;
		this.electricityIndex = electricityIndex;
	}
}

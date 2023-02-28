package lab2;

import java.text.DateFormat;
import java.util.Date;

public class ThreeReading extends Reading {

	private int highValue;
	private int lowValue;
	
	public ThreeReading(Date readingDate, int normalValue, int highValue, int lowValue) {
		super(readingDate, normalValue);
		this.highValue = highValue;
		this.lowValue = lowValue;
	}
	
	public String toString() {
		return DateFormat.getInstance().format(readingDate) + "\t\t" + this.normalValue + "\t\t" + this.highValue + "\t\t" + this.lowValue;
	}

}

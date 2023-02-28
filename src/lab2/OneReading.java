package lab2;

import java.text.DateFormat;
import java.util.Date;

public class OneReading extends Reading {

	public OneReading(Date readingDate, int normalValue) {
		super(readingDate, normalValue);
	}
	
	@Override
	public String toString() {
		return DateFormat.getInstance().format(readingDate) + "\t\t" + this.normalValue;
	}

}

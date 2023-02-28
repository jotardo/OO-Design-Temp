package lab2;

import java.util.Date;

public abstract class Reading {
	
	protected Date readingDate;
	protected int normalValue;
	
	public Reading(Date readingDate, int normalValue) {
		super();
		this.readingDate = readingDate;
		this.normalValue = normalValue;
	}
	
	public int getNormalValue() {
		return normalValue;
	}
	
	
}

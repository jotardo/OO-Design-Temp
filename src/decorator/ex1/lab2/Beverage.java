package decorator.ex1.lab2;

public abstract class Beverage {
	protected String description;
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}

package decorator.ex1.lab2;

public abstract class CondimentDecorator extends Beverage{
	protected Beverage beverage;

	public CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public abstract String getDescription();
}

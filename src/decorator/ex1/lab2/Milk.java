package decorator.ex1.lab2;

public class Milk extends CondimentDecorator{

	public Milk(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " + Milk";
	}

	@Override
	public double cost() {
		return 0.1 + this.beverage.cost();
	}

}

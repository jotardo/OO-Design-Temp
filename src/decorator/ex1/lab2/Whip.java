package decorator.ex1.lab2;

public class Whip extends CondimentDecorator{

	public Whip(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " + Whip";
	}

	@Override
	public double cost() {
		return 0.1 + this.beverage.cost();
	}

}

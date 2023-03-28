package decorator.ex1.lab2;

public class Mocha extends CondimentDecorator{

	public Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " + Mocha";
	}

	@Override
	public double cost() {
		return 0.2 + this.beverage.cost();
	}

}

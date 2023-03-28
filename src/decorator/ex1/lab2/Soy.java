package decorator.ex1.lab2;

public class Soy extends CondimentDecorator{

	public Soy(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " + Soy";
	}

	@Override
	public double cost() {
		return 0.15 + this.beverage.cost();
	}

}

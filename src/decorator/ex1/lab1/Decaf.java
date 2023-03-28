package decorator.ex1.lab1;

public class Decaf extends Beverage {
	public Decaf() {
		setDescription("Decaffeinated Coffee");
	}

	@Override
	public double cost() {
		return 1.05 + super.cost();
	}
}

package decorator.ex1.lab1;

public class Espresso extends Beverage {
	public Espresso() {
		setDescription("Espresso");
	}

	@Override
	public double cost() {
		return 1.989 + super.cost();
	}
}

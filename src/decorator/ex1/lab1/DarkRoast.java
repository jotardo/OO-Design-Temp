package decorator.ex1.lab1;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		setDescription("Dark Roasted Coffee");
	}

	@Override
	public double cost() {
		return 0.99 + super.cost();
	}
}

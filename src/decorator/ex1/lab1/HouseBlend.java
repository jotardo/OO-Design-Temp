package decorator.ex1.lab1;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		setDescription("House Blend Coffee");
	}

	@Override
	public double cost() {
		return 0.89 + super.cost();
	}
}

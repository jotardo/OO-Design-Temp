package decorator.ex1.lab2;

public class DarkRoast extends Beverage{
	
	public DarkRoast() {
		this.description = "Dark Roasted Coffee";
	}

	@Override
	public double cost() {
		return 0.99;
	}

}

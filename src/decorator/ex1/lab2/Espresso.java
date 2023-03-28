package decorator.ex1.lab2;

public class Espresso extends Beverage{
	
	public Espresso() {
		this.description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.989;
	}

}

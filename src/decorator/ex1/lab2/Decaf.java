package decorator.ex1.lab2;

public class Decaf extends Beverage{
	
	public Decaf() {
		this.description = "Decaffeinated Coffee";
	}

	@Override
	public double cost() {
		return 1.05;
	}

}

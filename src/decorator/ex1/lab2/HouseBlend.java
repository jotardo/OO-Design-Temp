package decorator.ex1.lab2;

public class HouseBlend extends Beverage{
	
	public HouseBlend() {
		this.description = "House Blended Coffee";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}

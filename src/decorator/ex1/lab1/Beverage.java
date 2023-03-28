package decorator.ex1.lab1;

public class Beverage {
	private String description;
	private boolean milk;
	private boolean soy;
	private boolean mocha;
	private boolean whip;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean hasMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public boolean hasSoy() {
		return soy;
	}

	public void setSoy(boolean soy) {
		this.soy = soy;
	}

	public boolean hasMocha() {
		return mocha;
	}

	public void setMocha(boolean mocha) {
		this.mocha = mocha;
	}

	public boolean hasWhip() {
		return whip;
	}

	public void setWhip(boolean whip) {
		this.whip = whip;
	}
	
	public double cost() {
		double result = 0;
		if (hasMilk()) result += 0.1;
		if (hasSoy()) result += 0.15;
		if (hasMocha()) result += 0.2;
		if (hasWhip()) result += 0.1;
		return result;
	}

}

package on_tap.cau6;

public class OverseasTour extends Tour{
	
	private String country;
	private double visaSurtax;

	public OverseasTour(String name, String description, int days, double basePrice, String country, double visaSurtax) {
		super(name, description, days, basePrice);
		this.country = country;
		this.visaSurtax = visaSurtax;
	}

	@Override
	public double price() {
		return basePrice * days + visaSurtax;
	}

}

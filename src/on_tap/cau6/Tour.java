package on_tap.cau6;

public abstract class Tour implements TourImplement{
	protected String name;
	protected String description;
	protected int days;
	protected double basePrice;

	public Tour(String name, String description, int days, double basePrice) {
		super();
		this.name = name;
		this.description = description;
		this.days = days;
		this.basePrice = basePrice;
	}
	
	public double price() {
		return 0;
	}

}

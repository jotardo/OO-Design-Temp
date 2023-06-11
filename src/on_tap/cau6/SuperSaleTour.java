package on_tap.cau6;

public class SuperSaleTour extends TourDecorator{
	
	private double saleRate;

	public SuperSaleTour(Tour tour, double saleRate) {
		super(tour);
		this.saleRate = saleRate;
	}
	
	@Override
	public double price() {
		return super.price() * (1 - saleRate);
	}

}

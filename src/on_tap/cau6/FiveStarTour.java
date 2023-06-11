package on_tap.cau6;

public class FiveStarTour extends TourDecorator{

	public FiveStarTour(Tour tour) {
		super(tour);
	}
	
	@Override
	public double price() {
		return super.price() * 1.5;
	}

}

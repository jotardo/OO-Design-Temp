package on_tap.cau6;

public class TourDecorator implements TourImplement{

	private Tour tour;
	
	public TourDecorator(Tour tour) {
		this.tour = tour;
	}
	
	public double price() {
		return tour.price();
	}
	
}

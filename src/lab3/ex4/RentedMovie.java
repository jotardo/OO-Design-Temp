package lab3.ex4;

import java.util.Date;

public class RentedMovie {
	
	private Date startDate;
	private Movie movie;
	
	public RentedMovie(Date startDate, Movie movie) {
		super();
		this.startDate = startDate;
		this.movie = movie;
	}

	public int getRentDays() {
		return new Date().compareTo(startDate);
	}
	
	public double getCharge() {
		return movie.getCharge(getRentDays());
	}
	
	public int getFrequentRenterPoint() {
		return movie.getFrequentRenterPoint(getRentDays());
	}
}

package lab3.ex4;

import java.util.Date;
import java.util.List;

public class Customer {
	private String name;
	private List<RentedMovie> rentedMovies;
	private int frequentRenterPoint = 0;
	
	public Customer(String name, List<RentedMovie> rentedMovies) {
		super();
		this.name = name;
		this.rentedMovies = rentedMovies;
	}

	public void rent(Movie movie, int day) {
		if (rentedMovies.size() > 5)
			return;
		rentedMovies.add(new RentedMovie(new Date(), movie));
	}
	
	public void returnMovie(Movie movie) {
		
	}
	
	public String statement() {
		return null;
	}
}

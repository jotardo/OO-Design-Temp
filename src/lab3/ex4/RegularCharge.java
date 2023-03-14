package lab3.ex4;

public class RegularCharge implements MovieCharge {

	@Override
	public double getCharge(int rentDays) {
		if (rentDays <= 2)
			return rentDays * 3000;
		return 2 * 3000 + (rentDays - 2) * 1000;
	}

}

package lab3.ex4;

public class ChildrenCharge implements MovieCharge {

	@Override
	public double getCharge(int rentDays) {
		if (rentDays <= 3)
			return rentDays * 2500;
		return 3 * 2500 + (rentDays - 3) * 1500;
	}

}

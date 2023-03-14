package lab3.ex4;

public class NewReleaseCharge implements MovieCharge{

	@Override
	public double getCharge(int rentDays) {
		return rentDays * 4000;
	}

}

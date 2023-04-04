package lab4.exII;

public class AnalogClock implements ClockObservable{

	@Override
	public void update(int hour, int minute, int second) {
		System.out.println(hour + ":" + minute + ":" + second);
	}

}

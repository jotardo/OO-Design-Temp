package lab4.exII;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ClockTime implements ClockObserver{
	
	private int hour;
	private int minute;
	private int second;
	private int milisecond;
	private List<ClockObservable> clocks = new ArrayList<ClockObservable>();
	
	public void tick() {
		Calendar c = Calendar.getInstance();
		this.hour = c.get(Calendar.HOUR_OF_DAY);
		this.minute = c.get(Calendar.MINUTE);
		this.second = c.get(Calendar.SECOND);
		this.milisecond = c.get(Calendar.MILLISECOND);
		notifyAllClocks();
	}
	
	@Override
	public void addClock(ClockObservable clock) {
		clocks.add(clock);
		
	}
	@Override
	public void removeClock(ClockObservable clock) {
		clocks.remove(clock);
		
	}
	@Override
	public void notifyAllClocks() {
		for (ClockObservable co : clocks)
			co.update(this.hour, this.minute, this.second, this.milisecond);
	}
	
	
}

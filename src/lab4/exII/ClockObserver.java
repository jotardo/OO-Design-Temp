package lab4.exII;

public interface ClockObserver {
	public void addClock(ClockObservable clock);
	public void removeClock(ClockObservable clock);
	public void notifyAllClocks();
}

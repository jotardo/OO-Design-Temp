package lab4.ex2;

interface Subject {
	public void registerObserver(Observer observer);
	public void unregisterObserver(Observer observer);
	public void notifyObservers();
}

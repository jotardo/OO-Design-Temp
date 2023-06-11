package on_tap.cau2.model;

public interface Publisher {
	
	public void addSubscriber(Subscriber s);
	public void removeSubscriber(Subscriber s);
	public void notifySubscribersDrawView();

}

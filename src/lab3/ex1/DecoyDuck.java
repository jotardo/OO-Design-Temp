package lab3.ex1;

public class DecoyDuck extends Duck{

	@Override
	public void display() {
		System.out.println("I am a decoy duck");
	}
	
	@Override
	public void quack() {}
	
	@Override
	public void swim() {}
	
	@Override
	public void fly() {}

}

package lab3.ex1;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I am a rubber duck");
	}
	
	@Override
	public void quack() {
		System.out.println("Squick, squick...");
	}
	
	@Override
	public void fly() {}

}

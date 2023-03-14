package lab3.ex2;

public class RubberDuck extends Duck implements Quackable{

	@Override
	public void display() {
		System.out.println("I am a rubber duck");
	}
	
	@Override
	public void quack() {
		System.out.println("Squick, squick...");
	}

}

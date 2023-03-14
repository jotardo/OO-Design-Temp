package lab3.ex2;

public class RedHeadDuck extends Duck implements Flyable, Quackable{

	@Override
	public void display() {
		System.out.println("I am a red head duck!");
	}
	
	public void quack() {
		System.out.println("Quack, quack...");
	}
	
	
	public void fly() {
		System.out.println("I am flying");
	}

}

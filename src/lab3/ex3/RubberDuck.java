package lab3.ex3;

public class RubberDuck extends Duck {

	public RubberDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Squick();
	}
	
	@Override
	public void display() {
		System.out.println("I am a rubber duck");
	}

}

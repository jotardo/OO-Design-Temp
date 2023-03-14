package lab3.ex3;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		this.flyBehavior = new FlyWithWing();
		this.quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I am a red head duck!");
	}

}

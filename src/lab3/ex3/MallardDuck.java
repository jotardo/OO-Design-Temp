package lab3.ex3;

public class MallardDuck extends Duck {

	public MallardDuck() {
		this.flyBehavior = new FlyWithWing();
		this.quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I am a mallard duck");
	}

}

package lab3.ex3;

public class DecoyDuck extends Duck{

	public DecoyDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new MuteQuack();
	}
	
	@Override
	public void display() {
		System.out.println("I am a decoy duck");
	}

}

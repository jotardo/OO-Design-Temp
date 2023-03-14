package lab3.ex3;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}

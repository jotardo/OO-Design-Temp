package lab3.ex3;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("I can't quack");
	}

}

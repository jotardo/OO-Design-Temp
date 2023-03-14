package lab3.ex3;

public abstract class Duck {
	
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public void swim() {
		System.out.println("I am swimming");
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public abstract void display();
}

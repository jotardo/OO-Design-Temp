package lab3.ex1;

public abstract class Duck {
	public void quack() {
		System.out.println("Quack, quack...");
	}
	
	public void swim() {
		System.out.println("I am swimming");
	}
	
	public void fly() {
		System.out.println("I am flying");
	}
	
	public abstract void display();
}

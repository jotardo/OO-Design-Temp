package lab3.ex2;

public class DuckSimTest2 {
	public static void main(String[] args) {
		MallardDuck d1 = new MallardDuck();
		RedHeadDuck d2 = new RedHeadDuck();
		RubberDuck d3 = new RubberDuck();
		DecoyDuck d4 = new DecoyDuck();
		d1.display();
		d1.quack();
		d1.swim();
		d1.fly();
		System.out.println();
		d2.display();
		d2.quack();
		d2.swim();
		d2.fly();
		System.out.println();
		d3.display();
		d3.quack();
		d3.swim();
		System.out.println();
		d4.display();
		d4.swim();
	}
}

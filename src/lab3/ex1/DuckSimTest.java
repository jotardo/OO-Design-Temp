package lab3.ex1;

public class DuckSimTest {
	public static void main(String[] args) {
		Duck d1 = new MallardDuck();
		Duck d2 = new RedHeadDuck();
		Duck d3 = new RubberDuck();
		Duck d4 = new DecoyDuck();
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
		d3.fly();
		System.out.println();
		d4.display();
		d4.quack();
		d4.swim();
		d4.fly();
	}
}

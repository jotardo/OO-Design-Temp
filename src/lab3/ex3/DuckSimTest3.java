package lab3.ex3;

public class DuckSimTest3 {
	public static void main(String[] args) {
		Duck d1 = new MallardDuck();
		Duck d2 = new RedHeadDuck();
		Duck d3 = new RubberDuck();
		Duck d4 = new DecoyDuck();
		d1.display();
		d1.performQuack();
		d1.swim();
		d1.performFly();
		System.out.println();
		d2.display();
		d2.performQuack();
		d2.swim();
		d2.performFly();
		System.out.println();
		d3.display();
		d3.performQuack();
		d3.swim();
		d3.performFly();
		System.out.println();
		d4.display();
		d4.performQuack();
		d4.swim();
		d4.performFly();
	}
}

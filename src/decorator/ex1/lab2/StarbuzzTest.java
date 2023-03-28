package decorator.ex1.lab2;

public class StarbuzzTest {
	public static void main(String[] args) {
		Beverage b1 = new Espresso();
		b1 = new Milk(b1);
		b1 = new Milk(b1);
		b1 = new Milk(b1);
		System.out.println(b1.getDescription());
		System.out.println(b1.cost());

		Beverage b2 = new HouseBlend();
		System.out.println(b2.getDescription());
		System.out.println(b2.cost());

	}
}

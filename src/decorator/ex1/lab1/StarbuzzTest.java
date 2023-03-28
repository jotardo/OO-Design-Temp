package decorator.ex1.lab1;

public class StarbuzzTest {
	public static void main(String[] args) {
		Beverage b1 = new Espresso();
		b1.setMilk(true);
		b1.setWhip(true);
		System.out.println(b1.getDescription());
		System.out.println(b1.cost());

		Beverage b2 = new HouseBlend();
		b2.setSoy(true);
		System.out.println(b2.getDescription());
		System.out.println(b2.cost());

	}
}

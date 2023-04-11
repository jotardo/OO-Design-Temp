package on_tap.cau4;

public class Test {
	public static void main(String[] args) {
		MyComponent c = new MyComponent();
		c.input("  as DRAW TWO    ");
		c.process();
		System.out.println(c.getResult());
		
		Component c1 = new ComponentAdapter(c);
		c1.input(" how ARE you todae ??  ");
		c1.process();
		System.out.println(c1.getResult());
	}
}

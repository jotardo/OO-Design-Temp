package adpater.lab1;

import java.util.Random;

public class DuckAdapter implements Turkey{
	private Duck duck;
	private Random rand;

	public DuckAdapter(Duck duck) {
		super();
		this.duck = duck;
		this.rand = new Random();
	}

	@Override
	public void gobble() {
		duck.quack();
	}

	@Override
	public void fly() {
		if (rand.nextInt(5) == 0)
			duck.fly();
	}
	
}

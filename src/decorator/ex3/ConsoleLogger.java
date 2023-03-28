package decorator.ex3;

public class ConsoleLogger implements Logger {

	@Override
	public void log(String msg) {
		System.out.println(msg);
	}

}

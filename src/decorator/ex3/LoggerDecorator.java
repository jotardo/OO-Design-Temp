package decorator.ex3;

public abstract class LoggerDecorator implements Logger {

	protected Logger logger;
	
	public LoggerDecorator(Logger logger) {
		this.logger = logger;
	}
	
	@Override
	public abstract void log(String msg);

}

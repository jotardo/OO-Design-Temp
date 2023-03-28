package decorator.ex3;

public class HTMLLogger extends LoggerDecorator{

	public HTMLLogger(Logger logger) {
		super(logger);
	}

	@Override
	public void log(String msg) {
		msg = makeHTML(msg);
		logger.log(msg);
		
	}

	public String makeHTML(String msg) {
		msg = "<HTML><BODY>" + "<b>" + msg + "</b>" + "</BODY></HTML>";
		return msg;
	}
	
}

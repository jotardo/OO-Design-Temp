package decorator.ex3;

import java.util.Date;

public class TimeStampingLogger extends LoggerDecorator{

	public TimeStampingLogger(Logger logger) {
		super(logger);
	}

	@Override
	public void log(String msg) {
		Date d = new Date();
		msg = d + ":: " + msg;
		logger.log(msg);
	}

}

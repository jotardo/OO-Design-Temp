package decorator.ex3;

public class EncryptLogger extends LoggerDecorator{

	public EncryptLogger(Logger logger) {
		super(logger);
	}

	public void log(String msg) {
		msg = encrypt(msg);
		
		logger.log(msg);
	}

	public String encrypt(String msg) {
		msg = msg.substring(msg.length() - 1) + msg.substring(0, msg.length() - 1);
		return msg;
	}

}

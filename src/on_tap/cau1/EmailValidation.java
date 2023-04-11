package on_tap.cau1;

public class EmailValidation implements TextValidation{
	
	@Override
	public String toString() {
		return "Email Validation";
	}

	@Override
	public void run(TextComponent c) {
		String s = new String(c.getTextArray());
		c.setValidity(s.matches(".+@.+"));
	}
	
}

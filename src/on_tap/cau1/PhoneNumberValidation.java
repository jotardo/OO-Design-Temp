package on_tap.cau1;

public class PhoneNumberValidation implements TextValidation{

	@Override
	public String toString() {
		return "Phone Number Validation";
	}
	
	@Override
	public void run(TextComponent c) {
		String s = new String(c.getTextArray());
		c.setValidity(s.matches("08\\d{8}"));
	}
	
}

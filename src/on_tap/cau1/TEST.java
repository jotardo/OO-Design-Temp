package on_tap.cau1;

public class TEST {
	public static void main(String[] args) {
		TextComponent tcnick3 = new TextComponent("0897666254");
		tcnick3.addValidation(new NumericValidation());
		tcnick3.addValidation(new PhoneNumberValidation());
		tcnick3.addValidation(new EmailValidation());
		tcnick3.startValidate();
	}
}

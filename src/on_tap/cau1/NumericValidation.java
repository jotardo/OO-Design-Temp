package on_tap.cau1;

public class NumericValidation implements TextValidation {

	@Override
	public String toString() {
		return "Numeric Validation";
	}
	
	@Override
	public void run(TextComponent c) {
		char[] charArr = c.getTextArray();
		boolean isValid = charArr.length > 0;
		boolean dotExisted = false;
		for (int i = 0; i < charArr.length; i++) {
			if (!isValid)
				break;
			if (!(charArr[i] >= '0' && charArr[i] <= '9' || charArr[i] == '.' || (charArr[i] == '-' && i == 0)))
				isValid = false;
			if (charArr[i] == '.')
				if (dotExisted)
					isValid = false;
				else
					dotExisted = true;
		}
		c.setValidity(isValid);
	}

}

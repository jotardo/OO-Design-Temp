package on_tap.cau1;

import java.util.ArrayList;
import java.util.List;

public class TextComponent extends Component{
	
	private String text;
	private List<TextValidation> validation;
	
	public TextComponent(String text) {
		this.text = text;
		this.validation = new ArrayList<>();
	}
	
	public void addValidation(TextValidation validation) {
		this.validation.add(validation);
	}

	@Override
	public void startValidate() {
		boolean wait = true;
		while (!this.validation.isEmpty() && wait) {
			System.out.print(this.validation.get(0) + " : ");
			this.validation.remove(0).run(this);
			System.out.println(isValidate());
			wait = isValidate();
		}
		System.out.println("Final result = " + isValidate());
		setValidity(false);
	}

	public char[] getTextArray() {
		return text.toCharArray();
	}
	
}

package on_tap.cau1;

public abstract class Component {
	
	private boolean validated;
	
	public abstract void startValidate();
	
	public boolean isValidate() {
		return validated;
	}
	
	public void setValidity(boolean b) {
		this.validated = b;
	}
}

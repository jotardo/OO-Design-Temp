package on_tap.cau4;

public class ComponentAdapter implements Component{
	
	private MyComponent myComponent;

	public ComponentAdapter(MyComponent myComponent) {
		super();
		this.myComponent = myComponent;
	}

	@Override
	public void input(String data) {
		myComponent.input(data);
		
	}

	@Override
	public void process() {
		myComponent.process();
	}

	@Override
	public String getResult() {
		char[] s = myComponent.getResult().toCharArray();
		for (int i = 0; i < s.length; i++)
			s[i] = (char) ((s[i] + 2));
		return new String(s);
	}
	
	

}

package on_tap.cau4;

public class MyComponent implements Component {
	private String data;
	private String result;

	public void input(String data) {
		this.data = data;
	}

	public void process() {
		result = data.trim();
	}

	public String getResult() {
		return result;
	}
}

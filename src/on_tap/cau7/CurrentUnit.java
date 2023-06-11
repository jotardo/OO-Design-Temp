package on_tap.cau7;

public abstract class CurrentUnit {
	
	protected String symbol;

	public CurrentUnit(String symbol) {
		super();
		this.symbol = symbol;
	}
	
	@Override
	public String toString() {
		return symbol;
	}
	
	
}

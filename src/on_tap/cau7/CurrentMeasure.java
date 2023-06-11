package on_tap.cau7;

public class CurrentMeasure {
	private double value;
	private CurrentUnit unit;
	
	public CurrentMeasure(double value, CurrentUnit unit) {
		super();
		this.value = value;
		this.unit = unit;
	}
	
	@Override
	public String toString() {
		return this.value + " " + this.unit;
	}
	
	public CurrentMeasure convertToBaseUnit(CurrentUnit unit, double unitRatio) {
		double result = value / unitRatio;
		return new CurrentMeasure(result, unit);
	}
	
	public CurrentMeasure convertFromBaseUnit(CurrentUnit unit, double unitRatio) {
		double result = value * unitRatio;
		return new CurrentMeasure(result, unit);
	}
	
}

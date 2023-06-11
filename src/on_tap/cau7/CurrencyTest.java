package on_tap.cau7;

public class CurrencyTest {
	public static void main(String[] args) {
		CurrentMeasure c1 = new CurrentMeasure(100000, new VietnamUnit());
		CurrentMeasure c2 = new CurrentMeasure(100, new USUnit());
		CurrentMeasure c3 = new CurrentMeasure(25.98, new JapanUnit());
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c1.convertToBaseUnit(new USUnit(), 22505).convertFromBaseUnit(new JapanUnit(), 111.8));
		System.out.println(c3.convertToBaseUnit(new USUnit(), 111.8).convertFromBaseUnit(new EuroUnit(), 0.89));
		
		CurrentMeasure c4 = new CurrentMeasure(50, new CurrentUnit("m") {});
		CurrentMeasure c5 = new CurrentMeasure(50, new CurrentUnit("miles") {});
		System.out.println(c4.convertToBaseUnit(new CurrentUnit("miles") {}, 1.0 / 1609.344));
	}
}

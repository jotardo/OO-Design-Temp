package on_tap.cau2.view;

import on_tap.cau2.controller.Controller;
import on_tap.cau2.model.TemperatureChecker;

public class Test {
	public static void main(String[] args) {
		TemperatureChecker tc = new TemperatureChecker();
		Controller c = new Controller(tc);
	}
}

package adpater.lab2.ver4;

import junit.framework.TestCase;

public class LightAdapterTestDrive extends TestCase {
	public void testButtonControlsLight() throws Exception {
		LightClassAdapter l = new LightClassAdapter();
		Button b = new Button(l);
		b.press();
		assertTrue(l.isOn());
	}
	
	public void testButtonControlsLightThreeWay() throws Exception {
		ThreeWayLight twl= new ThreeWayLight();
		ThreeWayAdapter twa = new ThreeWayAdapter(twl);
		Button b = new Button(twa);
		assertEquals(0, twl.getBrightness());
		b.press();
		assertEquals(1, twl.getBrightness());
		b.press();
		assertEquals(2, twl.getBrightness());
		b.press();
		assertEquals(3, twl.getBrightness());
		b.press();
		assertEquals(0, twl.getBrightness());
	}
}

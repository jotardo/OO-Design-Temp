package adpater.lab2.ver2;

import junit.framework.TestCase;

public class LightAdapterTestDrive extends TestCase {
	public void testButtonControlsLight() throws Exception {
		Light l = new Light();
		LightAdapter la = new LightAdapter(l);
		Button b = new Button(la);
		b.press();
		assertTrue(l.isOn());
	}
}

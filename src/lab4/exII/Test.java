package lab4.exII;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Test {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				ClockTime c = new ClockTime();
				c.addClock(new DigitalClock());
				c.addClock(new AnalogClock());
				c.addClock(new DigitalClock());
				
				Timer t = new Timer(1000, new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						c.tick();
					}
				});
				t.start();
			}
		});
	}
}

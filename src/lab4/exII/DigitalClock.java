package lab4.exII;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DigitalClock extends JFrame implements ClockObservable{
	
	

	private static final long serialVersionUID = 1L;
	private int hour;
	private int minute;
	private int second;
	private int milisecond;
	
	public DigitalClock() {
		add(new DigitalClock.DigitalClockPanel());
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setPreferredSize(new Dimension(60, 20));
		pack();
		setVisible(true);
	}

	@Override
	public void update(int hour, int minute, int second, int milisecond) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.milisecond = milisecond;
		repaint();
	}
	
	private class DigitalClockPanel extends JPanel {
		
		private static final long serialVersionUID = 1L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString((hour + ":" + minute + ":" + second + "." + milisecond), 15, 10);
		}
	}
	

}

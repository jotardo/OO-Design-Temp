package lab4.exII;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnalogClock extends JFrame implements ClockObservable {

	private static final long serialVersionUID = 1L;
	
	private int h, m, s;
	
	public AnalogClock() {
		super();
		AnalogClockPanel c = new AnalogClock.AnalogClockPanel();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setPreferredSize(new Dimension(200, 200));
		add(c);
		pack();
		setVisible(true);
	}

	@Override
	public void update(int hour, int minute, int second) {
		h = hour;
		m = minute;
		s = second;
		repaint();
	}


	private class AnalogClockPanel extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public AnalogClockPanel() {
			super();
			setPreferredSize(new Dimension(100, 100));
			setDoubleBuffered(true);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.setColor(Color.gray);
			g2d.fillRect(0, 0, getWidth(), getHeight());
			g2d.setColor(Color.black);
			g2d.drawOval(5, 5, getWidth() - 10, getHeight() - 10);
			g2d.setColor(Color.white);
			g2d.fillOval(5, 5, getWidth() - 10, getHeight() - 10);
			drawSecond(g2d, s);
			drawMinute(g2d, m);
			drawHour(g2d, h);
			g2d.dispose();
		}

		private void drawSecond(Graphics2D g2d, int second) {
			double angle = Math.toRadians((15 - (second)) * 6);
			int x = (int) (Math.cos(angle) * 100);
			int y = (int) (Math.sin(angle) * 100);

			g2d.setColor(Color.red);
			g2d.drawLine(getWidth() / 2, getHeight() / 2, getWidth() / 2 + x, getHeight() / 2 - y);
		}

		private void drawMinute(Graphics2D g2d, int minute) {
			double angle = Math.toRadians((15 - minute) * 6);
			int x = (int) (Math.cos(angle) * 70);
			int y = (int) (Math.sin(angle) * 70);

			g2d.setColor(Color.blue);
			g2d.drawLine(getWidth() / 2, getHeight() / 2, getWidth() / 2 + x, getHeight() / 2 - y);
		}

		private void drawHour(Graphics2D g2d, int hour) {
			double angle = Math.toRadians((15 - (hour * 5)) * 6);
			int x = (int) (Math.cos(angle) * 50);
			int y = (int) (Math.sin(angle) * 50);

			g2d.setColor(Color.black);
			g2d.drawLine(getWidth() / 2, getHeight() / 2, getWidth() / 2 + x, getHeight() / 2 - y);
		}

	}

}

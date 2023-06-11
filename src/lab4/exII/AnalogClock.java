package lab4.exII;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnalogClock extends JFrame implements ClockObservable {

	private static final long serialVersionUID = 1L;

	private int h, m, s, ms;

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
	public void update(int hour, int minute, int second, int milisecond) {
		h = hour;
		m = minute;
		s = second;
		ms = milisecond;
		repaint();
	}

	private class AnalogClockPanel extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private static final int SPACING = 10;

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
			g2d.drawOval(SPACING, SPACING, getWidth() - SPACING * 2, getHeight() - SPACING * 2);
			g2d.setColor(Color.white);
			g2d.fillOval(SPACING, SPACING, getWidth() - SPACING * 2, getHeight() - SPACING * 2);
			drawLine(g2d);
			drawMilisecond(g2d, ms);
			g2d.setStroke(new BasicStroke(2f));
			drawSecond(g2d, s);
			drawMinute(g2d, m);
			drawHour(g2d, h);
			g2d.dispose();
		}

		private void drawLine(Graphics2D g2d) {
			double angle;
			int x, y;
			int distX1, distY1;
			g2d.setColor(Color.BLACK);
			for (int i = 0; i < 60; i++) {
				angle = Math.toRadians((15 - i) * 6);
				if (i % 5 == 0) {
					distX1 = (int) (Math.cos(angle) * 10);
					distY1 = (int) (Math.sin(angle) * 10 * -1);
					x = (int) (Math.cos(angle) * (getWidth() / 2 - 10 - SPACING)) + getWidth() / 2;
					y = (int) (Math.sin(angle) * (getHeight() / 2 - 10 - SPACING) * -1) + getHeight() / 2;
				}
				else {
					distX1 = (int) (Math.cos(angle) * 5);
					distY1 = (int) (Math.sin(angle) * 5 * -1);
					x = (int) (Math.cos(angle) * (getWidth() / 2 - 5 - SPACING)) + getWidth() / 2;
					y = (int) (Math.sin(angle) * (getHeight() / 2 - 5 - SPACING) * -1) + getHeight() / 2;
				}
				g2d.drawLine(x, y, x + distX1, y + distY1);
			}
		}
		
		private void drawMilisecond(Graphics2D g2d, int ms) {
			double angle = Math.toRadians((250 - (ms)) * 0.36);
			int x = (int) (Math.cos(angle) * (getWidth() / 2 - SPACING));
			int y = (int) (Math.sin(angle) * (getHeight() / 2 - SPACING));
			g2d.setColor(Color.GREEN);
			g2d.drawLine(getWidth() / 2, getHeight() / 2, getWidth() / 2 + x, getHeight() / 2 - y);
		}

		private void drawSecond(Graphics2D g2d, int second) {
			double angle = Math.toRadians((15 - (second)) * 6);
			int x = (int) (Math.cos(angle) * (getWidth() / 2 - SPACING));
			int y = (int) (Math.sin(angle) * (getHeight() / 2 - SPACING));

			g2d.setColor(Color.red);
			g2d.drawLine(getWidth() / 2, getHeight() / 2, getWidth() / 2 + x, getHeight() / 2 - y);
		}

		private void drawMinute(Graphics2D g2d, int minute) {
			double angle = Math.toRadians((15 - minute) * 6);
			int x = (int) (Math.cos(angle) * (getWidth() / 2.25 - SPACING));
			int y = (int) (Math.sin(angle) * (getHeight() / 2.25 - SPACING));

			g2d.setColor(Color.blue);
			g2d.drawLine(getWidth() / 2, getHeight() / 2, getWidth() / 2 + x, getHeight() / 2 - y);
		}

		private void drawHour(Graphics2D g2d, int hour) {
			double angle = Math.toRadians((15 - (hour * 5)) * 6);
			int x = (int) (Math.cos(angle) * (getWidth() / 3.5 - SPACING));
			int y = (int) (Math.sin(angle) * (getWidth() / 3.5 - SPACING));

			g2d.setColor(Color.black);
			g2d.drawLine(getWidth() / 2, getHeight() / 2, getWidth() / 2 + x, getHeight() / 2 - y);
		}

	}

}

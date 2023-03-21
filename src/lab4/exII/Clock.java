package lab4.exII;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Clock extends JPanel{

	private static final long serialVersionUID = 1L;

	public Clock() {
		super();
//		setPreferredSize(new Dimension(100, 100));
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
		Calendar c = Calendar.getInstance();
		drawHour(g2d, c.get(Calendar.HOUR_OF_DAY));
		drawMinute(g2d, c.get(Calendar.MINUTE));
		drawSecond(g2d, c.get(Calendar.SECOND));
		drawMilisecond(g2d, c.get(Calendar.MILLISECOND));
		g2d.dispose();		
	}
	
	private void drawMilisecond(Graphics2D g2d, int t) {
		double angle = Math.toRadians((15 - (t/1000)) * 6); 
	    int x = (int) (Math.cos(angle) * 100); 
	    int y = (int) (Math.sin(angle) * 100);
	    
	    g2d.setColor(Color.gray);
	    g2d.drawLine(getWidth() /2, getHeight() / 2, getWidth() /2 + x, getHeight() / 2 - y);
	}
	
	private void drawSecond(Graphics2D g2d, int t) {
		double angle = Math.toRadians((15 - (t)) * 6); 
	    int x = (int) (Math.cos(angle) * 100); 
	    int y = (int) (Math.sin(angle) * 100);
	    
	    g2d.setColor(Color.red);
	    g2d.drawLine(getWidth() /2, getHeight() / 2, getWidth() /2 + x, getHeight() / 2 - y);
	}

	private void drawMinute(Graphics2D g2d, int t) {
		double angle = Math.toRadians((15 - t) * 6); 
	    int x = (int) (Math.cos(angle) * 70); 
	    int y = (int) (Math.sin(angle) * 70);
	    
	    g2d.setColor(Color.blue);
	    g2d.drawLine(getWidth() /2, getHeight() / 2, getWidth() /2 + x, getHeight() / 2 - y);
	}

	private void drawHour(Graphics2D g2d, int t) {
		double angle = Math.toRadians((15 - (t * 5)) * 6); 
	    int x = (int) (Math.cos(angle) * 50); 
	    int y = (int) (Math.sin(angle) * 50);
	    
	    g2d.setColor(Color.black);
	    g2d.drawLine(getWidth() /2, getHeight() / 2, getWidth() /2 + x, getHeight() / 2 - y);
	}

	public static void main(String[] args) {
		JFrame f = new JFrame();
		Clock c =new Clock();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setPreferredSize(new Dimension(200, 200));
		f.add(c);
		f.pack();
		f.setVisible(true);
		
		Timer t = new Timer(1, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c.repaint();
			}
		});
		t.start();
	}
	
}

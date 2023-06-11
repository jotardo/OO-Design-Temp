package project.rpg;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class NewPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private int x, y;
	
	public NewPanel() {
		super();
		setDoubleBuffered(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.drawRect(x, y, 10, 10);
		g2d.dispose();
		x++;
		y++;
	}
}

package decorator.ex2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class SlashDecorator extends Decorator{

	private static final long serialVersionUID = 1L;
	private int x1, y1, x2, y2;
	
	public SlashDecorator(JComponent c) {
		super(c);
	}
	
	@Override
	public void setBounds(int x, int y, int width, int height) {
		this.x1 = x;
		this.y1 = y;
		this.x2 = width;
		this.y2 = height;
		super.setBounds(x, y, width, height);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLUE);
		g.drawLine(0, 0, x2, y2);
	}

}

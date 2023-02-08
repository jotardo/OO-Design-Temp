package pac_man;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PacMan extends JPanel {

	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;
	private final int SPRITE_SIZE = 14;
	private int SCREEN_WIDTH;
	private int SCREEN_HEIGHT;
	private Image left1, left2, right1, right2, up1, up2, down1, down2, currentImage;
	private int x, y, dx, dy;
	private int frame;
	
	{
	}

	public PacMan(Dimension d) {
		super();
		setBackground(Color.BLACK);
		left1 = new ImageIcon("./res/left1.png").getImage();
		left2 = new ImageIcon("./res/left2.png").getImage();
		right1 = new ImageIcon("./res/right1.png").getImage();
		right2 = new ImageIcon("./res/right2.png").getImage();
		up1 = new ImageIcon("./res/up1.png").getImage();
		up2 = new ImageIcon("./res/up2.png").getImage();
		down1 = new ImageIcon("./res/down1.png").getImage();
		down2 = new ImageIcon("./res/down2.png").getImage();
		frame = 1;
		currentImage = right1;
		x = 0;
		y = 0;
		dx = 14;
		dy = 0;
		SCREEN_WIDTH = d.width;
		SCREEN_HEIGHT = d.height;
	}
	
	public void setDirectionLeft() {
		dx = -14;
		dy = 0;
	}
	
	public void setDirectionRight() {
		dx = 14;
		dy = 0;
	}
	
	public void setDirectionUp() {
		dx = 0;
		dy = -14;
	}
	
	public void setDirectionDown() {
		dx = 0;
		dy = 14;
	}
	
	private void updateFrameControl() {
		frame++;
		if (frame > 2)
			frame = 1;
		if (dx > 0) {
			if (frame == 1)
				currentImage = right1;
			if (frame == 2)
				currentImage = right2;
		}
		if (dx < 0) {
			if (frame == 1)
				currentImage = left1;
			if (frame == 2)
				currentImage = left2;
		}
		if (dy > 0) {
			if (frame == 1)
				currentImage = down1;
			if (frame == 2)
				currentImage = down2;
		}
		if (dy < 0) {
			if (frame == 1)
				currentImage = up1;
			if (frame == 2)
				currentImage = up2;
		}
	}

	private void checkBoundary() {
		if (x < 0)
			x = SCREEN_WIDTH - SPRITE_SIZE;
		if (x > SCREEN_WIDTH - SPRITE_SIZE)
			x = 0;
		if (y < 0)
			y = SCREEN_HEIGHT - SPRITE_SIZE;
		if (y > SCREEN_HEIGHT - SPRITE_SIZE)
			y = 0;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		//update Script
		this.updateFrameControl();
		this.checkBoundary();
		super.paintComponent(g);
		g.drawImage(currentImage, x += dx, y += dy, null);
	}

}

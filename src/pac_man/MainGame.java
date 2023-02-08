package pac_man;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.Timer;

public class MainGame extends JFrame implements ActionListener{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PacMan pacman;

	public MainGame() {
		super();
		getContentPane().setPreferredSize(new Dimension(1000, 240));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		add(pacman = new PacMan(getContentPane().getPreferredSize()));
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				if (!(e.getKeyCode() == KeyEvent.VK_D && e.getKeyCode() == KeyEvent.VK_A)) {
					if (e.getKeyCode() == KeyEvent.VK_D)
						pacman.setDirectionRight();
					if (e.getKeyCode() == KeyEvent.VK_A)
						pacman.setDirectionLeft();
				};
				if (!(e.getKeyCode() == KeyEvent.VK_W && e.getKeyCode() == KeyEvent.VK_S)) {
					if (e.getKeyCode() == KeyEvent.VK_W)
						pacman.setDirectionUp();
					if (e.getKeyCode() == KeyEvent.VK_S)
						pacman.setDirectionDown();
				};
			}
		});
	}
	
	public static void main(String[] args) {
		MainGame frame = new MainGame();
		Timer t = new Timer(1000 / 20, frame);
		t.restart();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		paintComponents(getGraphics());
	}
	
	
}

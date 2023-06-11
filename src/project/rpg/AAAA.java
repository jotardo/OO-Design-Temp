package project.rpg;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class AAAA {
public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
		
		@Override
		public void run() {
			JFrame f = new JFrame();
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.getContentPane().setPreferredSize(new Dimension(640, 480));
			f.pack();
			f.setLocationRelativeTo(null);
			NewPanel p = new NewPanel();
			f.add(p);
			f.setVisible(true);
			
			Timer t = new Timer(1000/1000, new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					p.repaint();
				}
			});
			t.start();
		}
	});

}
}

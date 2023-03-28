package decorator.ex2;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class DecoWindow extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton quit;

	public DecoWindow() {
		super("Deco Button");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		JPanel jp = new JPanel();
		getContentPane().add(jp);
		jp.add(new CoolDecorator(new JButton("Cbutton")));
		jp.add(new SlashDecorator(new CoolDecorator(new JButton("Dbutton"))));

		 jp.add( new SlashDecorator(new JButton("SlashButton")));
		jp.add(quit = new JButton("Quit"));
		quit.addActionListener(this);
		setSize(new Dimension(200, 100));
		setVisible(true);
		quit.requestFocus();
	}

	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

	static public void main(String argv[]) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new DecoWindow();
			}
		});
	}
}

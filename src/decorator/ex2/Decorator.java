package decorator.ex2;

import java.awt.BorderLayout;

import javax.swing.JComponent;

public class Decorator extends JComponent{

	private static final long serialVersionUID = 1L;

	public Decorator(JComponent c) {
		super();
		setLayout(new BorderLayout());
		add(c);
	}
	
}

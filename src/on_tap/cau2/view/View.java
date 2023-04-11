package on_tap.cau2.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import on_tap.cau2.controller.Controller;
import on_tap.cau2.model.Subscriber;

public class View extends JFrame implements Subscriber, ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton lowerF, raiseF, lowerC, raiseC;
	private JTextField tf1, tf2;
	private Controller c;

	public View(Controller c) {
		super("Application");
		this.c = c;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setupGUI();
		pack();
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	private void setupGUI() {
		JPanel p = new JPanel();
		p.setLayout(new GridBagLayout());
		add(p);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.weightx = 10;
		gbc.weighty = 10;
		gbc.gridx = 0;
		gbc.gridy = 0;
		JPanel fPanel = new JPanel();
		fPanel.setLayout(new GridBagLayout());
		fPanel.setBorder(BorderFactory.createTitledBorder("Farenheit Temperature"));
		p.add(fPanel, gbc);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		fPanel.add(tf1 = new JTextField(20), gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		fPanel.add(lowerF = new JButton("Lower"), gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		fPanel.add(raiseF = new JButton("Raise"), gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		JPanel cPanel = new JPanel();
		cPanel.setLayout(new GridBagLayout());
		cPanel.setBorder(BorderFactory.createTitledBorder("Celcius Temperature"));
		p.add(cPanel, gbc);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		cPanel.add(tf2 = new JTextField(20), gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		cPanel.add(lowerC = new JButton("Lower"), gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		cPanel.add(raiseC = new JButton("Raise"), gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridheight = 2;
		Thermometer tPanel = new Thermometer();
		p.add(tPanel, gbc);
		lowerF.addActionListener(this);
		raiseF.addActionListener(this);
		lowerC.addActionListener(this);
		raiseC.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == lowerF)
			c.lowerFareheitTemp(5);
		if (e.getSource() == raiseF)
			c.raiseFareheitTemp(5);
		if (e.getSource() == lowerC)
			c.lowerCelciusTemp(5);
		if (e.getSource() == raiseC)
			c.raiseCelciusTemp(5);
	}

	private class Thermometer extends JPanel {

		private static final long serialVersionUID = 1L;

		public Thermometer() {
			super();
			setPreferredSize(new Dimension(300, 450));
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			int x1 = 90, y1 = 50, x2 = 145, y2 = 80;
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.setColor(Color.white);
			g2d.fillRect(x1, y1, getWidth() - x1 * 2, getHeight() - y1 * 2);
			g2d.setColor(Color.BLACK);
			g2d.drawRect(x1, y1, getWidth() - x1 * 2, getHeight() - y1 * 2);
			g2d.setColor(Color.white);
			g2d.fillRoundRect(x2, y2, getWidth() - x2 * 2, getHeight() - y2 * 2, 10, 10);
			g2d.setColor(Color.BLACK);
			g2d.drawRoundRect(x2, y2, getWidth() - x2 * 2, getHeight() - y2 * 2, 10, 10);
			g2d.setColor(Color.red);
			g2d.fillRoundRect(x2, y2 + 50, getWidth() - x2 * 2, getHeight() - y2 * 2 - 50, 10, 10);
			g2d.dispose();
		}

	}

	@Override
	public void updateTempature(double tempC, double tempF) {
		tf1.setText(tempF + "");
		tf2.setText(tempC + "");
	}

}
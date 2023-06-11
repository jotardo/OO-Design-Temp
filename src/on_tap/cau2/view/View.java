package on_tap.cau2.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;

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
	private Thermometer tPanel;

	public View(Controller c) {
		super("Application");
		this.c = c;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setupGUI();
		pack();
		setLocationRelativeTo(null);
//		setResizable(false);
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
		fPanel.add(lowerF = new JButton("Lower by 5"), gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		fPanel.add(raiseF = new JButton("Raise by 5"), gbc);

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
		cPanel.add(lowerC = new JButton("Lower by 5"), gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		cPanel.add(raiseC = new JButton("Raise by 5"), gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridheight = 2;
		tPanel = new Thermometer();
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
		private int x1 = 120, y1 = 60, indentX = 15, angle = 30;
		private boolean started;
		private Area area;
		private double ratio;

		public Thermometer() {
			super();
			setPreferredSize(new Dimension(300, 450));
			started = false;
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			if (!started) {
				started = true;
				area = new Area();
				area.add(new Area(new Arc2D.Double(x1, y1 + (getHeight() - y1 * 2) - (getWidth() - x1 * 2),
						getWidth() - x1 * 2, getWidth() - x1 * 2, 180 - (90 - angle), 360 - angle * 2, Arc2D.PIE)));
				area.add(new Area(new RoundRectangle2D.Double(x1 + indentX, y1, getWidth() - x1 * 2 - indentX * 2,
						getHeight() - y1 * 2 - 4, indentX, indentX + 10)));
			}
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.setClip(area);
			g2d.setColor(Color.white);
			g2d.fillRect(x1, y1, getWidth() - x1 * 2, (int) ((getHeight() - y1 * 2) * (1 - ratio)));
			g2d.setColor(Color.red);
			g2d.fillRect(x1, y1 + (int) ((getHeight() - y1 * 2) * (1 - ratio)), getWidth() - x1 * 2, (int) ((getHeight() - y1 * 2) * ratio));
			g2d.setColor(Color.black);
			g2d.setStroke(new BasicStroke(5f));
			g2d.draw(area);
			g2d.dispose();
		}

	}

	@Override
	public void updateTempature(double tempC, double tempF, double maxTempC) {
		tf1.setText(tempF + "");
		tf2.setText(tempC + "");
		tPanel.ratio = tempC / maxTempC;
		tPanel.repaint();
	}

}

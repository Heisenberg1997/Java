//import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.text.Format;

import javax.swing.*;

public class demoflow extends JFrame {
	public static void main (String[] args) {
		JFrame theFrame = new demoflow();
		theFrame.setSize(200,125);
		theFrame.setVisible(true);
	}
	
	private Thermometer thermo = new Thermometer();
	
	
	private JLabel lbFah = new JLabel ("Fah");
	private JTextField tfFah = new JTextField ("212",6);
	private JLabel lbCel = new JLabel ("Cel");
	private JTextField tfCel = new JTextField ("100",6);
	private JButton btFah = new JButton ("F to C");
	private JButton btCel = new JButton ("C to F");
	
	public demoflow() {
		setTitle ("F to C");
		Container contentPane = getContentPane();
		//FlowLayout layout = new FlowLayout();
		
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets.bottom = 1;
		gbc.insets.left = 2;
		gbc.insets.right = 2;
		gbc.insets.top = 1;
		gbc.weightx = 100;
		gbc.weighty = 100;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.gridx = 0;
		gbc.gridy =0;
		layout.setConstraints(lbFah, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		layout.setConstraints(lbCel, gbc);
		
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.gridx = 1;
		gbc.gridy = 0;
		layout.setConstraints(tfFah, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		layout.setConstraints(tfCel, gbc);
		
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.gridx = 0;
		gbc.gridy = 2;
		layout.setConstraints(btFah, gbc);
		gbc.gridx = 1;
		gbc.gridy =2;
		layout.setConstraints(btCel, gbc);
		contentPane.setLayout(layout);
		contentPane.add(btCel);
		contentPane.add(btFah);
		contentPane.add(lbCel);
		contentPane.add(lbFah);
		contentPane.add(tfCel);
		contentPane.add(tfFah);
		
		btFah.addActionListener(new FtoCListener());
		btCel.addActionListener(new CtoFListener());
		
		addWindowListener(new MyWindowAdapter());
		
	}

		private class FtoCListener implements ActionListener{
			public void anctionPerfromed(ActionEvent event) {
				String inStr = tfFah .getText().trim();
				double f = Double.parseDouble(inStr);
				thermo.setF(f);
				String outStr = Format.justify('l',thermo.getCelsius(),0,2);
				tfCel.setText(outStr);
			}
		}
		private class CtoFListener implements ActionListener {
			public void anctionPerfromed(ActionEvent event) {
				String inStr = tfCel.getText().trim();
				double c = Double.parseDouble(inStr);
				thermo.setCelsius(c);
				String outStr = Format.justify('l',thermo.getCelsius(),0,2);
				tfFah.setText(outStr);
				
			}
		}

		
		private class MyWindowAdapter extends WindowAdapter{
			public void windowClosing (WindowEvent e) {
				System.exit(0);
			}
		}
}

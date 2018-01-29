package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Form extends JFrame{
	
	private JButton button = new JButton("Press");
	private JTextField input = new JTextField("Input");
	private JRadioButton radio1 = new JRadioButton("select this");
	private JRadioButton radio2 = new JRadioButton("select this");
	private JCheckBox checkbox = new JCheckBox("check",false);
	
	
	public Form() {
		super("First Form Example");
		this.setBounds(100,100,250,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(3,2,2,2));
		container.add(input);
		container.add(checkbox);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		
		container.add(radio1);
		container.add(radio2);
		radio2.setSelected(true);
		button.addActionListener(new ButtonEventListener());
		container.add(button);
	}
	
	class ButtonEventListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String message = "";
			message += "Button was pressed\n";
			message += "Text is " + input.getText() + "\n";
			message += ((radio1.isSelected()?"radio #1 ":"radio #2 ")+"is selected\n");
			message += (checkbox.isSelected()?"Checkbox is Selected":"unchecked"+"\n");
			JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
		}
	}

}

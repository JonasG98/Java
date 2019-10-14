package pmanualgui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DogConverter extends JFrame implements ActionListener {
	
	public JButton convert = new JButton("Convert");
	public JLabel dogY = new JLabel("Dog Years");
	public JLabel humanY = new JLabel("Human Years");
	public JTextField dog = new JTextField();
	public JTextField human = new JTextField();
	
	public DogConverter()
	{
		super("Dog year Converter");
		setSize(500,100);
		setVisible(true);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		convert.addActionListener(this);
		dog.setColumns(10);
		human.setColumns(10);
		cp.add(humanY);
		cp.add(human);
		cp.add(convert);
		cp.add(dogY);
		cp.add(dog);
		human.requestFocus();
		dog.setEditable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String n = human.getText();
		int b = Integer.parseInt(n);
		b = b *7;
		dog.setText(Integer.toString(b));
	}

}

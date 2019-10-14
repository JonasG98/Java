package pmanualgui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleGui extends JFrame implements ActionListener {
	
	private JButton yes;
	private JButton no;
	private JLabel label;
	private JPanel back;
	private JTextArea text;
	
	public SimpleGui()
	{
		yes = new JButton("yes");
		no = new JButton("no");
		label = new JLabel("Click for yes or no");
		back = new JPanel();
		text = new JTextArea(10,10);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		//add buttons to panel
		back.add(no);
		back.add(yes);
		cp.add(text);
		cp.add(label);
		cp.add(back);
		yes.addActionListener(this);
		no.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()== no)
			{
				text.append("no button was pressed\n");
			}
		else
		{
			text.append("yes button was pressed\n");
		}
		
	}

}

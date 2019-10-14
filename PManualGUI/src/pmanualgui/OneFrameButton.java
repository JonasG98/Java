package pmanualgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class OneFrameButton extends JFrame implements ActionListener{
			
	
	JButton button = new JButton("Exit");
	
	
		public OneFrameButton()
		{
			super("Jonas Frame with exit button");
			setSize(400,400);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// panel
			JPanel panel = new JPanel();
			panel.add(button);
			setContentPane(panel);
			button.addActionListener(this);
		}


		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(((JButton)e.getSource()).getText());
			System.exit(0);
			
		}
		
}

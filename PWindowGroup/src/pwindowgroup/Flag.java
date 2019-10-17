package pwindowgroup;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.DefaultComboBoxModel;

public class Flag extends JFrame {

	private JPanel contentPane;
	private final JButton btnNextFlag = new JButton("Next Flag");
	private final JLabel lblSelectCountry = new JLabel("Select Country:");
	private final JComboBox countries = new JComboBox();
	private final JTextField answer = new JTextField();
	private final JLabel lblFlag = new JLabel("");
	private final JPanel panel = new JPanel();
	public String country;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flag frame = new Flag();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Flag() {
		answer.setEditable(false);
		answer.setBounds(322, 237, 96, 20);
		answer.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNextFlag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				answer.setText(" ");
				Random rand = new Random();			
				int n = rand.nextInt(8);
				 country = " ";
				switch(n) {
				  case 0:
				       country = "Russia";
				    break;
				  case 1:
					   country = "United States";
				    break;
				  case 2:
					   country = "Australia";
					    break;
				  case 3:
					  country = "China";
					    break;
				  case 4:
					  country = "Italy";
					    break;
				  case 5:
					  country = "South Africa";
					    break;
				  case 6:
					  country = "Spain";
					    break;
				  case 7:
					  country = "Brazil";
					    break;
				  default:
				    // code block
				}
				String finalcountry = country + ".png";
				lblFlag.setIcon(new ImageIcon(finalcountry));
			}
		});
		btnNextFlag.setBounds(552, 209, 89, 23);
		lblFlag.setIcon(new ImageIcon("Russia.png"));
		contentPane.add(btnNextFlag);
		lblSelectCountry.setBounds(322, 135, 115, 23);
		
		contentPane.add(lblSelectCountry);
		countries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String result = (String) countries.getSelectedItem();
				if (result.equals(country))
				{
					answer.setText("Correct");
				}
				else
				{
					answer.setText("Wrong");
				}
			}
		});
		countries.setModel(new DefaultComboBoxModel(new String[] {"Russia", "Australia", "China", "Italy", "South Africa", "Spain", "United States", "Brazil"}));
		countries.setBounds(322, 179, 88, 32);
		
		contentPane.add(countries);
		
		contentPane.add(answer);
		panel.setBorder(new TitledBorder(null, "Flag", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(26, 153, 96, 134);
		
		contentPane.add(panel);
		panel.setLayout(null);
		lblFlag.setBounds(10, 0, 156, 123);
		panel.add(lblFlag);
	}
}

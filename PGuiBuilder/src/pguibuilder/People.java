package pguibuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class People extends JFrame {

	private JPanel contentPane;
	private final JLabel lblIdNum = new JLabel("Id num");
	private final JLabel lblFirstName = new JLabel("First Name");
	private final JLabel lblLastName = new JLabel("Last Name");
	private final JTextField idnum = new JTextField();
	private final JTextField fname = new JTextField();
	private final JTextField lname = new JTextField();
	private final JLabel lblListOfPeople = new JLabel("List of people entered:");
	private final JTextArea people = new JTextArea();
	private final JScrollPane scrollPane = new JScrollPane();
	private final JButton btnCreate = new JButton("Create");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					People frame = new People();
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
	public People() {
		lname.setBounds(225, 201, 96, 20);
		lname.setColumns(10);
		fname.setBounds(225, 158, 96, 20);
		fname.setColumns(10);
		idnum.setBounds(225, 114, 96, 20);
		idnum.setColumns(10);
		setTitle("Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 472);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblIdNum.setFont(new Font("Yu Gothic", Font.ITALIC, 16));
		lblIdNum.setBounds(108, 109, 55, 34);
		
		contentPane.add(lblIdNum);
		lblFirstName.setFont(new Font("Stencil Std", Font.BOLD, 16));
		lblFirstName.setBounds(91, 154, 124, 23);
		
		contentPane.add(lblFirstName);
		lblLastName.setFont(new Font("Nirmala UI", Font.PLAIN, 16));
		lblLastName.setBounds(91, 201, 96, 17);
		
		contentPane.add(lblLastName);
		
		contentPane.add(idnum);
		
		contentPane.add(fname);
		
		contentPane.add(lname);
		lblListOfPeople.setBounds(439, 114, 158, 14);
		
		contentPane.add(lblListOfPeople);
		scrollPane.setBounds(431, 139, 228, 179);
		
		contentPane.add(scrollPane);
		people.setEditable(false);
		scrollPane.setViewportView(people);
		btnCreate.setBackground(new Color(255, 255, 102));
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = idnum.getText();
				String f = fname.getText();
				String l = lname.getText();
				String createAll = id + " " + f + " " + l;
				people.append(createAll + "\n");
				
				
			}
		});
		btnCreate.setBounds(112, 294, 89, 23);
		
		contentPane.add(btnCreate);
	}
}

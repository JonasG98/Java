package pguibuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private final JLabel lblFirstNumber = new JLabel("First Number");
	private final JLabel lblSecondNumber = new JLabel("Second Number");
	private final JLabel lblResult = new JLabel("Result");
	private final JTextField firstNumber = new JTextField();
	private final JTextField secondNumber = new JTextField();
	private final JTextField result = new JTextField();
	private final JButton btnAdd = new JButton("Add");
	private final JPanel panel = new JPanel();
	private final JButton btnSubtract = new JButton("Subtract");
	private final JButton btnMultiply = new JButton("Multiply");
	private final JButton btnDivide = new JButton("Divide");
	private final JButton btnClear = new JButton("Clear");
	private final JButton btnExit = new JButton("Exit");
	private final JButton btnTwoRandomNumbers = new JButton("Two random numbers");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Number Addition", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(52, 36, 715, 352);
		
		contentPane.add(panel);
		panel.setLayout(null);
		firstNumber.setBounds(221, 66, 96, 20);
		panel.add(firstNumber);
		firstNumber.setColumns(10);
		lblFirstNumber.setBounds(72, 64, 123, 25);
		panel.add(lblFirstNumber);
		secondNumber.setBounds(221, 117, 96, 20);
		panel.add(secondNumber);
		secondNumber.setColumns(10);
		lblSecondNumber.setBounds(72, 115, 107, 25);
		panel.add(lblSecondNumber);
		result.setEditable(false);
		result.setBounds(221, 195, 96, 20);
		panel.add(result);
		result.setColumns(10);
		lblResult.setBounds(72, 198, 48, 14);
		panel.add(lblResult);
		btnAdd.setBounds(76, 252, 89, 23);
		panel.add(btnAdd);
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num1 = Double.parseDouble(firstNumber.getText());
				double num2 = Double.parseDouble(secondNumber.getText());
				double addresult = num1 - num2;
				result.setText(String.valueOf(addresult));
			}
		});
		btnSubtract.setBounds(197, 252, 89, 23);
		
		panel.add(btnSubtract);
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num1 = Double.parseDouble(firstNumber.getText());
				double num2 = Double.parseDouble(secondNumber.getText());
				double addresult = num1 * num2;
				result.setText(String.valueOf(addresult));
			}
		});
		btnMultiply.setBounds(322, 252, 89, 23);
		
		panel.add(btnMultiply);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num1 = Double.parseDouble(firstNumber.getText());
				double num2 = Double.parseDouble(secondNumber.getText());
				double addresult = num1 / num2;
				result.setText(String.valueOf(addresult));
			}
		});
		btnDivide.setBounds(451, 252, 89, 23);
		
		panel.add(btnDivide);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNumber.setText("");
				secondNumber.setText("");
				result.setText("");
			}
		});
		btnClear.setBounds(616, 252, 89, 23);
		
		panel.add(btnClear);
		btnTwoRandomNumbers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random rand = new Random();
				int num1 = rand.nextInt(100000);
				int num2 = rand.nextInt(100000);
				firstNumber.setText(String.valueOf(num1));
				secondNumber.setText(String.valueOf(num2));
				
			}
		});
		btnTwoRandomNumbers.setBounds(486, 81, 165, 38);
		
		panel.add(btnTwoRandomNumbers);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(665, 399, 89, 23);
		
		contentPane.add(btnExit);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double num1 = Double.parseDouble(firstNumber.getText());
				double num2 = Double.parseDouble(secondNumber.getText());
				double addresult = num1 + num2;
				result.setText(String.valueOf(addresult));
				
			}
		});
	}
}

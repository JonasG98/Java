package pwindowgroup;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WeatherGui extends JFrame {

	private JPanel contentPane;
	private final JRadioButton cold = new JRadioButton("Cold");
	private final JRadioButton mild = new JRadioButton("Mild");
	private final JRadioButton hot = new JRadioButton("Hot");
	private final ButtonGroup temp = new ButtonGroup();
	private final JRadioButton dry = new JRadioButton("Dry");
	private final JRadioButton wet = new JRadioButton("Wet");
	private final ButtonGroup state = new ButtonGroup();
	private final JRadioButton rain = new JRadioButton("Rain");
	private final JRadioButton snow = new JRadioButton("Snow");
	private final ButtonGroup fall = new ButtonGroup();
	private final JButton show = new JButton("Show Conditions");
	private final JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeatherGui frame = new WeatherGui();
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
	public WeatherGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		temp.add(cold);
		cold.setBounds(90, 49, 109, 23);
		
		contentPane.add(cold);
		temp.add(mild);
		mild.setBounds(230, 49, 109, 23);
		
		contentPane.add(mild);
		temp.add(hot);
		hot.setBounds(373, 49, 109, 23);
		
		contentPane.add(hot);
		state.add(dry);
		dry.setBounds(90, 117, 109, 23);
		
		contentPane.add(dry);
		state.add(wet);
		wet.setBounds(230, 117, 109, 23);
		
		contentPane.add(wet);
		fall.add(rain);
		rain.setBounds(90, 176, 109, 23);
		
		contentPane.add(rain);
		fall.add(snow);
		snow.setBounds(230, 176, 109, 23);
		
		contentPane.add(snow);
		show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cold.setActionCommand("Cold");
				mild.setActionCommand("Mild");
				hot.setActionCommand("Hot");
				dry.setActionCommand("Dry");
				snow.setActionCommand("Snow");
				wet.setActionCommand("Wet");
				rain.setActionCommand("Rain");
				
				textArea.append(temp.getSelection().getActionCommand() + " ");
				textArea.append(state.getSelection().getActionCommand() + " ");
				textArea.append(fall.getSelection().getActionCommand() + " \n" );
			}
		});
		show.setBounds(430, 200, 154, 36);
		
		contentPane.add(show);
		textArea.setBounds(89, 232, 217, 95);
		
		contentPane.add(textArea);
	}
}

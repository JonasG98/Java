package ptabbedpanesandtables;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class PizzaPlace extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel pizza = new JPanel();
	private final JPanel beverages = new JPanel();
	private final JPanel specialIteams = new JPanel();
	private final JRadioButton small = new JRadioButton("Small ($5)");
	private final JRadioButton medium = new JRadioButton("Medium ($10)");
	private final JRadioButton large = new JRadioButton("Large ($15)");
	private final ButtonGroup size = new ButtonGroup();
	private final JLabel lblSize = new JLabel("Size:");
	private final JLabel lblToppings = new JLabel("Toppings:");
	private final JLabel lblEach = new JLabel("1$ each");
	private final JCheckBox pepperoni = new JCheckBox("Pepperoni");
	private final JCheckBox mushrooms = new JCheckBox("Mushrooms");
	private final JCheckBox anchovies = new JCheckBox("Anchovies");
	private final JTextField numPizza = new JTextField();
	private final JLabel lblNoOfPizzas = new JLabel("No. of Pizzas:");
	private final JButton btnTotal = new JButton("Total");
	private final JTextField totalCost = new JTextField();
	private final JLabel drinksL = new JLabel("Drinks:");
	private final JCheckBox cola = new JCheckBox("Coca Cola");
	private final JCheckBox pepsi = new JCheckBox("Pepsi");
	private final JCheckBox sprite = new JCheckBox("Sprite");
	private final JCheckBox water = new JCheckBox("Water");
	private final JLabel lblEach_1 = new JLabel("$5 each");
	private final JTextField nCola = new JTextField();
	private final JLabel lblNoOfDrinks = new JLabel("No. of drinks");
	private final JTextField nPepsi = new JTextField();
	private final JTextField nSprite = new JTextField();
	private final JTextField nWater = new JTextField();
	private final JTable table = new JTable();
	private final JScrollPane scrollPane = new JScrollPane();
	private DefaultTableModel tm = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"First", "Last", "Phone"
			}
		);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaPlace frame = new PizzaPlace();
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
	public PizzaPlace() {
		nWater.setText("");
		nWater.setBounds(221, 188, 96, 20);
		nWater.setColumns(10);
		nSprite.setBounds(221, 145, 96, 20);
		nSprite.setColumns(10);
		nPepsi.setBounds(221, 107, 96, 20);
		nPepsi.setColumns(10);
		nCola.setBounds(221, 67, 96, 20);
		nCola.setColumns(10);
		numPizza.setBounds(431, 47, 96, 20);
		numPizza.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBounds(53, 39, 636, 299);
		
		contentPane.add(tabbedPane);
		
		tabbedPane.addTab("Pizza", null, pizza, null);
		pizza.setLayout(null);
		size.add(small);
		small.setBounds(75, 32, 109, 23);
		
		pizza.add(small);
		size.add(medium);
		medium.setBounds(75, 58, 109, 23);
		
		pizza.add(medium);
		size.add(large);
		large.setBounds(75, 84, 109, 23);
		
		pizza.add(large);
		lblSize.setBounds(45, 11, 48, 14);
		
		pizza.add(lblSize);
		lblToppings.setBounds(21, 136, 72, 14);
		
		pizza.add(lblToppings);
		lblEach.setBounds(21, 156, 48, 14);
		
		pizza.add(lblEach);
		pepperoni.setBounds(75, 132, 97, 23);
		
		pizza.add(pepperoni);
		mushrooms.setBounds(75, 157, 97, 23);
		
		pizza.add(mushrooms);
		anchovies.setBounds(75, 183, 97, 23);
		
		pizza.add(anchovies);
		
		pizza.add(numPizza);
		lblNoOfPizzas.setBounds(333, 50, 79, 14);
		
		pizza.add(lblNoOfPizzas);
		
		tabbedPane.addTab("Beverages", null, beverages, null);
		beverages.setLayout(null);
		drinksL.setBounds(44, 23, 48, 14);
		
		beverages.add(drinksL);
		cola.setBounds(44, 66, 97, 23);
		
		beverages.add(cola);
		pepsi.setBounds(44, 106, 97, 23);
		
		beverages.add(pepsi);
		sprite.setBounds(44, 142, 97, 23);
		
		beverages.add(sprite);
		water.setBounds(44, 187, 97, 23);
		
		beverages.add(water);
		lblEach_1.setBounds(44, 45, 48, 14);
		
		beverages.add(lblEach_1);
		
		beverages.add(nCola);
		lblNoOfDrinks.setBounds(169, 45, 113, 14);
		
		beverages.add(lblNoOfDrinks);
		
		beverages.add(nPepsi);
		
		beverages.add(nSprite);
		
		beverages.add(nWater);
		
		tabbedPane.addTab("Special Items", null, specialIteams, null);
		specialIteams.setLayout(null);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 11, 611, 236);
		
		specialIteams.add(scrollPane);
		table.setModel(tm);
		scrollPane.setViewportView(table);
		drawTable();
		btnTotal.setBounds(402, 361, 89, 23);
		contentPane.add(btnTotal);
		totalCost.setBounds(520, 362, 96, 20);
		contentPane.add(totalCost);
		totalCost.setEditable(false);
		totalCost.setColumns(10);
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int extras = 0;
				int drinks = 0;
				small.setActionCommand("5");
				medium.setActionCommand("10");
				large.setActionCommand("15");
				
				if(pepperoni.isSelected())
				{
					extras ++;
				}
				if(mushrooms.isSelected())
				{
					extras ++;
				}
				if(anchovies.isSelected())
				{
					extras ++;
				}
				if(cola.isSelected())
				{
					drinks = drinks + (5 * Integer.parseInt(nCola.getText()));
				}
				if(pepsi.isSelected())
				{
					drinks = drinks + (5 * Integer.parseInt(nPepsi.getText()));
				}
				if(sprite.isSelected())
				{
					drinks = drinks + (5 * Integer.parseInt(nSprite.getText()));
				}
				if(water.isSelected())
				{
					drinks = drinks + (5 * Integer.parseInt(nWater.getText()));
				}
				int number = Integer.parseInt(numPizza.getText()); 
				extras = (Integer.parseInt(size.getSelection().getActionCommand()) + extras) * number + drinks;
				totalCost.setText(Integer.toString(extras));
				
			}
		});
	}

	private void drawTable() {
		tm.setRowCount(0);
		for (int i=0; i < 150; i ++)
		{
			Object[] littleObject = new Object[3];
			littleObject[0] = "people.get(i).getFirst() ";
			littleObject[1] = "people.get(i).getLast() ";
			littleObject[2] = "people.get(i).getPhone() ";
			// one line per column mines dummy data
			tm.addRow(littleObject);
		}
		
	}
}

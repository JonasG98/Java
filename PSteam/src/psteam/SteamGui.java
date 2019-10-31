package psteam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class SteamGui extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel panel = new JPanel();
	private final JTable table = new JTable();
	private final JScrollPane scrollPane = new JScrollPane();
	private ArrayList<Game>games;
	private DefaultTableModel tm = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Release Date", "Achievments", "Positive Ratings", "Negative Ratings", "Average Playtime", "Median Playtime", "MinOwners", "MaxOwners", "Price"
			}
		);
	private final JComboBox sortingOn = new JComboBox();
	private final JLabel lblSortOn = new JLabel("Sort on:");
	private final JButton sort = new JButton("Sort");
	private final JLabel lblTopOf = new JLabel("Top 1500 of positive rated games on steam");
	private final JPanel individual = new JPanel();
	private final JLabel lblIndividualData = new JLabel("Individual Data");
	private final JButton btnPrevious = new JButton("Previous");
	private final JButton btnNext = new JButton("Next");

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public SteamGui(ArrayList<Game>games) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.games = games;
		setBounds(100, 100, 1411, 1030);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBounds(27, 127, 1368, 784);
		
		contentPane.add(tabbedPane);
		
		tabbedPane.addTab("Steam Table", null, panel, null);
		panel.setLayout(null);
		scrollPane.setBounds(0, 0, 1332, 745);
		
		panel.add(scrollPane);
		
		scrollPane.setViewportView(table);
		table.setModel(tm);
		sortingOn.setModel(new DefaultComboBoxModel(new String[] {"Name", "Date", "Positive Reviews", "Negative Reviews", "Average Playtime", "Median Playtime", "Minimum Owners", "Maximum Owners", "Price"}));
		sortingOn.setBounds(133, 932, 137, 22);
		
		contentPane.add(sortingOn);
		lblSortOn.setBounds(61, 936, 62, 14);
		
		contentPane.add(lblSortOn);
		sort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String result = (String) sortingOn.getSelectedItem();
				if (result.equals("Name"))
				{
				GameCompare ac = new GameCompare();
				Collections.sort(games, ac);
				drawTable();
				}
				if (result.contentEquals("Price"))
				{
					PriceCompare pc = new PriceCompare();
					Collections.sort(games, pc);
					drawTable();
				}
				if (result.contentEquals("Negative Reviews"))
				{
					NegativCompare nc = new NegativCompare();
					Collections.sort(games, nc);
					drawTable();
				}
				if (result.contentEquals("Positive Reviews"))
				{
					Collections.sort(games);
					drawTable();
				}
				if (result.contentEquals("Average Playtime"))
				{
					AverageCompare ac = new AverageCompare();
					Collections.sort(games, ac);
					drawTable();
				}
				if (result.contentEquals("Median Playtime"))
				{
					MedianCompare mc = new MedianCompare();
					Collections.sort(games, mc);
					drawTable();
				}
				if (result.contentEquals("Minimum Owners"))
				{
					MinCompare ac = new MinCompare();
					Collections.sort(games, ac);
					drawTable();
				}
				if (result.contentEquals("Maximum Owners"))
				{
					MaxCompare ac = new MaxCompare();
					Collections.sort(games, ac);
					drawTable();
				}
				if (result.contentEquals("Date"))
				{
					DateCompare ac = new DateCompare();
					Collections.sort(games, ac);
					drawTable();
				}
			}
		});
		sort.setBounds(290, 932, 89, 23);
		
		contentPane.add(sort);
		lblTopOf.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblTopOf.setBounds(61, 49, 565, 45);
		
		contentPane.add(lblTopOf);
		createPieGraphTab();
		drawTable();
		createALineChartTab();
		
	}

	private void drawTable() {
		tm.setRowCount(0);
		for (int i=0; i < games.size(); i ++)
		{
			Object[] littleObject = new Object[10];
			littleObject[0] = games.get(i).getName();
			littleObject[1] = games.get(i).getReleaseDate();
			littleObject[2] = games.get(i).getAchievments();
			littleObject[3] = games.get(i).getPositiveRatings();
			littleObject[4] = games.get(i).getNegativeRatings();
			littleObject[5] = games.get(i).getAveragePlaytime();
			littleObject[6] = games.get(i).getMedianPlaytime();
			littleObject[7] = games.get(i).getMinOwners();
			littleObject[8] = games.get(i).getMaxOwners();
			littleObject[9] = games.get(i).getPrice();
	
			tm.addRow(littleObject);
		}
		
	}
	
	private void createPieGraphTab()
	{
		Collections.sort(games);
		DefaultPieDataset data = new DefaultPieDataset();
		for (int i=0; i < 20; i ++)
		{
		data.setValue(games.get(i).getName(), games.get(i).getPositiveRatings());
		}
		
		
		JFreeChart chart = ChartFactory.createPieChart("Top 20 Positive Rating Games on Steam", data, true, true, Locale.ENGLISH);
		
		ChartPanel mypanel = new ChartPanel(chart);
		mypanel.setVisible(true);
		
		tabbedPane.add("Rating Graph", mypanel);
	}
	
	private void createALineChartTab()
	{
		XYSeries series1 = new XYSeries("weight and excercise");
		series1.add(60, 10);
		series1.add(55, 140);
		series1.add(50, 420);
		series1.add(52, 300);
		series1.add(57, 20);
		series1.add(65, 5);
		
		XYSeriesCollection dataset = new XYSeriesCollection();
		dataset.addSeries(series1);
		
		JFreeChart chart = ChartFactory.createXYLineChart("Weight vs excercise", "kilogram", "Minutes", dataset, PlotOrientation.HORIZONTAL,true,true,true);
		XYPlot plot = chart.getXYPlot();
		
		NumberAxis domain = (NumberAxis) plot.getRangeAxis();
		domain.setRange(0,450);
		domain.setTickUnit(new NumberTickUnit(50));
		domain.setVerticalTickLabels(true);
		
		NumberAxis range = (NumberAxis) plot.getDomainAxis();
		range.setRange(45, 80);
		range.setTickUnit(new NumberTickUnit(10));
		
		tabbedPane.addTab("Individual Data", null, individual, null);
		individual.setLayout(null);
		lblIndividualData.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIndividualData.setBounds(109, 55, 143, 41);
		
		individual.add(lblIndividualData);
		btnPrevious.setBounds(68, 527, 89, 23);
		
		individual.add(btnPrevious);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNext.setBounds(216, 527, 89, 23);
		
		individual.add(btnNext);
		
		ChartPanel mypanel2 = new ChartPanel(chart);
		tabbedPane.add("Line Graph", mypanel2);
		
	}
	
	private void createABarChartTab()
	{
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		dataset.addValue(70,  "Java", "2007");
		dataset.addValue(75,  "Java", "2008");
		dataset.addValue(80,  "Java", "2009");
		dataset.addValue(32,  "Java", "2010");
		dataset.addValue(65,  "Java", "2011");
		
		JFreeChart chart = ChartFactory.createBarChart("Java Completion rates", "years", "Percentage", dataset, PlotOrientation.VERTICAL, true,true,false);
		ChartPanel mypanel3 = new ChartPanel(chart);
		tabbedPane.add("Bar Graph", mypanel3);
		
	}
}

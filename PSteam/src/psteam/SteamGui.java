package psteam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
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
				"Name", "Release Date", "Achievments", "Positive Ratings", "Negative Ratings", "Average Playtime", "Median Playtime", "Owners", "Price"
			}
		);

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public SteamGui(ArrayList<Game>games) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.games = games;
		setBounds(100, 100, 1411, 935);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBounds(37, 31, 1368, 784);
		
		contentPane.add(tabbedPane);
		
		tabbedPane.addTab("Table", null, panel, null);
		panel.setLayout(null);
		scrollPane.setBounds(10, 11, 1332, 745);
		
		panel.add(scrollPane);
		table.setModel(tm);
		scrollPane.setViewportView(table);
		createPieGraphTab();
		drawTable();
		createALineChartTab();
		
	}

	private void drawTable() {
		tm.setRowCount(0);
		for (int i=0; i < games.size(); i ++)
		{
			Object[] littleObject = new Object[9];
			littleObject[0] = games.get(i).getName();
			littleObject[1] = games.get(i).getReleaseDate();
			littleObject[2] = games.get(i).getAchievments();
			littleObject[3] = games.get(i).getPositiveRatings();
			littleObject[4] = games.get(i).getNegativeRatings();
			littleObject[5] = games.get(i).getAveragePlaytime();
			littleObject[6] = games.get(i).getMedianPlaytime();
			littleObject[7] = games.get(i).getOwners();
			littleObject[8] = games.get(i).getPrice();
	
			tm.addRow(littleObject);
		}
		
	}
	
	private void createPieGraphTab()
	{
		DefaultPieDataset data = new DefaultPieDataset();
		data.setValue("Principal Lecturer", 5);
		data.setValue("Lecturer", 2);
		data.setValue("Admin", 7);
		
		JFreeChart chart = ChartFactory.createPieChart("Sample Pie Chart", data, true, true, Locale.ENGLISH);
		
		ChartPanel mypanel = new ChartPanel(chart);
		mypanel.setVisible(true);
		
		tabbedPane.add("Pie Graph", mypanel);
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

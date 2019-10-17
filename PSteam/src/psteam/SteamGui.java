package psteam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

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
		drawTable();
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
}

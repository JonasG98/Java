package pdatetime;

import javax.swing.JOptionPane;

public class StringReverse {

	public static void main(String[] args) {
		
		Words test1= new Words(JOptionPane.showInputDialog("Give me four words with * inbetween"));
		test1.exWords();
		 System.out.println(test1.getMessage());
		 System.out.println(test1.reverseWords());
		 
		 
		//String[] parts = test1.split("\\*");
		//String part1 = parts[0];
		//String part2 = parts[1];
		//String part3 = parts[2];
		//String part4 = parts[3];
		//System.out.println(part4 + " " + part3 + " " + part2 + " " + part1);
		//System.out.println(part1 + " " + part2 + " " + part3 + " " + part4);
		
	}

}

package pdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

public class DateTimeApp {

	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		System.out.println(currentDate.getDayOfWeek());
		System.out.println(currentDate.getMonth());
		LocalTime milli = LocalTime.now();
		String test1= JOptionPane.showInputDialog("Please input your birthdate? d/M/y");
		LocalTime milli1 = LocalTime.now();
		System.out.println(Duration.between(milli, milli1).getSeconds());
		String[] parts = test1.split("/");
		String part1 = parts[0];
		String part2 = parts[1];
		String part3 = parts[2];
		int year = Integer.parseInt(part3);
		int month = Integer.parseInt(part2);
		int day = Integer.parseInt(part1);
		LocalDate birthday = LocalDate.of(year, month, day);
		System.out.println(birthday);
		if(currentDate.getMonthValue() > birthday.getMonthValue())
		{
			System.out.println(currentDate.getYear() - birthday.getYear());
		}
		else
		{
			System.out.println(currentDate.getYear() - birthday.getYear() - 1);
		}
	}

}

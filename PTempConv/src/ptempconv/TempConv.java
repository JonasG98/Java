package ptempconv;

import java.text.DecimalFormat;

public class TempConv {
	private double cel;
	private double fah;
	private double kel;
	
	public TempConv(double celsius)
	{
		cel = celsius;
		fah = (celsius* 9/5) + 32;
		kel = celsius + 273.15;
	}
	public double getCel()
	{
		return cel;
	}
	public double getFah()
	{
		return fah;
	}
	public double getKel()
	{
		return kel;
	}
	
	public void setCel(double celsius)
	{
		cel = celsius;
		fah = (celsius* 9/5) + 32;
		kel = celsius + 273.15;
	}
	public void setFah(double fahrenheit)
	{
		fah = fahrenheit;
		cel = (fahrenheit -32) * 5/9;
		kel = (fahrenheit - 32) * 5/9 + 273.15;
	}
	public void setKel(double kelvin)
	{
		kel = kelvin;
		cel = kelvin - 273.15;
		fah = (kelvin - 273.15) * 9/5 + 32;
	}
	public String toString()
	{
		DecimalFormat formatter = new DecimalFormat("0.##");
		
		return "Celcius is " + formatter.format(cel) + " Fahrenheit is " + formatter.format(fah) + " Kelvin is " + formatter.format(kel) ;
	}

}

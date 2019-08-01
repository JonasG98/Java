package pbox;

public class Box {

	private double height;
	private double width;
	private double length;
	
	
	public Box(double height, double width, double length)
	{
		this.height = height;
		this.width = width;
		this.length = length;
	}
	public Box(double squareBase, double height)
	{
		width = length = squareBase;
		this.height = height;
	}
	public Box(double size)
	{
		width= length = height = size;
	}
	
	public double getHeight()
	{
		return height;
	}
	public double getWidth()
	{
		return width;
	}
	public double getLength()
	{
		return length;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	public void setLength(double length)
	{
		this.length = length;
	}
	
	public double calcVolume()
	{
		double volume = height * length * width;
		return volume;
	}
	public double calcSurfaceArea()
	{
		double area = (2 * length * width) + (2 * length * height) + (2 * width * height);
		return area;
	}
	
	public String toString()
	{
		double volume = calcVolume();
		double area = calcSurfaceArea();
		return "the height is " + height + " the width is " + width + " the length is " + length + " this means the Volume is " + volume + " and the surface area is " + area;
	}
}

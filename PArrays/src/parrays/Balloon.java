package parrays;

import java.util.Random;

public class Balloon {
	private int colour;
	
	public Balloon()
	{
		Random rand = new Random();
		colour = rand.nextInt(10);
		colour += 1;
	}
	public int getColour()
	{
		return colour;
	}
	public String writeColour()
	{
		String balloonColor;
		switch (colour)
		{
		case 1: balloonColor = "red";
		break;
		case 2: balloonColor = "blue";
		break;
		case 3: balloonColor = "yellow";
		break;
		case 4: balloonColor = "pink";
		break;
		case 5: balloonColor = "purple";
		break;
		case 6: balloonColor = "green";
		break;
		case 7: balloonColor = "black";
		break;
		case 8: balloonColor = "white";
		break;
		case 9: balloonColor = "orange";
		break;
		case 10: balloonColor = "neon";
		break;
		default: balloonColor = "null";
		break;
		}
		return balloonColor;
	}

}

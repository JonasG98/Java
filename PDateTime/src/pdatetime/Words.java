package pdatetime;

public class Words {
	
	private String message;
	private String word1;
	private String word2;
	private String word3;
	private String word4;
	
	public Words(String message)
	{
		String[] parts = message.split("\\*");
		word1 = parts[0];
		word2 = parts[1];
		word3 = parts[2];
		word4 = parts[3];
		this.message = message;
	}
	public String getMessage()
	{
		return (message );
	}
	public String exWords()
	{
		message = (word1 + " " + word2 + " " + word3 + " " + word4);
		return message;
	}
	public String reverseWords()
	{
		return (word4 + " " + word3 + " " + word2 + " " + word1 );
	}
	public String toString()
	{
		return exWords();
	}

}

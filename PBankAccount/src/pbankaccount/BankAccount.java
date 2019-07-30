package pbankaccount;

public class BankAccount {
	
	private double balance;
	
	public BankAccount()
	{
		balance = 0;
	}
	
	public double getBalance()
	{
		return balance;
	}
	public void deposit(int i)
	{
		balance = balance + i;
	}
	public void withdraw(int i)
	{
		balance = balance - i;
		if(balance < 0)
		{
			balance = balance - 5;
		}
	}
	public void addInterest()
	{
		if (balance > 0)
		{
			double newBalance = balance * 0.05;
			double interest = newBalance * 0.33;
					
			balance = balance + newBalance - interest;
		}
	}
	

}

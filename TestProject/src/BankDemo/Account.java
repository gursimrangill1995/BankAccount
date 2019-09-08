package BankDemo;

public class Account {
	
	private double balance;
	
	// set balance at 0.00
	public Account()
	{
		balance = 0.0;
		
	}
	//deposit
	public void deposit(double amount)
	{
		balance = balance + amount;
		
	}
	
	//withdraw
	public void withdraw(double amount)
	{
		if(amount<=balance)
		{
			balance = balance - amount;
			
		}else
		{
			System.err.println("transaction cancelled due to low funds");
			
		}
		
		}
	
	
	//Get balance
	public double getBalance()
	{
		return balance;
		
	}
	
	
}

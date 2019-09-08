package BankDemo;

public class BankMain {

	public static void main(String[] args)
	{
		
		//create cust1
		Account cust1 = new Account();  //create an account object
		cust1.deposit(500);
		
		//create cust2
		Account cust2 = new Account();
		cust2.withdraw(100);
		
		System.out.print("Cust1 has a balance of ");
		System.out.println(cust1.getBalance());
		
		System.out.print("Cust2 has a balance of ");
		System.out.println(cust2.getBalance());
		
		
		
	}
}

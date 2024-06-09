package bankactivities;

public class BankTranscation {
	
	public void deposit(Account acc,int amt)
	{
		acc.setBal(acc.getBal()+amt);
		System.out.println("balance updated");
	}
	public void withdraw(Account acc,int amt)
	{
		acc.setBal(acc.getBal()-amt);
		System.out.println("balance updated");
	}
}

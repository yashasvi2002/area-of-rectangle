package bankactivities;

public interface Bank1 {
	int MIN_BAL=1000; 
	int DEPOSIT_LIMIT=20000;
	
	void deposite(Account acc,int amt);
	void withdraw(Account acc,int amt);
}

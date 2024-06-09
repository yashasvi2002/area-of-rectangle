package bankactivities;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account();
		acc.setAccname("abc");
		acc.setEmil("asd@gmail.com");
		acc.setBal(5000);
		System.out.println(acc);
		
		BankTranscation  bt= new  BankTranscation();
		
		
		bt.deposit(acc,4000);
		System.out.println(acc);
		
		bt.withdraw(acc,1200);
		System.out.println(acc);
	} 

}

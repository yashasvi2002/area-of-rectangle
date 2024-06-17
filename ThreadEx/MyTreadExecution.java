package ThreadEx;

public class MyTreadExecution {

	public static void main(String[] args) {
		MyThread m=new MyThread();
		System.out.println("before runnable satge thread is alive or not "+m.isAlive());
		m.start(); //prints the statement which is present mythread class 
		
		try
		{
			Thread.sleep(400);
		}
		catch(Exception e)
		{
			System.out.println("Thread is interrupted");
			
		}
		System.out.println("after complete execution thread is alive or not "+m.isAlive());
		
	}

}

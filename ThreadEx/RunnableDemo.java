package ThreadEx;


class ThreadOne implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{	
			System.out.println("print thread one");
	
		}
		try
		{
			Thread.sleep(500);
		}
		
		catch(Exception e)
		{
			
		}
		
	}
}
class ThreadTwo implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{	
			System.out.println("print thread one");
	
		}
		try
		{
			Thread.sleep(500);
		}
		
		catch(Exception e)
		{
			
		}
		
	}
}
public class RunnableDemo 
{
	//ThreadOne obj1=new ThreadOne();
//	ThreadTwo obj2=new ThreadTwo();
	
	Thread t1=new Thread(obj1);
	Thread t2=new Thread(obj2);
	
	t1.start();
	t2.start();
}

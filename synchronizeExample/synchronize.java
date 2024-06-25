package synchronizeExample;


//synchronization process -thread safe
class counter
{
	private int count; //5
	
	public synchronized void increment()
	{
		count=count+1; //6=t1 //6=t2
	}
	
	public int getCount()
	{
		return count;
	}
}


public class synchronize {
	public static void main(String args[])
	{
		counter c=new counter();
		
		Thread t1=new Thread(()->
		{
			for(int i=0;i<20;i++)
			{	
				c.increment();
				
			}
		});
	
		Thread t2=new Thread(()->
		{
			for(int i=0;i<20;i++)
			{	
				c.increment();
				
			}
		});
		t1.start();
		t2.start();
			
		//t1.join();
	//	t2.join();
	
		System.out.println(c.getCount());
		
	}
}

package exceptionExample;

public class Example1 {

	public static void main(String[] args) {
		
		int a,b,c;
		a=12;
		b=0;
		try {
		
			c=a/b;
		
			System.out.println("will not be printed");
		}
		
		catch(ArithmeticException ar)
		{
			System.out.println(ar.getMessage());
		}
		
		catch(Exception eo)
		{
			System.out.println("can not divide any number"+eo.getMessage());
		}
		finally
		{
			System.out.println("bye...bye.....");
		}
		
	}

	
}

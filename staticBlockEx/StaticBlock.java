package staticBlockEx;

public class StaticBlock {
	  
	// Constructor   
	StaticBlock()   
	{  
	System.out.println("Inside the constructor of the class.");  
	}  
	  
	public static void print()   
	{  
	System.out.println("Inside the print method.");  
	}  
	  
	static  
	{  
	System.out.println("Inside the static block.");   
	}  
	  
	
	public static void main(String[] args)   
	{  
	  
	StaticBlock s = new StaticBlock();  
	s.print();
	  
	new StaticBlock();  
	  
	}  
	
}

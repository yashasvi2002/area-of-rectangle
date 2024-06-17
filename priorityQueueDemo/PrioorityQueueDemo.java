package priorityQueueDemo;

import java.util.*;

public class PrioorityQueueDemo 
{
	public static void main(String[] args)
	{
		Queue<String> p=new PriorityQueue<>();
		p.add("Core Java");
		p.add("C");
		p.add("Python");
		p.add("Advance Java");
		System.out.println(p);
		
		
		//using remove method
		p.remove("Advance Java");
		System.out.println("after removed"+p);
		
		//using poll method
		System.out.println("poll method:"+p.poll());
		System.out.println(p);
		
		
		//using peek method
		System.out.println("peek method:"+p.peek()); //display the head element
		System.out.println(p);
		
				
		
	}

}

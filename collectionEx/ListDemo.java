package collectionEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
	
	public static void main(String args[])
	{
		List l=new ArrayList(); //created empty raw arraylist (allow hetrogeneous element)
		System.out.println("size :"+l.size()); // hetrogeneous means same data type
		System.out.println("is list empty?"+l.isEmpty());
		l.add(10);
		l.add(20);
		l.add(true);
		l.add(false);
		l.add(80);
		l.add("hello");
		l.add(32.43);
		l.add('A');
		l.add(20);
		l.add(5,"Hii");
		l.add(8);
		
		System.out.println("List is:"+l);
		
		System.out.println(" is List contains 15:"+l.contains(15));
		l.remove(false);
		System.out.println("List is:"+l);
		
		//need to give the value from integer to remove from list
		l.remove(20);
		System.out.println("List is:"+l);
		
		System.out.println(" element as 5th location is:"+l.get(5));
		System.out.println("element removed:"+l.remove(l.lastIndexOf(10))); //last occurence of 10
		System.out.println("element removed:"+l.remove(l.indexOf(10))); //particular occurence
	
		System.out.println("List is:"+l);
		
		/*
		Collections.sort(l);
		System.out.println("List is:"+l);
		*/
		
		l.clear();
		System.out.println("List is clear:"+l);
		
		
		//Array List
		
		 ArrayList<String> a = new ArrayList<String>();
		 a.add("jignasha");
		
		
		
	}
}

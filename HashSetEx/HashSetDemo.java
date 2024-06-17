package HashSetEx;

import java.util.*;
public class HashSetDemo {
	
	static void addElement(HashSet<Integer> h)
	{
		h.add(61);
		h.add(20);
		h.add(52);
		h.add(44);
		h.add(72);
		System.out.println(h.add(20)); //does not allow duplicate value -- false
	}
	
	public static void main(String[] args) 
	{
		HashSet<Integer> h=new HashSet<>();
		addElement(h);
		
		HashSet<Integer> h1=new HashSet<>();
		h1.add(75);
		h1.add(20);
		h1.add(10);
		h1.add(67);
		h1.add(79);
		System.out.println("set 1:"+h);
		System.out.println("set 2:"+h1);
		
		
		HashSet<Integer> h2=new HashSet<>();
		addElement(h2);
		
		//union of two set
		h2.addAll(h1);
		System.out.println("resulatant set 2:"+h2);
		
		h2.clear();
		addElement(h2);
		
		
		h2.removeAll(h1);
		System.out.println(h1);
		
		
	}

}

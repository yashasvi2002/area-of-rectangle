package VectorClassEx;

import java.util.*;
public class VectorClass {

	//Linked List   :-   add(),addFirst(),addLast(),geFirst(),getLast(),removeFirst(),removeLast(),sort(),reverse()
	
	public static void main(String[] args) {
		Vector<String> animals=new Vector<>();
		animals.add("dog");
		animals.add("cat");
		animals.add("sloth");
		System.out.println("Intital vector"+animals);

		//using get method
		String element=animals.get(2);
		System.out.println("element at index 2:"+element);
		
		//using iterator
		Iterator<String> i=animals.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
			System.out.println(", ");

		}
		element=animals.remove(1);
		System.out.println("Removeed element is:"+element);
		System.out.println("new vector"+animals);
		
		
	}

}

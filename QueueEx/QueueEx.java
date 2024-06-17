package QueueEx;
import java.util.*;
public class QueueEx {

	public static void main(String[] args) {
		
		Queue<Integer> q=new LinkedList<>();
		//add elements of 5 in the queue
		
		for(int i=0;i<5;i++)
		{
			q.add(i);
			
			System.out.println(q);
		}
		int removable=q.remove(); //remove the head of the element
		System.out.println(removable);
		
		System.out.println(q);
		System.out.println();
		
		int head=q.peek(); //retriving the head lement
		System.out.println(q);
		
		System.out.println();
		
		
		int size=q.size();
		System.out.println(size);
		
	}

}

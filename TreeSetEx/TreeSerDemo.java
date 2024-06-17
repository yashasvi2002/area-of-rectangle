package TreeSetEx;

import java.util.*;
public class TreeSerDemo {

	public static void main(String[] args) {
		
		TreeSet<String> t=new TreeSet<>();
		t.add("core java");
		t.add("python");
		t.add("c++");
		t.add("javascript");
		t.add("springBoot");
	//	t.add(null);  throw an error
		
		System.out.println("courses are:"+t);
		
		//subset method
		Set<String> s=t.subSet("javascript",true,"springBoot",true);
		System.out.println("courses subset is:"+s);
		
		
		
	}

}

package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		//create a stream from set of value
		Stream<Integer> stream = Stream.of(10,20,30,40,50,60,70,10);
		
		//counting the value
		System.out.println(stream.count());
		 //stream.forEach(System.out::println);

		//creating array
		Integer[] values=new Integer[] {10,20,30,34,56,43,79};
		
		//creating the stream from array
		stream=Arrays.stream(values);
		
		//map
		System.out.println("squre of "+Arrays.toString(values)+"is as follows");
		// 1) stream.map(num ->num*num).forEach(System.out::println);
		// OR 1)
		stream=stream.map(n->n*n);
		stream.forEach(System.out::println);
		
		//limit
		System.out.println("first 2 elements are");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		
		//skip
		System.out.println("elements  except first 3:");
		Arrays.stream(values).skip(3).forEach(System.out::println);
		
		//distinct
		System.out.println("distinct elements  are:");
		Arrays.stream(values).distinct().forEach(System.out::println);
		
		List<String> words = Arrays.asList("Hello", "Stream", "Learning");
		//words.add("In Java"); //Immutable list
		
		 // creating a stream from a List
		Stream<String> stream1 = words.stream();

		// map
		System.out.println("Strings in uppercase : ");
		List<String> s1 = stream1.map(str -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(s1);
		
		stream1 = words.stream();
		stream1.map(str->str.toLowerCase()).forEach(System.out::println);
		System.out.println(words);

		//words.add("Happy"); //immutable list
		
		//create a stream from list
		//1) toUpperCase,2)toLowerCase,3)collect ------->collectiors------->applicable in list and set
		
	
	}

}

package lamdaExpressionEx;

import java.util.stream.Stream;

public class lamdaExpresionWithParameter {

	public static void main(String[] args) {
		//using lamda expression
		
		//message
		Message m1=(name) -> { 
		System.out.println("Hello "+name);
		};
		m1.greet("jignasha");
		
		
		//cube
		Cube c=(a) -> { 
			return(a*a*a);
		};
		System.out.println("cube fof 5 is "+c.calculate(5));
		
		//cube
		Cube c1=(a) ->a*a*a;
		System.out.println("cube fof 4 is "+c.calculate(4));
		
		
		Stream<Integer> stream = Stream.of(10,20,30,40,50,60);
		Function<Integer,Integer>sqr=(n)->n*n;
		Stream.map(sqr).forEach(System.out::println);
		
		//IsOdd
		IsOdd o=(a) -> a % 2 != 0 ? true : false; 
		System.out.println("is 7 odd number ?"+o.checkOdd(7));
		System.out.println("is 8 odd number ?"+o.checkOdd(8));
			
		
			
		
	}
	
	}

}

package JunitEx;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//demonstrate disable testing
//@Disabled
public class DisableTest 
{
	@Test
	void test1()
	{
		System.out.println("Test 1.....");
	}

	@Disabled  //it is doesn't work and it is skip
	@Test
	void test2()
	{
		System.out.println("Test 2.....");
	}
	
	@Test
	void test3()
	{
		System.out.println("Test 3.....");
	}
}

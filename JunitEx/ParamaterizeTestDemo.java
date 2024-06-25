package JunitEx;

import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class ParamaterizeTestDemo {

	@ParameterizedTest
	@ValueSource(strings={"racecar","radar","madam","string"})
	public void  testPalindromes(String word)
	{
		assertTrue(word.equals(new StringBuffer(word).reverse().toString()));
	}
}

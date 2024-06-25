package JunitEx;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test; //assumption --> assumeTrue,assumeFalse,assumingThat

//assertion testing method
public class AssertTest {
	@Test
	public void testForEquals()
	{
		int result=1;
		int expected=1;
		assertEquals(result,expected);
	}
	
	@Test
	public void testForAssertTrue()
	{
		assertTrue("Hello".contains("e"));
	}

	@Test
	public void testForAssertFalse()
	{
		assertTrue("Hello".contains("e"));
	}
	
	@Test
	public void testForNull()
	{
		String s=null;
		assertNull(s);
	}
	
	@Test
	public void testForAssertThrow()
	{
		
		assertThrows(IllegalArgumentException.class,()->){
			throw new IllegalArgumentException("Invalid Arguments");
		});
	}

	
}

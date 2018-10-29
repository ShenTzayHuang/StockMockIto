package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

// import static org.hamcrest.CoreMatchers.hasProperty;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;

import product.Euro;

public class EuroTest {
	@Rule
	public ExpectedException expt = ExpectedException.none();
	
	private Euro seven5, seven7, one, two, three;
	
	
	@Before
	public void setUp() throws Exception {
		 seven5= new Euro(7.50);
		 seven7 = new Euro(7.5);
		 one = new Euro(1.00);
		 two = new Euro(2.00);
		 three = new Euro(3.00);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test 
	public void testEquality()
	{
		System.out.println("2 =?? @quals   ..." + two);
		//System.out.println("Equal ...." + System.currentTimeMillis());
		assertTrue(seven5.equals(seven7));
		// fail("tempoary bad");
	}
	
	@Test
	public void testToString() {
		System.out.println("2 as is   ..." + two);
		assertEquals("Euro 2.00", two.toString());
		// System.out.println("ToString ...." + System.currentTimeMillis());

		assertEquals("Euro 7.50", seven5.toString());
		two = new Euro(2.50);
		System.out.println("2 --> 2.50   ..." + two);
		// fail("Not yet implemented");
	}

	@Test
	public void testInquality()
	{
		System.out.println("2 =?? @Inquals   ..." + two);
		// 
		//assert 1 == 1;
		
		// System.out.println("InEqual ...." + System.currentTimeMillis());
		assertFalse("七不等於 三", seven5.equals(three));
	}	
	
	@Test
	public void testSubstraction() {
		System.out.println("2 =?? @substraction   ..." + two);
		assertEquals(new Euro(1), new Euro(3).minus(new Euro(2)));
		// System.out.println("ToString ...." + System.currentTimeMillis());

		assertEquals(new Euro(2), new Euro(5).minus(new Euro(3)));
		// ("Not yet implemented");
	}
	
	
	
}

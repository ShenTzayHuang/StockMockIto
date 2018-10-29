package test;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import product.Euro;
import org.junit.rules.ExpectedException;

public class EuroTest2 {
	private Euro seven5, seven7, one, two, three;
	@Rule
	public ExpectedException expt = ExpectedException.none();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		seven5= new Euro(7.50);
		 seven7 = new Euro(7.5);
		 one = new Euro(1.00);
		 two = new Euro(2.00);
		 three = new Euro(3.00);
	}


	@Test
	public void testNumericSafety()
	{
		System.out.println("2 =?? @numeric   ..." + two);
		Euro e = new Euro(1.03).minus(new Euro(0.42));
		System.out.println("The Value " + e.amount);
		assertEquals("Some Error", new Euro(0.61),e);
		}
	
	@Test
	public void testException()
	{
		try {
			two.someException(1);
			fail("expected exception no happen");
		}
		catch (RuntimeException e)
		{
			System.out.println("Expecetion as " + e);	
			// assertTrue((1 == 1));
		}
		finally {
		}

	}
	
	@Test(expected=RuntimeException.class)
	public void testException2()
	{
			two.someException(1);
			// fail("expected exception no happen");
	}
	
	@Test
	public void testException3()
	{
			expt.expect(RuntimeException.class);
			expt.expectMessage(startsWith("some"));
			two.someException(1);
			// fail("expected exception no happen");
	

	}
}

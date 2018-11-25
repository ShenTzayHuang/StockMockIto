package testSpec;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.timeout;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import main.CalculatorService;
import main.MathApplication;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {
	   private MathApplication mathApplication;
	   private CalculatorService calcService;
	   
	@Before
	public void setUp() throws Exception {
	      mathApplication = new MathApplication();
	      calcService = mock(CalculatorService.class);
	      mathApplication.setCalculatorService(calcService);
	}

	@After
	public void tearDown() throws Exception {
	}

//	   //@InjectMocks annotation is used to create and inject the mock object
//	   @InjectMocks 
//	   MathApplication mathApplication = new MathApplication();
//
//	   //@Mock annotation is used to create the mock object to be injected
//	   @Mock
//	   CalculatorService calcService;

	   @Test
	   @Ignore
	   public void testAdd(){
	      //add the behavior of calc service to add two numbers
	      when(calcService.add(10.0,20.0)).thenReturn(30.00);
			
	      //test the add functionality
	      assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
	      
	      //verify the behavior
	      verify(calcService).add(10.0, 20.0);
	   }
	   
	   @Test
	   @Ignore
	   public void testAdd2(){
	      //add the behavior of calc service to add two numbers
	      when(calcService.add(10.0,20.0)).thenReturn(30.00);
			
	      //test the add functionality
	      assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
	       
	      //verify the behavior
	      // verify(calcService).add(20.0, 30.0);
	   }
	   
	   @Test
	   @Ignore
	   public void testAdd3(){
	      //add the behavior of calc service to add two numbers
	      when(calcService.add(10.0,20.0)).thenReturn(30.00);
			
	      //add the behavior of calc service to subtract two numbers
	      when(calcService.subtract(20.0,10.0)).thenReturn(10.00);
	      
	      //test the add functionality
	      assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
	      assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
	      assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
	      
	      //test the subtract functionality
	      assertEquals(mathApplication.subtract(20.0, 10.0),10.0,0.0);
	      
	      //default call count is 1 
	      verify(calcService).subtract(20.0, 10.0);
	      
	      //check if add function is called three times
	      verify(calcService, times(3)).add(10.0, 20.0);
	      
	      //verify that method was never called on a mock
	      verify(calcService, never()).multiply(10.0,20.0);
	   }
	   
	   @Test
	   public void testAddAndSubtract(){

	      //add the behavior to add numbers
	      when(calcService.add(20.0,10.0)).thenReturn(30.0);

	      //subtract the behavior to subtract numbers
	      when(calcService.subtract(20.0,10.0)).thenReturn(10.0);

	      //test the subtract functionality
	      assertEquals(mathApplication.subtract(20.0, 10.0),10.0,0);

	      //test the add functionality
	      assertEquals(mathApplication.add(20.0, 10.0),30.0,0);

	      //verify call to add method to be completed within 100 ms
	      verify(calcService, timeout(100)).add(20.0,10.0);
		  
	      //invocation count can be added to ensure multiplication invocations
	      //can be checked within given timeframe
	      verify(calcService, timeout(100).times(1)).subtract(20.0,10.0);
	   }
}

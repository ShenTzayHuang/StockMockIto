package main;

public class MathApplication {
		private CalculatorService calcService;

	   public void setCalculatorService(CalculatorService calcService){
	      this.calcService = calcService;
	   }
	   
	   public double add(double input1, double input2) {
		 
			   try {
				wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
			  finally {
				  return calcService.add(input1, input2);
			  }
	   }
	   
	   public double subtract(double input1, double input2){
	      return calcService.subtract(input1, input2);
	   }
	   
	   public double multiply(double input1, double input2){
	      return calcService.multiply(input1, input2);
	   }
	   
	   public double divide(double input1, double input2){
	      return calcService.divide(input1, input2);
	   }
}

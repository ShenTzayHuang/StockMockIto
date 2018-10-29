
package product;

public class Euro {
	private static final double CentRate = 100.0;
	public int amount;
	
	public Euro(double amount)
	{
		this.amount = (int) (amount *CentRate);
		// this.amount = amount ;
	}
	
	
	@Override
	public String toString()
	{	
		return String.format("Euro %.2f",  amount/CentRate);
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		
		return (o instanceof Euro) && amount == ((Euro) o).amount;
	}
	
	public Euro minus(Euro e)
	{
		// Euro result = new Euro(0);
		// assert 4 < result.amount;
		// .amount = amount - e.amount;
		return new Euro((amount - e.amount) / CentRate);
	}


	public void someException(int i) throws RuntimeException {
		// TODO Auto-generated method stub
		if (i == 1) {
			throw new RuntimeException("some exception test");
		}
		else
		{
			this.amount = 0;
		}
	}
	
}

package product;

public class EuroApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Euro e1 = new Euro(2.30);
		Euro e2 = new Euro(4.5);
		System.out.println("E1 is " + e1.toString());
		System.out.println("E1 is " + e2.toString());
		Euro e3 = e2.minus(e1);
		System.out.println("Reslut is " + e3.toString());

	}

}

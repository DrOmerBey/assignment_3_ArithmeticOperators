package Assignment_3_ArithmeticOperators;

public class question_7 {

	public static void main(String[] args) {
		
		double price=95;
		double refund, quarters, dimes, nickels, bill;
		
		bill=100;
		refund=bill-price;
		
		quarters=refund/25;
		refund=refund%25;
		
		dimes=refund/10;
		refund=refund%10;
		
		nickels=refund/5;
		refund=refund%5;
		
		System.out.println("Price in cents : "+ price);
		System.out.println("Your change is "+ quarters+ " quarters, " + dimes + " dimes, and "+ nickels + " nickels");
		
	}

}

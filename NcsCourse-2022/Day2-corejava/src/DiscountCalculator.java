
public class DiscountCalculator {
	
	void calculateDiscount(double actualPrice, double discountPc, String prodname) {
		
		double discountedPrice = actualPrice - (actualPrice*discountPc/100);
		
		System.out.println("The ProductName = "+ prodname);
		System.out.println("Actual Price =" +actualPrice);
		System.out.println("Discount ="+discountPc);
		System.out.println("Price after discount = "+ discountedPrice);
		
		
		
	}

}

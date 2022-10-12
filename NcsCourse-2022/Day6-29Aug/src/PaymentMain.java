
public class PaymentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Payment p1 = new CreditCardPayment();
//		p1.processPayment();
//		
//		p1 = new DebitCardPayment();
//		p1.processPayment();
//		
//		p1 = new InterenetBankingPayment();
//		p1.processPayment();
//		
//		p1 = new PaypalPayment();
//		p1.processPayment();
		
		PaymentService ps = new PaymentService();
		ps.processPayment();
		
		

	}

}

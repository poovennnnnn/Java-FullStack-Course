
public class PaymentService {

	
	Payment p1 = new DebitCardPayment();
	
	public void processPayment() {
		p1.processPayment();
	}

}

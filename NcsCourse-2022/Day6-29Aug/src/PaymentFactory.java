
public class PaymentFactory {
	
	public static Payment createProcesssPayment(String str) {
		
		if(str.equalsIgnoreCase("credit")) {
			return new CreditCardPayment();
		}else if(str.equalsIgnoreCase("debit")) {
			return new DebitCardPayment();
		}if(str.equalsIgnoreCase("internet")) {
			return new InterenetBankingPayment();
		}
		else {
			return new CreditCardPayment();
		}
	}

}


public class FlightTicketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlightTicket f;
		EconomyTickect e1 = new EconomyTickect(748,"changi","chennai", 1920);
		e1.setFreeExtraLuggage("cococala");
		BuisnessTicket b1 = new BuisnessTicket(748,"bangok","newyork", 1920);
		b1.setExtraLuggage(15);
		
		FlightUtility.bookTicket(e1);	
		FlightUtility.bookTicket(b1);
		
	}

}

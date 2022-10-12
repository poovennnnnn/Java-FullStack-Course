
public class MovieTicketMain {
	

	public static void main(String[] args) {
		
		MovieTicket m1 = new MovieTicket();
		MovieTicket m2 = new MovieTicket();
		
		m1.bookTicket(27);
		
		System.out.println("After m1 BOOKED");
		m2.bookTicket(34);


	}

}

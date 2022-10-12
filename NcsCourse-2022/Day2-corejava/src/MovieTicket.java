
public class MovieTicket {
	
	static int availableSeat = 100;
	static int totalBokking;
	
	void bookTicket(int numberOfTicket) {
		
		if (numberOfTicket > availableSeat) {
			System.out.println("Insufficient Tickets to book ");
		}else {
			System.out.println("Before booking ="+availableSeat);
			availableSeat -= numberOfTicket; 
			totalBokking += numberOfTicket; 
			System.out.println("Your ticket is confirmed");
			System.out.println("After Booking Available seats = "+ availableSeat);
			System.out.println("Total booking is" +totalBokking);
			
			
		}
	
		
		
	}

}

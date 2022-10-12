
public class BookingFactory {
	
	public static Booking createBooking(String str) {
		
		if(str.equals("Aaa")) {
			return new AaaBooking();
		}
		return new XyzBooking();
	}

}

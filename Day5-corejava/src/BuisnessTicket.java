
public class BuisnessTicket extends FlightTicket{
	
	private int ExtraLuggage;

	public int getExtraLuggage() {
		return ExtraLuggage;
	}


	public void setExtraLuggage(int extraLuggage) {
		ExtraLuggage = extraLuggage;
	}


	public BuisnessTicket() {
		// TODO Auto-generated constructor stub
	}
	

	public BuisnessTicket(int flightNum, String origin, String dest, int depTime) {
		super(flightNum, origin, dest, depTime);
		// TODO Auto-generated constructor stub
	}


	

	@Override
	public void showBenefits() {
		// TODO Auto-generated method stub
		System.out.println("Benefits for BuisnessClass");
		
		System.out.println("Boarding is prirotity");
		System.out.println("Special Seating");
		System.out.println("-------------------");
		
	}

}

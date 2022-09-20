
public class EconomyTickect extends FlightTicket{
	
	private String softDrink;

	public String getFreeExtraLuggage() {
		return softDrink;
	}

	public void setFreeExtraLuggage(String freeExtraLuggage) {
		this.softDrink = freeExtraLuggage;
	}

	public EconomyTickect(int flightNum, String origin, String dest, int depTime) {
		super(flightNum, origin, dest, depTime);
		// TODO Auto-generated constructor stub
	}

	public EconomyTickect() {
		// TODO Auto-generated constructor stub
	}
	


	



	@Override
	public void showBenefits() {
		// TODO Auto-generated method stub
		
		System.out.println("Benefits for Economy");
	
		System.out.println("Boarding is ordinary");
		System.out.println("seating is standard");
		System.out.println("-------------------");
		
	}

}

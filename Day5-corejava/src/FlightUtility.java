
public class FlightUtility {
	
	public static void bookTicket(FlightTicket f) {
		f.print();
		
		if(f instanceof BuisnessTicket) {
			BuisnessTicket b = (BuisnessTicket) f;
			System.out.println("ExtraLuggage is = "+b.getExtraLuggage());
			
		}else if(f instanceof EconomyTickect) {
			EconomyTickect e = (EconomyTickect) f; 
			System.out.println("SoftDrink =+"+e.getFreeExtraLuggage());
			
		}
		
		f.showBenefits();
		
		
		
	}

}

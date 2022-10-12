
public abstract class FlightTicket {
	int flightNum;
	String origin;
	String dest;
	int depTime;
	
	public FlightTicket() {
		// TODO Auto-generated constructor stub
	}

	
	
	public FlightTicket(int flightNum, String origin, String dest, int depTime) {
		super();
		this.flightNum = flightNum;
		this.origin = origin;
		this.dest = dest;
		this.depTime = depTime;
	}



	public int getFlightNum() {
		return flightNum;
	}



	public void setFlightNum(int flightNum) {
		this.flightNum = flightNum;
	}



	public String getOrigin() {
		return origin;
	}



	public void setOrigin(String origin) {
		this.origin = origin;
	}



	public String getDest() {
		return dest;
	}



	public void setDest(String dest) {
		this.dest = dest;
	}



	public int getDepTime() {
		return depTime;
	}



	public void setDepTime(int depTime) {
		this.depTime = depTime;
	}
	
	public void print() {
		System.out.println("sdf");
	}

	public abstract void  showBenefits();

}

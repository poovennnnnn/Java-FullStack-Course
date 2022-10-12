
public class Address {
	
	private int zip;
	private String city;
	
	Address(){
		
	}
	
    Address(int zip , String city){
    	this.city=city;
    	this.zip = zip;
		
	}
	
	
	@Override
	public String toString() {
		return "Address [zip=" + zip + ", city=" + city + "]";
	}

	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}


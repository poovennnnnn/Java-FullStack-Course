
public class Customer {
	private int customerId;
	private String customerName;
	private Address address;
	
	
	Customer(){
		System.out.println("default Constructor");
		
	}
    Customer(int customerId , String customerName){
    	this.customerId = customerId;
    	this.customerName=customerName;
    	System.out.println("2 param Constructor");
	}
    
    Customer(int customerId , String customerName,Address address){
    	this.customerId = customerId;
    	this.customerName=customerName;
    	this.address=address;
    	System.out.println("3 param Constructor form customer");
		
	}
	
    
    void print() {
    	System.out.println("Customer Id : "+ customerId);
    	System.out.println("customer Name :"+ customerName);
    	System.out.println("Customer Address : " + address );
    	System.out.println("--------------------------------");
    }
	
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}

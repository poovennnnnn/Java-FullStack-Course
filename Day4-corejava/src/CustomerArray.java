
public class CustomerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("printing customer before creating");
		Customer cus[]= new Customer[5];
		for(int k=0; k<5;k++) {
			System.out.println(cus[k]);
		}
		
		System.out.println("printing customer when creating");
		for(int i=0; i<5;i++) {
			cus[i]= new Customer((i+1),("city"+i+1),new Address(i+100, ("city"+i+1)));
		}
		
	
		for(int i=0; i<5;i++) {

			cus[i].print();
		}
		
		

	}

}

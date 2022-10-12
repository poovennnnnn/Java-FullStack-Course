
public class Test {
	Test(){
		System.out.println("default Constructor");
	}
	
	Test(int i){
		System.out.println("single parameter constructor");
	}

	Test(int i , int j){
		System.out.println("double parameter constructor");
	}

	Test(String str){
		System.out.println("String single parameter constructor");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		Test t1 = new Test(10);
		Test t2 = new Test(10,10);
		Test t3 = new Test("hello");
		
		print();
		
		
		
	}
	
//	static void print() {
//		int number[]= new int[5];		
//		for(int i=0; i<5;i++) {
//			System.out.println(number[i]);
//		}
//	}
	
	static void print() {
		
		
		int number[]= new int[5];	
		
		for(int i=0; i<=number.length;i++) {
			System.out.println(number[i]);
			
		}
		
		String str[] = new String[5];		
		for(int j=0; j<5;j++) {
			System.out.println(str[j]);
		}
		
		Customer cus[]= new Customer[5];
		for(int k=0; k<5;k++) {
			System.out.println(cus[k]);
		}
		
	}

	

}

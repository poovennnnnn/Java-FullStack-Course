
public class Test1 {
	int i;
	
	Test1(int i){
		System.out.println("hello from constructor");
		this.i = i;
		
	}
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1(10);
		Test1 t2 = new Test1(23);
		Test1 t3 = new Test1(434);
		Test1 t4 = new Test1(234);
		
		System.out.println(t1.i+" "+t2+" "+t3+" "+t4);
		
	}

}

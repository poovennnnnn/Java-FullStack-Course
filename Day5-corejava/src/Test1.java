import java.util.ArrayList;
import java.util.List;

class A1{
	A1(){
		System.out.println("A");
	}
	
}
class B1 extends A1{
	B1(){
		System.out.println("B");
	}
	
}
class C extends B1{
	C(){
		System.out.println("c");
	}
	
}

class A2{
	int i = 20;
    void m1() {
		System.out.println("m1 of A2");
	}
}

class B2 extends A2{
	int i = 10;
	void m1() {
		System.out.println("m1 of B2");
	}
	
    void m2() {
		System.out.println("I ="+i);
		System.out.println("I ="+super.i);
		
		super.m1();
	}
}

 class C2 extends B2{
	int i = 5;
	final void m1() {
		System.out.println("m1 from c2");
		
		
	}
	
	void m2() {
		System.out.println("I = "+i);
		m1();
		super.m1();
		super.m2();
	}
}




public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new C();
		
		C2 b = new C2();
		b.m1();	
		
		List<String> str = new ArrayList<>();

	}
} 

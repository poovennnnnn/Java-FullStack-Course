class Test{
	
	// these are the instance variables 
	// variable intiallized(0 Or NUll) whenever the object of this class is created
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean bool;
	
	String str = "hello";
	String Str1 ;
	Customer c1;
	Student s1= new Student() ;
	Product p = new Product();
	
	void print() {
		//lcoal variable
		//variable is only loaded when its intialized 
		int x =0;
		int y;
	}
	
}

class Customer{}
class Student {
	int studentId;
	String studentName;
}
class Product {}


public class TestMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Test t = new Test();
	  
	  System.out.println(t.b);
	  System.out.println(t.s);
	  System.out.println(t.i);
	  System.out.println(t.l);
	  System.out.println(t.f);
	  System.out.println(t.d);
	  System.out.println(t.c);
	  System.out.println(t.bool);
	  
	  
	  System.out.println(t.c1);
	  System.out.println(t.s1);
	  System.out.println(t.p);
	  System.out.println(t.str.length());
	  
	  // this will give  you NullPointer Eception
	  //because the str1 = null and not initialized
	  
//	  System.out.println(t.Str1.length());
	  
	  System.out.println(t.s1.studentId=101);
	  System.out.println(t.s1.studentName="kavin");
	  
		

	  

		
		

	}

}





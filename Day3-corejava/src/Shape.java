
public class Shape {
	
	double pi = 3.14;
	
	void area(double r) {
		System.out.println("Area of Circle " +(pi * (r * r)));
	}
	
	void area(double h , double b) {
		System.out.println("Area of triangle " +(b *h)/2);
	}
	void area(int side) {
		System.out.println("Area of square " + side*side);
	}

}


public class ProductMain {

	public static void main(String[] args) {
		
        Product p1 ,p2;
        
        p1 = new Product();
        p2 = new Product();
        
        p1.productId=101;
        p1.productName="airpods";
        p1.printProductDetails();
        
        p2.productId=102;
        p2.productName="iwatch";
        p2.printProductDetails();
		

	}

}

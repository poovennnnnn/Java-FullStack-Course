
public class ArrayInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[]= {123,323,23,23,23};
		String str1[]= {
				"one","two","three"};
		
		Customer c[] = {
				new Customer(101,"hari",new Address(34235,"tokyo")),
				new Customer(102,"pooven",new Address(342343254,"berlin")),
				new Customer(103,"amrish",new Address(34234325,"moscow"))
		};
		
		int num[][] = {
				{1,2,3},
				{3,3,4},
				{2,4,4}
				
		};
		
		String str[][] = {
				{"one","two","three"},
				{"one","two","three"},
				{"one","two","three"},
				
		};
		
		
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(num[i][j]+"  ");
//				System.out.print(str[i][j]+"  ");
				
			}
			System.out.println();
		}
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
//				System.out.print(num[i][j]+"  ");
				System.out.print(str[i][j]+"  ");
				
			}
			System.out.println();
		}
		

	}

}

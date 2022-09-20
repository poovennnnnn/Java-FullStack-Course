import java.util.LinkedList;
import java.util.concurrent.Callable;

public class IntegerCallable  implements Callable<Integer>{
	

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		
		
		int sum =0;
		for(int i=0;i<10;i++) {
			sum +=i;
		}
		return sum;
	}
	
	LinkedList <String> list = new LinkedList<>();

}

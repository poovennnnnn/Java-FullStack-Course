
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EsMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
		// TODO Auto-generated method stub
		
		ExecutorService es = Executors.newFixedThreadPool(100); // Executor Service 
		
		
		Future<Integer> f1 = es.submit(new IntegerCallable()); // Future interface
//		es.shutdownNow();
		
		int i = 0;

		
		i = f1.get();
	
		
		System.out.println("sum ="+i);
//		es.shutdownNow();
		
		
		Future<String> f2 = es.submit(()-> "hello world");
		
		
		System.out.println(f2.isDone());
		es.shutdownNow();
		
		
		FileInputStream fin = new FileInputStream("hello.txt");
		FileOutputStream fout = new FileOutputStream("target.txt");
		
	    int j = 0;
		
		do {
			j = fin.read();
		
			
			if(j != -1) {
				fout.write(i);
	
			}
		}while(j !=-1);
		System.out.println("File copied");

		fin.close();
		fout.close();
		
	}

}


public class Q {

	int n;
	
	boolean flag = false;
	public synchronized int get() {
		
		while(!flag)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Consumed: "+n);
		flag=false;
		notify();
		return n;
	}
	
	public synchronized void put(int n) {
		while(flag)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		this.n = n;
		flag = true;
		System.out.println("produced: "+n);
		notify();
		
	}
}

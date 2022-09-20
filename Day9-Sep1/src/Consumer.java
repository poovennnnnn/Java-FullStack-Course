
public class Consumer extends Thread {
	
	Q q;
	
	Consumer(Q q){
		this.q= q;
		new Thread(this,"consumerr").start();
	}

	
	public void run() {
		int i=0;
		while(i<10) {
			i++;
			q.get();
		}
	}
	
}

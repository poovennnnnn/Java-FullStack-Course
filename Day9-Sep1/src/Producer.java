
public class Producer extends Thread {
	
	Q q;
	
	Producer(Q q){
		this.q= q;
		new Thread(this,"producer").start();
	}

	
	public void run() {
		int i =0;
		while(i<10) {
			i++;
			q.put(i);
		}
	}
	
}

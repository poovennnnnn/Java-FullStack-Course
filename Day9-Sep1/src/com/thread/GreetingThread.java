package com.thread;

public class GreetingThread implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		GreetingThread t = new GreetingThread();
		new Thread(t).start();
		
			for(int i=1; i<100;i++) {
				System.out.println("Heloo Thread "+i);
				try {
					Thread.sleep(100000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
			for(int i=1; i<100;i++) {
				System.out.println("greetingThread "+i);
			}

	}

}

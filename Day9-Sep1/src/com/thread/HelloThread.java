package com.thread;

public class HelloThread extends Thread {
	
	public void run() {
		for(int i=1; i<100;i++) {
			System.out.println("Heloo Thread "+i);
		}
	}
	

}


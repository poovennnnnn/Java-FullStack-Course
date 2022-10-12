package com.thread;

public class CircleThread  extends Thread{
	
	public void run() {
		System.out.println("CircleThread");
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("CircleThread");
		
	}

}

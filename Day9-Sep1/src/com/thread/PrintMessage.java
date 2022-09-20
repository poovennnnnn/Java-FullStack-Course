package com.thread;

public class PrintMessage {
	
	public synchronized void print(String msg) {
		
		System.out.print("[");
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println(msg+"]");
	}

}

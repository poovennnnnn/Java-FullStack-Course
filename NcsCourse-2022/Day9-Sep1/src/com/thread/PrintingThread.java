package com.thread;

public class PrintingThread extends Thread{
	
	String msg;
	PrintMessage pm;
	
	public PrintingThread()  {
		
	}

	public PrintingThread(String msg, PrintMessage pm) {
		super();
		this.msg = msg;
		this.pm = pm;
	}
	
	public void run() {
		pm.print(msg);
	}

}

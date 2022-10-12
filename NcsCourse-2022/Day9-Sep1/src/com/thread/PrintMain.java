package com.thread;

public class PrintMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintMessage pm = new PrintMessage();
		PrintingThread t1 = new PrintingThread("java",pm);
		PrintingThread t2 = new PrintingThread("js",pm);
		t1.start();
		t2.start();
		

	}

}

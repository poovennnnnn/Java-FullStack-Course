package com.thread;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloThread h = new HelloThread();
		CircleThread c = new CircleThread();
		SquareThread s = new SquareThread();
		TriangleThread t = new TriangleThread();
		CircleThread c1 = new CircleThread();
		SquareThread s1 = new SquareThread();
		TriangleThread t1 = new TriangleThread();
		
		
		new TriangleThread().start();
		
//		h.start();
//		c.start();
//		c.start();
//		c1.start();
//		s.start();
//		s1.start();
//		t.start();
//		t1.start();
	}

}


//ArrayList<Hotel> arr = null;
//for(Hotel h: Hotel.database) {
//	if(h.getid == id){
//		arr.add(h);
//	}
//}
//
//for(hotel h: arr) {
//   //check the room id 
//}
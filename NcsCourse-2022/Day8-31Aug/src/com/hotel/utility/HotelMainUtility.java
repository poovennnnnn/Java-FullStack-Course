package com.hotel.utility;

import java.util.Scanner;

import com.hotel.dto.Customer;
import com.hotel.dto.Hotel;
import com.hotel.service.HotelServiceImpl;
import com.hotel.storedata.HotelStoreData;

public class HotelMainUtility {
	
	public static void start() {
		boolean bool = true;
	    Scanner sc = new Scanner(System.in);
	    Hotel hotel = null;
	    Customer cus = null;
	    HotelServiceImpl service = new HotelServiceImpl();
	    
	
	
	
	    do {
	    	System.out.println("S.no     hotelId      hotelName     roomType     costPerDay     avalability");
	    	int count = 1;
	    	for(Hotel h: HotelStoreData.arr) {
	    		System.out.println(count+"         "+h.getHotelId()+"         "+h.getHotelName()+"     "+h.getRoomType()+"        "+h.getCostPerDay()+"             "+h.getAvalability());
	    		count +=1;
	    	}
	   
	    	System.out.println("");
	    	System.out.println("1.Book Hotel  \n2.Exit");
	     	int x = sc.nextInt();
	    	
	    	
	    	switch(x) {
	    	case 1:{
	    		System.out.println("Enter a hotelId to book the hotel");
	    		int y = sc.nextInt();
//	    		String name = sc.next();
//	    	    int noOfPerson = sc.nextInt();
	    		
	    		hotel = service.findById(y);
	    		hotel.setAvalability("no");
	    		break;
	    		
	    	}
	    	default:{
	    		bool=false;
	    		System.out.println("Exited");
	    		break;
	    	}
	    	
	    	}
	
	     }while(bool);

	     }
	
	
}

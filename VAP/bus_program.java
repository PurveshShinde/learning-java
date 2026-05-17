package com.example.com;
import java.lang.*;

class bus extends Thread {
	int available =5;
	int seats;
	bus (int a){
		seats = a;
	}
	public synchronized void run () {
		String name = Thread.currentThread().getName();
		if (available >= seats) {
			System.out.println("Seats are booked for "+ name );
			available = available - seats ;
			
		} else {
			
			System.out.println( name + " We are Sorry");
			
		}
		
	}
}


public class bus_program {
	
	public static void main(String []args ) {
		int seats = 5;
		bus bs = new bus(2);
		Thread t1 = new Thread(bs);
		Thread t2 = new Thread(bs);
		Thread t3 = new Thread(bs);
		
		t1.setName("Purvesh");
		t2.setName("Amey");
		t3.setName("Aditya");
		
		t1.start();
		t2.start();
		t3.start();
		}

}

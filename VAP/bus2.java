package com.example.com;


class MT_004 //application
{
	int available = 10;
	synchronized void printBooking(int seat)
	{
		System.out.println("Hello : "+Thread.currentThread().getName());
		System.out.println("Hello : "+Thread.currentThread().getName());
		System.out.println("Hello : "+Thread.currentThread().getName());
		
		
		synchronized(this)
		{
			String name = Thread.currentThread().getName();
			if(available>=seat)
			{
				System.out.println("---------------\nSeats are booked, "+name+"\n--------------------");
				available = available - seat;
				System.out.println("Available seats are: "+available);
			}
			else
			{
				System.err.println("---------------\nSeats are not booked, "+name+"\n----------------------");
				System.out.println("Available seats are: "+available+" only");
			}
		}
		
		
		System.out.println("Bye : "+Thread.currentThread().getName());
		System.out.println("Bye : "+Thread.currentThread().getName());
		System.out.println("Bye : "+Thread.currentThread().getName());
		System.out.println("------------------------\n--------------------");


	}

}
public class bus2 extends Thread
{
	int seat;
	static MT_004 op;
	public void run()
	{
		op.printBooking(seat);
		
	}
	
	public static void main(String[] args)
	{
		//Application
		op = new MT_004();
		
		//threads
		bus2 t1 = new bus2();
		bus2 t2 = new bus2();
		
		t1.setName("Nish");
		t2.setName("jay");
		
		t1.seat = 7;
		t2.seat = 6;
		
		t1.start();
		t2.start();
		
	}
	
}
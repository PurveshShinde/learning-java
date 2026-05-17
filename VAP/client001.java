package com.example.com;
import java.io.IOException;
import java.io.PrintWriter;

import java.net.Socket;

public class client001 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		Socket socket = new Socket ("Localhost", 1600);
		
		//creates o/p channel to send data to server 
		//true : enables automatic flushing and msg sent immediediately  
		PrintWriter out=new PrintWriter (
				socket.getOutputStream(),true
				);
		
		//we will send the msg to server
		out.println("Hello Support Team. ");
		
		// internal data flow
		// client => o/p stream --> n/w ---> server inputStream
		
		//client disconeects 
		socket.close();

	}

}

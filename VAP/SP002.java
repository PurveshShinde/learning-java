package com.example.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SP002 
{
	
	public static void main(String args[]) throws IOException
	{
		Socket socket = new Socket("Localhost",1600);
		
		BufferedReader in = new BufferedReader(
				 new InputStreamReader(socket.getInputStream())  );
		
		PrintWriter out = new PrintWriter(
				socket.getOutputStream(),true	);
		
		out.println("A KNIEF");
		
		socket.close();
		
	}

}
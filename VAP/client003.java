package com.example.com;
import java.io.*;
import java.net.*;


class ClientHandle_DIET extends Thread
{
	Socket socket;
	static int balance = 1000;
	
	ClientHandle_DIET(Socket socket)
	{
		this.socket = socket;
	}
	
	public void run()
	{
		try
		{
			BufferedReader in = new BufferedReader(
					new InputStreamReader(socket.getInputStream())
			);
			
			PrintWriter out = new PrintWriter(
					socket.getOutputStream(),true
					);
			
			int deposit = Integer.parseInt(in.readLine());
			
			synchronized (ClientHandle_DIET.class)
			{
				balance = balance+deposit;
				out.println("Deposit Successfull.");
				out.println("Updated Bank Balance : "+balance);
			}
			socket.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class client003 {

	public static void main(String[] args) throws IOException
	{
		ServerSocket servSocket = new ServerSocket(1700);
		System.out.println("Bank Sever Started...");
		
		while(true)
		{
			Socket socket = servSocket.accept();
			new ClientHandle_DIET(socket).start();
		}
	}

}
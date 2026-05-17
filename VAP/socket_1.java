package com.example.com;
/*
 * socket prog:
 * socket => communication endpoint;
 * it act like a telephone commu.
 * client and server
 * client------->socket----->server
 * 
 */
import java.io.*;//used for: BufferedReader & InputStreamReader
import java.net.*;//for: networking : socket communication
                  //         ServerSocket & Socket

//server
public class socket_1 
{
	
	public static void main(String[] args) throws IOException
	{
		//create server on port: 1600 (we can use any port no.)
		//internal working : java opens port 1600 and listens for incoming client req.
		
		ServerSocket servSocket = new ServerSocket(1600);
		System.out.println("server waiting for client...."); //display msg
		
		//most imp: line/code. //server waits until client connect.
		//internal working : program will pause here and it stays blocked
		//                   until client sends request
		Socket socket = servSocket.accept();
		
		//creates input channels to receive msg from client.
		//socket.getInputStream: get raw data from client
		//InputStreamReader : convert byte data into readable character.
		//BufferedReader: reads text efficiently
		BufferedReader in = new BufferedReader(
		 new InputStreamReader(socket.getInputStream())		
				);
		//read one full line sent by client
		String message = in.readLine();
		System.out.println("Client says: "+message);
		
		//close connection with client
		socket.close();
		//stops server completely
		//port 1600 become free now
		servSocket.close();
		
		
	}

}
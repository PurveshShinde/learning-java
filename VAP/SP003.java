/*  * Topic socket programmiing + multi threading
 * difficult multi- client bank trans=ACTION SERVER
 * PROBLEM : MULTIPLE USER ACESS ATM SIMELTENEOUSLY
 * SOLUTION : 1. Create server so handles multiple clients
 */

package com.example.com;

import java.io.*;
import java.net.*;

class CLientHandler_DIET extends Thread {
    Socket socket;

    static int balance = 1000; // shared resource

    // FIX: constructor (removed return type)
    CLientHandler_DIET(Socket socket)
    {
        this.socket = socket;
    }

    public void run() {

        try {
            // FIX: BufferedReader spelling
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // FIX: readLine()
            int deposit = Integer.parseInt(in.readLine());

            // critical section
            synchronized (CLientHandler_DIET.class)
            {
                balance = balance + deposit;
                out.println("Updated Balance: " + balance);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class SP003 {

    public static void main(String[] args) throws IOException
    {
        // TODO Auto-generated method stub
        ServerSocket servSocket = new ServerSocket(1700);
        System.out.println("Bank Server Started....");

        while(true)
        {
            Socket socket = servSocket.accept();

            // FIX: class name typo
            new CLientHandler_DIET(socket).start();
        }
    }
}
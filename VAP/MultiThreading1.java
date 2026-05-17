//**
// *
// * Multithreading :
// * multiple threads (users) run on single application
// * multithreading shoudl follow 7 steps
// *
// * single threading - in st o/p is always same at all the time
// *                    in the st waiting time is too much
// *
// *  Multithreading =========>
// *  step1 : import java.lang pkg (already available)
// *  step2 : A) By extending thread class.
// *          B) By implementing Runnable interface.(Best approach)
// *  step3 : initialize the run() method.
// *  step4 : give the public access to the run() method.
// *  step5 : implement the run method (most difficult).
// *  step6 : create the number of Threads(thread means users).
// *  step7 : start all the Threads at same time.
// *
// *
// * Thread life Cycle : 
// * Phase 1 : Born state
// * Phase 2 : Ready State
// * Phase 3 : Execution State
// * Phase 4 : Block/Wait State
// * Phase 5 : Dead State
// * 
// * 
// */


package com.example.com;
import java.lang.*;

class MT extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Byee");
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}

public class MultiThreading1 {
    public static void main(String[] args) {

        MT op = new MT();

        op.start(); // start thread

        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Hello");
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
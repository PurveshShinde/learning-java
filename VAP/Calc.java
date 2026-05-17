package com.example.com;

class table {

    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}

class five extends Thread {
    table F;

    five(table f) {
        F = f;
    }

    public void run() {
        F.printTable(5);
    }
}

class seven extends Thread {
    table S;

    seven(table s) {
        S = s;
    }

    public void run() {
        S.printTable(7);
    }
}

public class Calc {
    public static void main(String[] args) {

        table op = new table(); // shared object

        five t1 = new five(op);
        seven t2 = new seven(op);

        t1.start();
        t2.start();
    }
}
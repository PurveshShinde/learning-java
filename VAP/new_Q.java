package com.example.com;

import java.util.Scanner;

public class new_Q {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gryff = 0, slyth = 0, raven = 0, huff = 0;

        int q = 1;

        // SWITCH (outermost)
        switch (q) {

            default:

                // IF-ELSE
                if (q == 1) {

                    // LOOP (inside if)
                    while (q <= 3) {

                        if (q == 1) {
                            System.out.println("\nQ1: What quality do you value most?");
                            System.out.println("1. Bravery  2. Ambition  3. Intelligence  4. Loyalty");
                            int a = sc.nextInt();

                            if (a == 1) gryff++;
                            else if (a == 2) slyth++;
                            else if (a == 3) raven++;
                            else if (a == 4) huff++;
                        }

                        else if (q == 2) {
                            System.out.println("\nQ2: Pick a pet:");
                            System.out.println("1. Owl  2. Snake  3. Cat  4. Badger");
                            int a = sc.nextInt();

                            if (a == 1) raven++;
                            else if (a == 2) slyth++;
                            else if (a == 3) gryff++;
                            else if (a == 4) huff++;
                        }

                        else if (q == 3) {
                            System.out.println("\nQ3: Choose a trait:");
                            System.out.println("1. Courage  2. Cunning  3. Wisdom  4. Kindness");
                            int a = sc.nextInt();

                            if (a == 1) gryff++;
                            else if (a == 2) slyth++;
                            else if (a == 3) raven++;
                            else if (a == 4) huff++;
                        }

                        q++;
                    }
                }
        }

        // RESULT
        System.out.println("\nYour House is:");

        if (gryff >= slyth && gryff >= raven && gryff >= huff)
            System.out.println("Gryffindor 🦁");
        else if (slyth >= gryff && slyth >= raven && slyth >= huff)
            System.out.println("Slytherin 🐍");
        else if (raven >= gryff && raven >= slyth && raven >= huff)
            System.out.println("Ravenclaw 🦅");
        else
            System.out.println("Hufflepuff 🦡");

        sc.close();
    }
}
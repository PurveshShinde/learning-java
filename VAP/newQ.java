package com.example.com;

import java.util.Scanner;

public class newQ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anywhereDoor = 0, bambooCopter = 0, timeMachine = 0, smallLight = 0;

        int q = 1;

        // SWITCH (outermost)
        switch (q) {

            default:

                // IF-ELSE
                if (q == 1) {

                    // LOOP (inside if)
                    while (q <= 3) {

                        System.out.println("\nQ" + q + ":");

                        if (q == 1) {
                            System.out.println("What do you want most?");
                            System.out.println("1. Travel anywhere  2. Fly freely  3. Go to past/future  4. Change size");
                            int a = sc.nextInt();

                            if (a == 1) anywhereDoor++;
                            else if (a == 2) bambooCopter++;
                            else if (a == 3) timeMachine++;
                            else if (a == 4) smallLight++;
                            else System.out.println("Invalid");
                        }

                        else if (q == 2) {
                            System.out.println("Your biggest problem?");
                            System.out.println("1. Distance  2. Traffic  3. Time shortage  4. Big objects");
                            int a = sc.nextInt();

                            if (a == 1) anywhereDoor++;
                            else if (a == 2) bambooCopter++;
                            else if (a == 3) timeMachine++;
                            else if (a == 4) smallLight++;
                            else System.out.println("Invalid");
                        }

                        else if (q == 3) {
                            System.out.println("What excites you most?");
                            System.out.println("1. Instant travel  2. Flying in sky  3. Time adventure  4. Mini world");
                            int a = sc.nextInt();

                            if (a == 1) anywhereDoor++;
                            else if (a == 2) bambooCopter++;
                            else if (a == 3) timeMachine++;
                            else if (a == 4) smallLight++;
                            else System.out.println("Invalid");
                        }

                        q++;
                    }
                }
        }

        // RESULT
        System.out.println("\nYour Doraemon Gadget is:");

        if (anywhereDoor >= bambooCopter && anywhereDoor >= timeMachine && anywhereDoor >= smallLight)
            System.out.println("Anywhere Door 🚪");
        else if (bambooCopter >= anywhereDoor && bambooCopter >= timeMachine && bambooCopter >= smallLight)
            System.out.println("Bamboo Copter 🚁");
        else if (timeMachine >= anywhereDoor && timeMachine >= bambooCopter && timeMachine >= smallLight)
            System.out.println("Time Machine ⏳");
        else
            System.out.println("Small Light 🔦");

        sc.close();
    }
}
package com.example.com;
import java.util.*;
import java.text.*;

// Account class
class Account {

    Scanner sc = new Scanner(System.in);

    // Formatters
    DecimalFormat df1 = new DecimalFormat("###,##0.00' Rupee'");
    DecimalFormat df2 = new DecimalFormat("###,##0.00' Dollar'");

    int CN;
    int PN;

    double CB = 2000; // Current Balance
    double SB = 1000; // Saving Balance

    void setCustomerNumber(int cn) {
        CN = cn;
    }

    void setPINNumber(int pn) {
        PN = pn;
    }

    int getCustomerNumber() {
        return CN;
    }

    int getPINNumber() {
        return PN;
    }

    void getCurrentBalance() {
        System.out.println("\nCurrent Bank Balance : " + df1.format(CB));
    }

    void getSavingBalance() {
        System.out.println("\nSavings Bank Balance : " + df2.format(SB));
    }

    void getCurrentWithdrawInput() {
        System.out.print("\nEnter Withdraw Amount: ");
        double amt = sc.nextDouble();

        if (CB >= amt) {
            calCurrentWithdraw(amt);
            System.out.println("\nTransaction Successful");
            System.out.println("New Current Account Balance : " + df1.format(CB));
        } else {
            System.out.println("\nInsufficient Balance");
        }
    }

    double calCurrentWithdraw(double amt) {
        CB = CB - amt;
        return CB;
    }

    void getSavingWithdrawInput() {
        System.out.print("\nEnter Withdraw Amount: ");
        double amt = sc.nextDouble();

        if (SB >= amt) {
            calSavingWithdraw(amt);
            System.out.println("\nTransaction Successful");
            System.out.println("New Saving Account Balance : " + df2.format(SB));
        } else {
            System.out.println("\nInsufficient Balance");
        }
    }

    double calSavingWithdraw(double amt) {
        SB = SB - amt;
        return SB;
    }
}

// Option Menu class
class OptionMenu extends Account {

    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Integer> data = new HashMap<>();

    void getLogin() {

        data.put(11111, 1111);
        data.put(11112, 2222);
        data.put(11113, 3333);
        data.put(11114, 8888);
        data.put(11115, 1111);

        while (true) {
            try {
                System.out.println("Welcome to the ATM!");
                System.out.print("\nEnter Customer Number : ");
                setCustomerNumber(sc.nextInt());

                System.out.print("Enter your PIN : ");
                setPINNumber(sc.nextInt());

                int P = getCustomerNumber();
                int Q = getPINNumber();

                if (data.containsKey(P) && data.get(P) == Q) {
                    getAccountType();
                } else {
                    System.out.println("\nWrong Credentials\n");
                }

            } catch (InputMismatchException ime) {
                System.out.println("\nEnter Only Numbers");
                sc.next();
            }
        }
    }

    void getAccountType() {
        while (true) {
            System.out.println("\nSelect Account Type : ");
            System.out.println("1 : Current Account");
            System.out.println("2 : Savings Account");
            System.out.println("3 : Exit");
            System.out.print("Choice : ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    getCurrent();
                    break;

                case 2:
                    getSaving();
                    break;

                case 3:
                    System.out.println("\nThank You for Visiting");
                    return;

                default:
                    System.out.println("\nInvalid Choice");
            }
        }
    }

    void getCurrent() {
        System.out.println("\nCurrent Account");
        System.out.println("1 : Balance Enquiry");
        System.out.println("2 : Withdraw Money");
        System.out.println("3 : Deposit Money");
        System.out.println("4 : Exit");
        System.out.print("Choice : ");

        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                getCurrentBalance();
                break;

            case 2:
                getCurrentWithdrawInput();
                break;

            case 3:
                System.out.print("\nEnter Deposit Amount: ");
                double dep = sc.nextDouble();
                CB += dep;
                System.out.println("New Current Balance : " + df1.format(CB));
                break;

            case 4:
                return;

            default:
                System.out.println("\nInvalid Choice");
        }
    }

    void getSaving() {
        System.out.println("\nSavings Account");
        System.out.println("1 : Balance Enquiry");
        System.out.println("2 : Withdraw Money");
        System.out.println("3 : Deposit Money");
        System.out.println("4 : Exit");
        System.out.print("Choice : ");

        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                getSavingBalance();
                break;

            case 2:
                getSavingWithdrawInput();
                break;

            case 3:
                System.out.print("\nEnter Deposit Amount: ");
                double dep = sc.nextDouble();
                SB += dep;
                System.out.println("New Saving Balance : " + df2.format(SB));
                break;

            case 4:
                return;

            default:
                System.out.println("\nInvalid Choice");
        }
    }
}

// Main class
public class ATM {
    public static void main(String[] args) {
        OptionMenu op = new OptionMenu();
        op.getLogin();
    }
}
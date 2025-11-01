import java.util.Scanner;

public class sumOfNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfNum = 0;
        int orignal_n = n;

        while (n > 0) {
            sumOfNum += n % 10;
            n = n / 10;

        }

        System.out.println("Sum of digits in " + orignal_n + " = " + sumOfNum);

    }

}

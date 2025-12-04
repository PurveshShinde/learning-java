import java.util.Scanner;

public class CastingDemo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number :");
        double num = sc.nextDouble();

        System.out.println("Number as Double: " + num);
        System.out.println("Numeber as Integer: " + (int)num);
        
        System.out.println("Remainder :" + (num % 5));
        sc.close();

    }

    
}

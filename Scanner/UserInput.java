import java.util.Scanner;

public class UserInput {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        
        System.out.println("Enter your height :");
        float height = sc.nextFloat();
        
        System.out.print("/n-- Outputs --/n");
        System.out.print("name: " + name);
        System.out.print("age: " + age);  
        System.out.print("height: " + height);
        
        sc.close();
    }
}

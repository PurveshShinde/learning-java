import java.util.Scanner;

public class GradeChecker {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your grade Marks : ");
        double marks = sc.nextDouble();

        if (marks < 0 || marks > 100){
            System.out.println("Invalid Marks");
        } else if (marks >= 90 && marks <=100){
            System.out.println("Grade: A");
        } else if (marks >= 75 && marks <=89){
            System.out.println("Grade: B");
        } else if (marks >= 50 && marks <=74){
            System.out.println("Grade: C");
        } else{
            System.out.println("Fail");
        }
        sc.close();
    }
    
}

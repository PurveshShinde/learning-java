import java.util.Scanner; 
public class SumN {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int j= 1; j<=n; j++){
            sum += j;
        }
        System.out.println("The sum is: " + sum);
        sc.close();
        
    }
    
}

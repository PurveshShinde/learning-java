import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Input: ");
        int i = sc.nextInt();
        for (int j =i; j<=10*i; j=j+i){
            System.out.println(j);
        }

        
    }
    
}

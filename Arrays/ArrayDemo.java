import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size : ");
        int size = sc.nextInt();

        int [] arr = new int[size]; // Create an array of given size
       
        System.out.println("Enter elements :"); 
        for(int i = 0; i< size; i++){ // Input Loop
            arr[i] = sc.nextInt();
        }
        System.out.println("Output : ");
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
         
        
    }
}

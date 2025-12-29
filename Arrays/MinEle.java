import java.util.Scanner;
public class MinEle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements of array: ");
        
        int [] arr = new int[n];
        for (int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for (int i =1; i<n; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
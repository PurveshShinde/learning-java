// Create a file LoopDemo.java. It should:

// Print numbers 1 to 10 using:
public class LoopDemo{
    public static void main(String []args){
        // for loop
        System.out.println("For Loop: ");
        for (int i = 1; i<=10; i++){
            System.out.print(i+" ");
        }
        // while loop

        System.out.println("\nWhile Loop: ");
        int j =1;
        while (j <= 10){
            System.out.print(j+" ");
            j++;
        }

        // do–while loop
        System.out.println("\nDo-While Loop: ");
        int k=1;
        do{
            System.out.print(k +" ");
            k++;
        }while (k <= 10);
    }
}


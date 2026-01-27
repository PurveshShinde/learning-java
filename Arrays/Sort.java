
public class Sort {

    public static void main(String[] args) {
        boolean isSorted = true;
        int[] arr = {10, 20, 15, 30};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println(isSorted = false);
                return;
            }
        }
        System.out.println(isSorted);
    }
}

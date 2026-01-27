
public class arrmax {

    public static void main(String[] args) {
        int[] arr = {40, 20, 60, 90, 50};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max value is :" + max);
    }

}

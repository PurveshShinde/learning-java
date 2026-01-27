
public class second {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] > min && arr[i] < secondMin) {
                secondMin = arr[i];
            }
        }
        System.err.println("Second Minimum value is :" + secondMin);
    }
}

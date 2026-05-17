
public class prefix {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        //build prefix array
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // test cases
        System.out.println(rangeSum(prefix, 1, 3));
        System.out.println(rangeSum(prefix, 0, 4));
        System.out.println(rangeSum(prefix, 2, 4));
    }

    public static int rangeSum(int[] prefix, int l, int r) {
        if (l == 0) {
            return prefix[r];
        }
        return prefix[r] - prefix[l - 1];
    }

}

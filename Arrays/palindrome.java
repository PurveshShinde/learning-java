
public class palindrome {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};

        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Array is a palindrome");
        } else {
            System.out.println("Array is not a palindrome");
        }
    }
}

package practice;

import java.util.*;

public class P1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string with capital letters:");
        String inputString = scanner.nextLine();

        StringBuilder resultString = new StringBuilder();

        for (char c : inputString.toCharArray()) {
            // Check if the character is an uppercase letter
            if (c >= 'A' && c <= 'Z') {
                // Add 32 to the ASCII value to convert to lowercase
                resultString.append((char) (c + 32));
            } else {
                // If it's not a capital letter, append it as is
                resultString.append(c);
            }
        }

        System.out.println("Original String: " + inputString);
        System.out.println("Lowercase String: " + resultString.toString());

    }
}
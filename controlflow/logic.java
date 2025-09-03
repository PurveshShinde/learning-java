/*
&& and returns True if both conditions are True and returns False otherwise.
|| or returns True if at least one of the conditions is True and False otherwise.
 */

class logic {

    public static void main(String[] args) {
        // Write your code here 💖
        int weight = 55;
        int height = 169;

        if (weight > 40 && height > 120) {
            System.out.println("Congrats! You can ride!");
        } else {
            System.out.println("Sorry, You can't ride today.");
        }

    }
}

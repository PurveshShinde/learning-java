public class cards {
    public static void main(String[] args) {
        for (int i = 1; i <= 52; i++) {
            if (i == 32) {
                System.out.println("An incorrect card was found in item 32.");
                break;
            } else {
                System.out.println("Card" + i);
            }

        }
    }
}

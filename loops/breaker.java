class breaker {
    public static void main(String[] args) {

        for (int num = 1; num <= 10; num++) {
            if (num % 2 == 0 && num % 3 == 0) {

                System.out.println("Break at : " + num);
                break;
            }
        }

    }
}
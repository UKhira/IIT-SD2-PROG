public class starPatterns {
    public static void main(String[] args) {
        for (int row = 0; row < 6; row++){
            for (int column = 0; column <= row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        int limit = 5;
        for (int row = 0; row < 6; row++){
            for (int column = 0; column <= row; column++){
                if (column >= limit) {
                    System.out.print("* ");
                    limit--;
                }
            }
            System.out.println();
        }
    }
}

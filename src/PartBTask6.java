public class PartBTask6 {
    public static void main(String[] args) {
        // Nested for loop to create triangle of asterisks
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

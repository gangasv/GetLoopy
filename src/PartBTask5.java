public class PartBTask5 {
    public static void main(String[] args) {
        // Nested for loop to create triangle of asterisks
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

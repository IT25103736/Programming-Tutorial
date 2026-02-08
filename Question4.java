public class Question4 {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= 5) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println();
        int rows = 5;
        for (int r = 1; r <= rows; r++) {

            for (int s = rows - r; s > 0; s--) {
                System.out.print("  ");
            }

            for (int c = 1; c <= r; c++) {
                System.out.print("*   ");
            }

            System.out.println();
        }
    }
}

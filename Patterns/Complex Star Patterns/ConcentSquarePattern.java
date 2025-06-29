public class ConcentSquarePattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                int minInRowCol = Math.min(i, j);
                int min2 = Math.min(n - i - 1, n - j - 1);

                int layer = Math.min(minInRowCol, min2);

                if (layer % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }

            System.out.println();

        }
    }
}

public class Sandglass {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int k = n - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 0; i--) {


             for (int j = n - 1; j >= i; j--) {
                System.out.print("*");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }

           

            System.out.println();
        }

    }
}

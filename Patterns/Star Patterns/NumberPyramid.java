public class NumberPyramid {
    public static void main(String[] args) {

        int n = 5;
        int num = 100;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(" "+num);
                num++;

                if (num>=1000) {
                    num=1;
                }
            }

            System.out.println();
        }
    }
}

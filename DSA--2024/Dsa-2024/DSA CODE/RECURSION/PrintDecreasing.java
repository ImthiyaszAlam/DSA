
public class PrintDecreasing {

    public static void printN(int n) {
        if (n == 1) {
            System.out.print(n+"  ");
            return;
        }

        System.out.print(n+"  ");

        printN(n - 1);
    }

    public static void main(String[] args) {
        int n = 20;
        printN(n);
    }

}
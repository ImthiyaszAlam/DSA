public class SwapNum {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        System.out.println("Before swapping :" + a + "&" + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("After swapping :" + a + "&" + b);

    }
}

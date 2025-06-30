public class SwapNum {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        System.out.println("Before swapping :" + a + "&" + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("After swapping :" + a + "&" + b);

      //  b6 & a5
        int d = a;   // d = 6
        a = b;       // a = 6        
        b = d;       // b = 5

        System.out.println("After Second swapping :" + a + "&" + b);

    }
}

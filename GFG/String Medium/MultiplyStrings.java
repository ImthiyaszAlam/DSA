public class MultiplyStrings {

    public static String multiplyStrings(String s1, String s2) {

        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 == 0 || n2 == 0) {
            return "0";
        }

        int nn = 1;
        int mm = 1;

        if (s1.charAt(0) == '-') {
            nn = -1;
        }

        if (s2.charAt(0) == '-') {
            mm = -1;
        }

        int isNegative = nn * mm;
        int[] result = new int[n1 + n2];

        int i1 = 0;
        int i2 = 0;

        for (int i = n1 - 1; i >= 0; i--) {
            if (s1.charAt(i) == '-')
                continue;
            int carry = 0;
            int n1Digit = s1.charAt(i) - '0';
            i2 = 0;

            for (int j = n2 - 1; j >= 0; j--) {
                if (s2.charAt(j) == '-')
                    continue;
                int n2Digit = s2.charAt(j) - '0';

            }
        }
    }

    public static void main(String[] args) {

    }
}

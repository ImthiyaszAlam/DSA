public class PalindromeString {
    public static void main(String[] args) {
        String str = "AnnA";
        String reverseString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char currentChar = str.charAt(i);
            reverseString+=currentChar;
        }

        if (str.equals(reverseString)) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}

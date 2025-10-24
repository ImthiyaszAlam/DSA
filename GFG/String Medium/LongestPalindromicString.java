public class LongestPalindromicString {

    static boolean checkPal(String str,int low,int high){
        while (low<high) {
            if (str.charAt(low)!=str.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }

        return true;
    }
    public static void main(String[] args) {
        
    }
}

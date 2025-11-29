import java.util.ArrayList;

public class PalindromSubstring {


    static boolean isPalindrome(String str,int start ,int end ){
        while (start<end) {
            if (str.charAt(start)!=str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    static ArrayList<Integer> palQueries(String s,int [][] queries){

     ArrayList<Integer> result = new ArrayList<>();

     for(int [] query:queries ){
        int start = query[0];
        int end = query[1];
        
     }
        
    }


    public static void main(String[] args) {
        
    }
}

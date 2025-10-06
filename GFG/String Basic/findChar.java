public class findChar {
    public static void main(String[] args) {
        String str = "malam";
        char k = 'a';

        for(int i=0;i<str.length();i++){
            if (str.charAt(i)==k) {
                System.out.println(i);
                return;
            }
        }
    }
}

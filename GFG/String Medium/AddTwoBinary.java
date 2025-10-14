public class AddTwoBinary {

    public static String trimLeadingZaros(String str) {
        int firstOne = str.indexOf('1');
        return (firstOne == -1 )? "0" : str.substring(firstOne);
    }


    public static String addTwoBinary(String s1,String s2){
        s1 = trimLeadingZaros(s2);
        s2=trimLeadingZaros(s2);


        if (s1.length()<s2.length()) {
            return addTwoBinary(s1, s2);
        }

        int j = s2.length()-1;
        int carry = 0;
    }

    public static void main(String[] args) {

    }
}

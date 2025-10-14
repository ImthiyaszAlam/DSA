public class AddTwoBinary {

    public static String trimLeadingZaros(String str) {
        int firstOne = str.indexOf('1');
        return (firstOne == -1 )? "0" : str.substring(firstOne);
    }

    public static void main(String[] args) {

    }
}

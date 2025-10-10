public class Concat {


    public static String concat(String s1,String s2){
        String result;
        result = s1+s2;
        return result;
    }
    public static void main(String[] args) {
        String s1 = "Al";
        String s2 = "am";
        System.out.println(concat(s1, s2));
    }
}

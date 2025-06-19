public class GroupAnagram {



    public static void groupAnagram(String str[]){

        for(int i=0;i<str.length-1;i++){
            String currentStr = str[i];
            System.out.print(currentStr+",");
        }
    }
    public static void main(String[] args) {
        String str[] = {"eat","tea","tan","ate","nat","bat"};
        groupAnagram(str);
    }
}

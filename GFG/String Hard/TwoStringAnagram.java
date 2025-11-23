public class TwoStringAnagram {

    static int remAnagram(String s1, String s2) {
        int count1[] = new int[26];
        int count2[] = new int[26];

        for (char ch : s1.toCharArray()) {
            count1[ch - 'a']++;
        }

        for (char ch : s2.toCharArray()) {
            count2[ch - 'a']++;
        }
    }

    public static void main(String[] args) {
        System.out.println(remAnagram);
    }
}
